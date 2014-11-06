/**
 * Copyright (c) 2014,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:ejb-demo
 * Package Name:org.xmwu.demo
 * File Name:CustomerBean.java
 * Date:2014年11月5日 下午1:19:43
 * 
 */
package org.xmwu.demo;

import javax.ejb.Stateless;
 /**
 * ClassName: CustomerBean <br/>
 * Description: TODO <br/>
 * Date: 2014年11月5日 下午1:19:43 <br/>
 * <br/>
 * 
 * @author xmwu(邮箱)
 * 
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */
@Stateless
public class CustomerBean implements Customer {

    @Override
    public int getAge(String name) {
        return 50;
    }

}
