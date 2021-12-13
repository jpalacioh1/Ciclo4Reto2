package Reto3_Web.interfaces;

import Reto3_Web.modelo.CleaningProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceCleaningProduct extends MongoRepository<CleaningProduct, Integer> {

}
