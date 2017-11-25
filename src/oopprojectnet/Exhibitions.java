package oopprojectnet;
public class Exhibitions extends Places {
    private String artisticForm, price;

    public Exhibitions() {
        this.coords = "40.208995, -8.425555";
        this.name = "Machado de Castro";
        artisticForm = "history";
        price = "10"; // in €
    }

    /**
     * Class to create an exhibition which is a place that receives 4 Strings as parameters
     *
     * @param coords GPS coordinates of the specific exhibition, for example "40.208995, -8.425555"
     * @param name Exhibition name, for example "Museu Machado de Castro"
     * @param artisticForm Artistic type of that exhibition, for example "history"
     * @param price Price to enter the museum, in euros, for example "10 euros"
     * @return nothing
     */
    public Exhibitions(String coords,String name, String artisticForm, String price) {
        super(coords, name);
        this.artisticForm = artisticForm;
        this.price = price;
    }

    public String getArtisticForm() {
        return artisticForm;
    }

    public void setArtisticForm(String artisticForm) {
        this.artisticForm = artisticForm;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Exhibitions{" +
                "artisticForm='" + artisticForm + '\'' +
                ", price='" + price + '\'' +
                ", coords='" + coords + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}