public class SportsField extends Parks {
    private String sport;
    public SportsField() {
        this.coords = "40.210482, -8.416530";
        this.name = "Campo Santa Cruz";
        this.sport = "football";
    }

    /**
     * Class to create a Sport Field which is a place that receives 3 Strings as parameters
     * @param coords GPS coordinates of the specific exhibition, for example 40.210482, -8.416530
     * @param name Sports Field name, for example "Campo Santa Cruz"
     * @param sport area of the field in m^2
     */
    public SportsField(String coords, String name, String sport) {
        super(coords,name);
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "SportsField{" +
                "sport='" + sport + '\'' +
                ", coords='" + coords + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}