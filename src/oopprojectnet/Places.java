package oopprojectnet;

import java.io.Serializable;

/**
 *
 * @author zmcdo
 */
public class Places implements Serializable {

    /**
     *
     */
    protected String coords,

    /**
     *
     */
    name;

    /**
     *
     */
    public Places() {
        this.coords = "40.205776 -8.421398";
        this.name = "Lugar";

    }

    /**
     * Superclass of Exhibitions, SportsField, Gardens and Pubs that receives two strings as parameters
     * @param coords GPS coordinates of the specific exhibition, for example "40.208995, -8.425555"
     * @param name Name of place, for example "Museu Machado de Castro"
     */
    public Places(String coords, String name) {
        this.coords = coords;
        this.name = name;
    }
   

    /**
     * Getters and setters of Places 
     * @return 
     */
    public String getCoords() {
        return coords;
    }

    /**
     *
     * @param coords
     */
    public void setCoords(String coords) {
        this.coords = coords;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     *
     * @return
     */
    public String getArea() {
        return null;
    }
    
    /**
     *
     * @return
     */
    public String getSport() {
        return null;
    }
    
    /**
     *
     * @return
     */
    public String getPrice() {
        return null;
    }
        
    /**
     *
     * @return
     */
    public String getArtisticForm() {
        return null;
    }

    /**
     *
     * @return
     */
    public String getMinimumInput() {
        return null;
    }

    /**
     *
     * @return
     */
    public String getCapacity() {
        return null;
    }
    
    /**
     *
     * @param a
     */
    public void setArea(String a) {
    }

    /**
     *
     * @param a
     */
    public void setSport(String a) {
    }

    /**
     *
     * @param a
     */
    public void setPrice(String a) {
    }   

    /**
     *
     * @param a
     */
    public void setArtisticForm(String a) {
    }

    /**
     *
     * @param a
     */
    public void setMinimumInput(String a) {
    }

    /**
     *
     * @param a
     */
    public void setCapacity(String a) {
        
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Places{" +
                "coords='" + coords + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}