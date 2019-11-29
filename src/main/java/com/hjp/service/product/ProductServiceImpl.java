package com.hjp.service.product;

import com.hjp.dao.product.ProductDao;
import com.hjp.po.product.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 烟消云散
 * @create 2019-11-23:58
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao pd;

    public List<Product> findAll() {
        return pd.findAll();
    }

    public List<Product> findLike(String productName) {
        return pd.findLike(productName);
    }

    public Product findOne(int productId) {
        return pd.findOne(productId);
    }

    public int insert(Product product) {
        return pd.insert(product);
    }

    public int update(Product product) {
        return pd.update(product);
    }

    public int delete(int productId) {
        return pd.delete(productId);
    }
}
