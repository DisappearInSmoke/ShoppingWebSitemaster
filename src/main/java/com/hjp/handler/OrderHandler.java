package com.hjp.handler;

import com.hjp.po.order.Order;
import com.hjp.service.order.AddressService;
import com.hjp.service.order.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author 烟消云散
 * @create 2019-11-1:26
 */
@Controller
@RequestMapping("/order")
public class OrderHandler {
    @Resource
    private OrderService os;

    @Resource
    private AddressService as;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        model.addAttribute("list",os.findAll());
        return "order";
    }

    @RequestMapping("/findOne")
    public String findOne(Model model){
        model.addAttribute("order",os.findAll());
        return "orderUpdate";
    }
    @RequestMapping("/update")
    public String update(Order order){
        os.update(order);
        return "redirect:/order/findAll";
    }

    @RequestMapping("/toInsert")
    public String toInsert(){
        return "orderInsert";
    }

    @RequestMapping("/insert")
    public String insert(Order order){
        os.insert(order);
        return "redirect:/order/findAll";
    }

    @RequestMapping("/delete")
    public String insert(int orderId){
        os.delete(orderId);
        return "redirect:/order/findAll";
    }

}
