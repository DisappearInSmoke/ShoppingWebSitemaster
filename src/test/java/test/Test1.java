package test;

import com.hjp.dao.ConsumerDao;
import com.hjp.po.Consumer;
import com.hjp.service.ConsumerService;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;

/**
 * @author 烟消云散
 * @create 2019-11-14:51
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-beans.xml")
public class Test1 {
    @Resource
    private ConsumerDao ss;
    @org.junit.Test
    public void text(){
        //1. 原始字符串
        String pwd = "1";
        //2.加密成新的字符串 md5
        String s = DigestUtils.md5DigestAsHex(pwd.getBytes());
        System.out.println(s);
    }

    @org.junit.Test
    public void text1(){
        Consumer consumer = ss.findOne("小一","123456798");
        System.out.println(consumer);
    }

}
