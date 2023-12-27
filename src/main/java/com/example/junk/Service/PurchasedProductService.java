package com.example.junk.Service;


import com.example.junk.domain.ProductEntity;
import com.example.junk.domain.PurchasedProductEntity;
import com.example.junk.domain.User;
import com.example.junk.repository.ProductRepository;
import com.example.junk.repository.PurchasedProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PurchasedProductService {

    private PurchasedProductRepository purchasedProductRepository;

    private ProductRepository productRepository;
    @Autowired
    public PurchasedProductService(PurchasedProductRepository purchasedProductRepository,
                                   ProductRepository productRepository) {
        this.purchasedProductRepository = purchasedProductRepository;
        this.productRepository = productRepository;
    }

    public void purchase(PurchasedProductEntity purchasedProductEntity) {

        purchasedProductRepository.save(purchasedProductEntity);

    }

    public ProductEntity getProductInfo(long pId) {
        System.out.println("this is pcp service");
        System.out.println(pId);
        System.out.println(" this is pId");
        if(productRepository.findById(pId).isEmpty()){
            System.out.println("받아온 pcp가 없음");
            return null;}

        return productRepository.findById(pId).get();
    }

    public List<Map<String, Object>> getOwingProduct(User user, long pcId) {
        return purchasedProductRepository.findByUser(user.getId(), pcId);
    }

}
