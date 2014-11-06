package org.xmwu.demo;


import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by xmwu on 2014/11/5.
 */
public class HelloBeanTest {
    
    @Test
    public void addTest(){
        HelloBean hb = new HelloBean();
        assertEquals(2,hb.add(1, 1));
        
    }
//    @Test
//    public void helloTest(){
//        HelloBean hb = new HelloBean();
//        hb.setCustomer(new CustomerBean());
//        assertEquals("hello, world!xiaoming,your age is 50",hb.hello("xiaoming"));
//    }
}
