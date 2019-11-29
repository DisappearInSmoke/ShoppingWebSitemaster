package com.hjp.handler;

import com.hjp.service.consumer.ConsumerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author 烟消云散
 * @create 2019-11-16:48
 */
@Controller
public class LogInHandler {
    @Resource
    private ConsumerService cs;
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
        return "index";
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
