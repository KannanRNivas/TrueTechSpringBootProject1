package com.kannanrnivas.interiew.controllers;


import com.kannanrnivas.interiew.models.ConfigModel;
import com.kannanrnivas.interiew.models.ProductModel;
import com.kannanrnivas.interiew.services.ConfigService;
import com.kannanrnivas.interiew.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Class of the api endpoint controller
 *
 * @author KannanRNivas
 */
@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @Autowired
    private ConfigService configService;
    @Autowired
    private ProductService productService;


    /**
     * Gets all the config models
     *
     * @return all the config models
     */
    @GetMapping("getconfigdetails")
    public List<ConfigModel> getconfigdetails() {
        return configService.findAll();
    }


    /**
     * Gets all the product models
     *
     * @return all the product models
     */
    @GetMapping("getproductdetails")
    public List<ProductModel> getproductdetails() {
        return productService.findAll();
    }
}
