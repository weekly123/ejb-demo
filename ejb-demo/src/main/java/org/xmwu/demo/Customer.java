/**
 * Project Name:ejb-demo
 * Package Name:org.xmwu.demo
 * File Name:Customer.java
 * Date:2014年11月5日 下午1:17:50
 * 
 */
package org.xmwu.demo;

import javax.ejb.Local;
 /**
 * ClassName: Customer <br/>
 * Description: TODO <br/>
 * Date: 2014年11月5日 下午1:17:50 <br/>
 * <br/>
 * 
 * @author xmwu(邮箱)
 * 
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */
@Local
public interface Customer {
    public int getAge(String name);
}
