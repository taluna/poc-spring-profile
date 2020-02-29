package com.taluna.springprofile.product.application;

import com.taluna.springprofile.product.infrastructure.gateway.ApiProduct;
import com.taluna.springprofile.product.infrastructure.gateway.ProductGateway;
import com.taluna.springprofile.product.infrastructure.gateway.dto.BasicResponse;
import org.springframework.stereotype.Service;

@Service
public class ProductUseCase {

    private final ApiProduct apiProduct;

    public ProductUseCase(ApiProduct apiProduct) {
        this.apiProduct = apiProduct;
    }

    public BasicResponse getAll(){
        return  apiProduct.getAll();
    }

}
