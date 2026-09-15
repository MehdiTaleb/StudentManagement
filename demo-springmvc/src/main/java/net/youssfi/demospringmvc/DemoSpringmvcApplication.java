package net.youssfi.demospringmvc;

import net.youssfi.demospringmvc.entities.Product;
import net.youssfi.demospringmvc.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringmvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringmvcApplication.class, args);
    }

    //@Autowired
    //private ProductRepository productRepository ;

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                    .name("Computer")
                    .price(450.00)
                    .quantity(55.00)
                    .build());
            productRepository.save(Product.builder()
                    .name("Smart Phone")
                    .price(250.00)
                    .quantity(25.00)
                    .build());
            productRepository.save(Product.builder()
                    .name("tele")
                    .price(480.00)
                    .quantity(5.00)
                    .build());
        };
    }


}
