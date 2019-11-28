package com.hjp.handler;


import com.hjp.po.Product;
import com.hjp.service.ConsumerService;
import com.hjp.service.ProductService;
import com.hjp.service.StatusService;
import org.apache.ibatis.annotations.Param;
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
    @Resource
    private ConsumerService cs;

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

    /**
     * 查询全部用户
     * @param model
     * @return
     */
    @RequestMapping("/loginAll")
    public String login(Model model){
        model.addAttribute("con",cs.findAll());
        return "loginAll";
    }
    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String Login(String consumerUserName,String consumerPassword){

        if(null!=cs.findOne(consumerUserName,consumerPassword)){
            System.out.println("登录成功");
            return "redirect:/selectAll";
        }else{
            System.out.println("登录失败");
        }
        return "login";
    }
}
