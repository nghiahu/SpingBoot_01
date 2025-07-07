package com.example.demo_01.controller;

import com.example.demo_01.entity.Product;
import com.example.demo_01.repo.product.ProductRepository;
import com.example.demo_01.repo.product.ProductRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("listProduct")
    public String listProduct(Model model) {
        model.addAttribute("listProduct", productRepository.findAll());
        return "Bài 6";
    }

    @GetMapping("add")
    public String addProduct(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct";
    }

    @PostMapping("saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productRepository.save(product);
        return "redirect:/listProduct";
    }

    @GetMapping("delete")
    public String deleteProduct(@RequestParam("id") Long id) {
        productRepository.delete(id);
        return "redirect:/listProduct";
    }

    @GetMapping("update")
    public String updateProduct(@RequestParam("id") Long id, Model model) {
        Product product = productRepository.findById(id);
        model.addAttribute("product", product);
        return "updateProduct";
    }

    @PostMapping("editProduct")
    public String editProduct(@ModelAttribute("product") Product product) {
        productRepository.update(product);
        return "redirect:/listProduct";
    }
}
