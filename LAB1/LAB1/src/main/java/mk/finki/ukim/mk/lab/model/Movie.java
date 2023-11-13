package mk.finki.ukim.mk.lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //(automatic getter/setter annotation
public class Movie {
    public String title;
    public String summary;
    public double rating;
    private long id;
    private Production production; // Reference to Production class

//    public Movie(String title, String summary, double rating, int id, Production production) {
//    }

    public Movie(String title, String summary, double rating, Production production) {
        this.id = (long) (Math.random()*1000);
        this.title = title;
        this.summary = summary;
        this.rating = rating;
        this.production = production;
    }

}
