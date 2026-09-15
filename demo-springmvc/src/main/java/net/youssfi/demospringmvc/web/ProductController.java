package net.youssfi.demospringmvc.web;

import org.springframework.ui.Model;
import net.youssfi.demospringmvc.entities.Product;
import net.youssfi.demospringmvc.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/index")
    public String index(Model model) {

        List<Product> products = productRepository.findAll();

        model.addAttribute("ListProduits", products);

        return "products";
    }
}
