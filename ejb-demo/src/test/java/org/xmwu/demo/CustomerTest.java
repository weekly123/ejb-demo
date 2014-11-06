/**
 * Copyright (c) 2014,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:ejb-demo
 * Package Name:org.xmwu.demo
 * File Name:CustomerTest.java
 * Date:2014年11月5日 下午1:25:32
 * 
 */
package org.xmwu.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

 /**
 * ClassName: CustomerTest <br/>
 * Description: TODO <br/>
 * Date: 2014年11月5日 下午1:25:32 <br/>
 * <br/>
 * 
 * @author xmwu(邮箱)
 * 
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public class CustomerTest {
    @Test
    public void getAgeTest(){
        Customer customer = new CustomerBean();
        assertEquals(50,customer.getAge("xiaoming"));
    }

}
