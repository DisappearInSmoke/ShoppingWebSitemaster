package com.hjp.handler;

import com.hjp.po.Product;
import com.hjp.service.ProductService;
import com.hjp.service.StatusService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/selectAll")
    public String findAll(Model model){
        model.addAttribute("productList",ps.findAll());
        return "select";
    }
    @RequestMapping("/findLike")
    public String findLike(Model model,String productName){
        model.addAttribute("productList",ps.findLike(productName));
        return "select";
    }
    @RequestMapping("/selectOne")
    public String findOne(Model model, int productId){
        model.addAttribute("product",ps.findOne(productId));
        model.addAttribute("statusList", ss.findAll());
        return "update";
    }
    @RequestMapping("/toInsert")
    public String toInsert(Model model){
        model.addAttribute("statusList", ss.findAll());
        return "insert";
    }
    @RequestMapping("/insert")
    public String insert(Product product){
        ps.insert(product);
        return "redirect:/selectAll";
    }
    @RequestMapping("/update")
    public String update(Product product){
        ps.update(product);
        return "redirect:/selectAll";
    }
    @RequestMapping("/delete")
    public String delete(int productId){
        ps.delete(productId);
        return "redirect:/selectAll";
    }
}
