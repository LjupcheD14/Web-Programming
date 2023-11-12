package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.model.Movie;
import mk.finki.ukim.mk.lab.model.Production;

import org.springframework.stereotype.Component;



import java.util.ArrayList;
import java.util.List;

@Component
public class ProductionRepository {
    private List<Production> productions;

    public ProductionRepository() {
        this.productions = new ArrayList<>();
        initializeProductions();
    }

    // Initialize some movie productions
    private void initializeProductions() {
        // Initialize five sample movie productions
        Production production1 = new Production(1, "Production 1", "Country 1", "Address 1");
        Production production2 = new Production(2, "Production 2", "Country 2", "Address 2");
        Production production3 = new Production(3, "Production 3", "Country 3", "Address 3");
        Production production4 = new Production(4, "Production 4", "Country 4", "Address 4");
        Production production5 = new Production(5, "Production 5", "Country 5", "Address 5");


        // Add them to the list
        productions.add(production1);
        productions.add(production2);
        productions.add(production3);
        productions.add(production4);
        productions.add(production5);
    }

    // Return all productions in the system
    public List<Production> findAll() {
        return new ArrayList<>(productions); // Return a copy of the list to avoid modifications
    }
}

