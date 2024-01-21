package com.hoiddev.hoidhubapi.Api.Response.Home;

public class GenericHomeResponse {

    private String label;
    private String icon;
    private String route;

    // Constructor
    public GenericHomeResponse(String label, String icon, String route) {
        this.label = label;
        this.icon = icon;
        this.route = route;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

}
