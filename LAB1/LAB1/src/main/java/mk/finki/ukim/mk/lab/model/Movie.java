package mk.finki.ukim.mk.lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //(automatic getter/setter annotation
@AllArgsConstructor //automatic constructor
public class Movie {
    public String title;
    public String summary;
    public double rating;
    private long id;
    private Production production; // Reference to Production class

//    public Movie(String title, String summary, double rating, int id, Production production) {
//    }

    public Production getProduction() {
        return production;
    }

    public void setProduction(Production production) {
        this.production = production;
    }
}
