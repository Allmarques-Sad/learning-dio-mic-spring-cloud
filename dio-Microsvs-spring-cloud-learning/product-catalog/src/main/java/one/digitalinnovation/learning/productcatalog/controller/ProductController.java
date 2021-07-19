package one.digitalinnovation.learning.productcatalog.controller;

import one.digitalinnovation.learning.productcatalog.model.Product;
import one.digitalinnovation.learning.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping
    public Iterable<one.digitalinnovation.learning.productcatalog.repository.Product> list() {
        final Iterable<one.digitalinnovation.learning.productcatalog.repository.Product> all = productRepository.findAll();
        return all;
    }

    @RequestMapping(value = "/{id}")
    public Optional<Product> findById(@PathVariable("id") Integer id) {
        return productRepository.findById(id);
    }

    @RequestMapping(value = "/name/{name}")
    public List<one.digitalinnovation.learning.productcatalog.model.Product> findByName(@PathVariable("name") String name) {
        return productRepository.findByName(name);
    }

}
