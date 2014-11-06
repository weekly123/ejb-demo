/**
 * Project Name:ejb-demo
 * Package Name:org.xmwu.demo
 * File Name:Bye.java
 * Date:2014年11月5日 下午6:31:43
 * 
 */
package org.xmwu.demo;

import javax.ejb.Remote;

 /**
 * ClassName: Bye <br/>
 * Description: TODO <br/>
 * Date: 2014年11月5日 下午6:31:43 <br/>
 * <br/>
 * 
 * @author xmwu(邮箱)
 * 
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */
@Remote
public interface Bye {
    public String bye();
}
