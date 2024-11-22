package com.probando.crud.product;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductController {

    private final ProductService productService;

	@Autowired
	public ProductController(ProductService productService){
		this.productService = productService;
	}
	

	@GetMapping
	public List<Product> getProducts(){
		return productService.getProducts();
	}

}
