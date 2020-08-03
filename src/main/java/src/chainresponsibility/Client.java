package src.chainresponsibility;

import src.chainresponsibility.middleware.Middleware;
import src.chainresponsibility.middleware.RoleCheckMiddleware;
import src.chainresponsibility.middleware.ThrottlingMiddleware;
import src.chainresponsibility.middleware.UserExistsMiddleware;
import src.chainresponsibility.server.Server;

public class Client {
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server)) //
                .linkWith(new RoleCheckMiddleware());

        server.setMiddleware(middleware);
    }

    private static void attempt(String email, String password) {
        boolean success = server.logIn(email, password);
        System.out.println("Success: " + success);
        System.out.println("===============================");
    }

    public static void main(String[] args) throws Exception {
        init();

        attempt("test@example.com", "wrong");
        attempt("user@example.com", "wrong");
        attempt("user@example.com", "user_pass");
        attempt("admin@example.com", "wrong");
        attempt("admin@example.com", "admin_pass");
    }

}