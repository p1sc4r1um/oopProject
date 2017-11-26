package oopprojectnet;
public class Gardens extends Parks {
    private String area;
    public Gardens() {
        this.area = "520"; //in m^2
    }

    /**
     * Class to create a garden which is a place that receives 3 strings as parameters
     * @param coords GPS coordinates of the specific exhibition, for example "40.208995, -8.425555"
     * @param name Garden name, for example "Parque Verde"
     * @param area Number in KM^2 of the garden
     */
    public Gardens(String coords, String name, String area) {
        super(coords,name);
        this.area = area;
    }
    @Override
    public String getArea() {
        return area;
    }
    @Override
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String getCoords() {
        return coords;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Gardens{" +
                "area='" + area + '\'' +
                ", coords='" + coords + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}