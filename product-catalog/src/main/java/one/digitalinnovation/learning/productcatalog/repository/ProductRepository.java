package one.digitalinnovation.learning.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<digitalinnovation.one.experts.productcatalog.model.Product> findByName(String name);

}
