package com.hjp.handler;


import com.hjp.po.product.Product;
import com.hjp.service.product.ProductService;
import com.hjp.service.product.StatusService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author 烟消云散
 * @create 2019-11-0:05
 */
@Controller
public class ProductHandler {
    @Resource
    private ProductService ps;
    @Resource
    private StatusService ss;


    /**
     * 查询全部
     * @param model
     * @return
     */
    @RequestMapping("/selectAll")
    public String findAll(Model model){
        model.addAttribute("productList",ps.findAll());
        return "select";
    }

    /**
     * 模糊查询
     * @param model
     * @param productName
     * @return
     */
    @RequestMapping("/findLike")
    public String findLike(Model model,String productName){
        model.addAttribute("productList",ps.findLike(productName));
        return "select";
    }

    /**
     * 查询单个
     * @param model
     * @param productId
     * @return
     */
    @RequestMapping("/selectOne")
    public String findOne(Model model, int productId){
        model.addAttribute("product",ps.findOne(productId));
        model.addAttribute("statusList", ss.findAll());
        return "update";
    }

    /**
     * 跳转添加页面
     * @param model
     * @return
     */
    @RequestMapping("/toInsert")
    public String toInsert(Model model){
        model.addAttribute("statusList", ss.findAll());
        return "insert";
    }

    /**
     * 添加
     * @param product
     * @return
     */
    @RequestMapping("/insert")
    public String insert(Product product){
        ps.insert(product);
        return "redirect:/selectAll";
    }

    /**
     * 修改
     * @param product
     * @return
     */
    @RequestMapping("/update")
    public String update(Product product){
        ps.update(product);
        return "redirect:/selectAll";
    }

    /**
     * 删除
     * @param productId
     * @return
     */
    @RequestMapping("/delete")
    public String delete(int productId){
        ps.delete(productId);
        return "redirect:/selectAll";
    }
}
