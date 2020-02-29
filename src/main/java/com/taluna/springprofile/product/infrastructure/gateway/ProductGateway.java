package com.taluna.springprofile.product.infrastructure.gateway;

import com.taluna.springprofile.product.infrastructure.gateway.dto.BasicResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
@Profile("!mock")
public class ProductGateway implements ApiProduct {

    @Value("${base_url}")
    private String baseURL;

    @Override
    public BasicResponse getAll() {

        var webClient = WebClient.builder()
                .baseUrl(baseURL)
                .build();

        return webClient
                .get()
                .retrieve()
                .bodyToMono(BasicResponse.class)
                .block();
    }

    public String getBaseURL(){
        return this.baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }
}