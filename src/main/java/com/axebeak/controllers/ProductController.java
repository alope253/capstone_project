package com.axebeak.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.axebeak.model.Product;
import com.axebeak.services.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/product-list", method=RequestMethod.GET)
	public String getProductList(ModelMap model) throws Exception {
		Iterable<Product> prods = productService.findAll();
		model.put("products", prods);
		return "product-list";
	}
	
	@RequestMapping(value="/delete-product/{id}")
	public ModelAndView deleteProduct(ModelMap model, @PathVariable("id") Integer id) {
		Product p = productService.getProductById(id);
		productService.deleteProduct(p);
		model.put("deleted", p.getTitle());
		return new ModelAndView("redirect:/product-list", model); 
	}
	
	//add product page interaction
	@GetMapping("/add-product")
    public String newProductForm(ModelMap model) {
        return "add-product";
    }

    @PostMapping("/add-product")
    public RedirectView createNewProduct(ModelMap model, Principal principal, Product prod) {
        productService.addProduct(prod);
        return new RedirectView("product-list");
    }
    
    //edit product page interaction
    @GetMapping("/edit-product/{id}")
    public String updateTaskForm(ModelMap model, @PathVariable("id") Integer id) {
        Product prod = productService.getProductById(id);
        model.put("product", prod);
        return "edit-product";
    }

    @PostMapping("/edit-product/{id}")
    public RedirectView updateTask(Principal principal, Product prod, @PathVariable("id") Integer id) {
    	productService.updateProduct(prod);
        return new RedirectView("/product-list");
    }
}
