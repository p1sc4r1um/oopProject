package oopprojectnet;
public class Places {
    protected String coords, name;
    public Places() {
        this.coords = "40.205776 -8.421398";
        this.name = "Lugar";

    }

    /**
     * Superclass of Exhibitions, SportsField, Gardens and Pubs that receives two strings as parameters
     * @param coords GPS coordinates of the specific exhibition, for example "40.208995, -8.425555"
     * @param name Name of place
     */
    public Places(String coords, String name) {
        this.coords = coords;
        this.name = name;
    }


    public String getCoords() {
        return coords;
    }

    public void setCoords(String coords) {
        this.coords = coords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Places{" +
                "coords='" + coords + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}