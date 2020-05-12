package com.kannanrnivas.interiew.services;

import com.kannanrnivas.interiew.models.ProductModel;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Class for product service
 *.
 * @author KannanRNivas
 */
@Service
public class ProductService {

    /**
     * Gets all the product models
     *
     * @return all the product models
     */
    public List<ProductModel> findAll() {

        List<ProductModel> list = new LinkedList<>();
        IntStream.range(1, 10).forEach(
                id -> {
                    list.add(new ProductModel(id, "Product " + id));
                }
        );

        return list;
    }
}
