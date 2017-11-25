package oopprojectnet;
abstract class Parks extends Places {
    protected String coords, name;
    public Parks() {
        this.coords = "40.205776 -8.421398";
        this.name = "Lugar";

    }
    public Parks(String coords, String name) {
        this.coords = coords;
        this.name = name;
    }
}