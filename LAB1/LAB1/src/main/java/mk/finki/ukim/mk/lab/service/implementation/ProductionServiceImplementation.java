package mk.finki.ukim.mk.lab.service.implementation;
import java.util.List;

import mk.finki.ukim.mk.lab.model.Production;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mk.finki.ukim.mk.lab.repository.ProductionRepository;
import mk.finki.ukim.mk.lab.service.ProductionService;
@Service
public class ProductionServiceImplementation implements ProductionService {
    private final ProductionRepository productionRepository;

    @Autowired
    public ProductionServiceImplementation(ProductionRepository productionRepository) {
        this.productionRepository = productionRepository;
    }

    @Override
    public List<Production> findAll(){
        return productionRepository.findAll();
    }
}
