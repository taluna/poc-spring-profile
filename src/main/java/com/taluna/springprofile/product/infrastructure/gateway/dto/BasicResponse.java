package com.taluna.springprofile.product.infrastructure.gateway.dto;

import com.taluna.springprofile.product.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicResponse {
    List<Product> products;
}
