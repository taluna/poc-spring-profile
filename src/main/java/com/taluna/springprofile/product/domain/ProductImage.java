package com.taluna.springprofile.product.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductImage {
    private String name;
    private String smallUrl;
    private String mediumUrl;
    private String largeUrl;
}
