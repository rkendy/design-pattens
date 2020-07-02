package src.proxy;

public class Client {
    public static void main(String[] args) {
        ServiceInterface service = new Proxy();
        getVideo("Movie ABC", service);
        getVideo("Movie 123", service);
        getVideo("Movie ABC", service);
    }

    private static void getVideo(String id, ServiceInterface service) {
        System.out.println("=== Get " + id);
        String result = service.getVideo(id);
        System.out.println("=== Done: " + result + "\n");
    }

}