package oopprojectnet;
abstract class Parks extends Places {
    protected String coords, name;
    public Parks() {
        this.coords = "40.205776 -8.421398";
        this.name = "Lugar";

    }
    /**
     * Constructor of Parks (places subclass and sportsfield/garden superclass), receives two strings as arguments
     * @param coords coords of the park, could be "40.205776 -8.421398"
     * @param name name of the park, could be "green park"
     */
    public Parks(String coords, String name) {
        this.coords = coords;
        this.name = name;
    }

    /**
     * Getters of Parks
    */
    @Override
    public String getCoords() {
        return coords;
    }
    @Override
    public String getName() {
        return name;
    }
    
    
}