package net.youssfi.demospringmvc.repo;

import net.youssfi.demospringmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
