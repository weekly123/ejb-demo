/**
 * Copyright (c) 2014,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:ejb-demo
 * Package Name:org.xmwu.demo
 * File Name:ByeBean.java
 * Date:2014年11月5日 下午6:31:19
 * 
 */
package org.xmwu.demo;

import javax.ejb.EJB;
import javax.ejb.Stateless;

 /**
 * ClassName: ByeBean <br/>
 * Description: TODO <br/>
 * Date: 2014年11月5日 下午6:31:19 <br/>
 * <br/>
 * 
 * @author xmwu(邮箱)
 * 
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */
@Stateless
public class ByeBean implements Bye {
    @EJB
    Customer customer;
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String bye(){
        return "BYE"+customer.getAge("a");
    }
}
