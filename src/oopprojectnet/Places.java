package oopprojectnet;

import java.io.Serializable;

public class Places implements Serializable {
    protected String coords, name;
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

    public void setCoords(String coords) {
        this.coords = coords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getArea() {
        return null;
    }
    
    public String getSport() {
        return null;
    }
    
    public String getPrice() {
        return null;
    }
        
    public String getArtisticForm() {
        return null;
    }
    public String getMinimumInput() {
        return null;
    }
    public String getCapacity() {
        return null;
    }
    
    public void setArea(String a) {
    }
    public void setSport(String a) {
    }
    public void setPrice(String a) {
    }   
    public void setArtisticForm(String a) {
    }
    public void setMinimumInput(String a) {
    }
    public void setCapacity(String a) {
        
    }


    @Override
    public String toString() {
        return "Places{" +
                "coords='" + coords + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}