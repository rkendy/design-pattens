package src.builder.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Some address";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }

}