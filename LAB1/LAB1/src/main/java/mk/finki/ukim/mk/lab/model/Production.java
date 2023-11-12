package mk.finki.ukim.mk.lab.model;
public class Production {
    private long id;
    private String name;
    private String country;
    private String address;

    public Production(int id, String name, String country, String address) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.address = address;
    }

    @Override
    public String toString() {
        return id +" "+ name +" "+ country +" "+ address;
    }
}

