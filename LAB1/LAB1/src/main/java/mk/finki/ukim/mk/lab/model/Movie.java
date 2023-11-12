package mk.finki.ukim.mk.lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.management.ConstructorParameters;

@Data //(automatic getter/setter annotation
@AllArgsConstructor //automatic constructor
public class Movie {
    public String title;
    public String summary;
    public double rating;
    private long id;
//    private Production production; // Reference to Production class

//    public Production getProduction() {
//        return production;
//    }
//
//    public void setProduction(Production production) {
//        this.production = production;
//    }
}
