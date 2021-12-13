package Reto2_Web.interfaces;

import Reto2_Web.modelo.CleaningProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceCleaningProduct extends MongoRepository<CleaningProduct, Integer> {

}
