package com.taluna.springprofile.product.interfaces.rest;

import com.taluna.springprofile.product.application.ProductUseCase;
import com.taluna.springprofile.product.infrastructure.gateway.dto.BasicResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/search")
public class ProductController {

    private final ProductUseCase useCase;

    public ProductController(ProductUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping("/products")
    public BasicResponse getAllProducts() {
        return useCase.getAll();
    }

}
