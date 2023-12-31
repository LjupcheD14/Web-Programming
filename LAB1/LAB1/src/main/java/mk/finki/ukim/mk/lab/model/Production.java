package mk.finki.ukim.mk.lab.model;
public class Production {
    private Long id;
    private String name;
    private String country;
    private String address;

    public Production(String name, String country, String address) {
        this.id = (long) (Math.random()*1000);
        this.name = name;
        this.country = country;
        this.address = address;
    }
    @Override
    public String toString() {
        return id +" "+ name +" "+ country +" "+ address;
    }

    public Object getId() {
        return id;
    }
}

