package com.taluna.springprofile.product.infrastructure.gateway;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.taluna.springprofile.product.infrastructure.gateway.dto.BasicResponse;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
@Service
@Profile("mock")
public class MockProductGateway implements ApiProduct {

    @Override
    public BasicResponse getAll()  {
        ObjectMapper objectMapper = new ObjectMapper();
        BasicResponse response = null;
        try {
            response = objectMapper.readValue(new File("src/main/resources/mock/all-products.json"), BasicResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
