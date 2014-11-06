/**
 * Copyright (c) 2014,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:ejb-demo
 * Package Name:org.xmwu.demo.client
 * File Name:HelloClient.java
 * Date:2014年11月5日 下午1:38:56
 * 
 */
package org.xmwu.demo.client;


import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.xmwu.demo.Hello;
 /**
 * ClassName: HelloClient <br/>
 * Description: TODO <br/>
 * Date: 2014年11月5日 下午1:38:56 <br/>
 * <br/>
 * 
 * @author xmwu(邮箱)
 * 
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public class HelloClient {
    public static void main(String args[]) throws NamingException {
        final Properties env = new Properties();
        env.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        env.put("jboss.naming.client.ejb.context", true);
//        env.put("remote.connectionprovider.create.options.org.xnio.Options.SSL_ENABLED", "false");
//        env.put("remote.connections","default");
//        env.put("remote.connection.default.host", "localhost");
//        env.put("remote.connection.default.port", "4447");
        
        InitialContext ic = new InitialContext(env);
        Hello sless = (Hello) ic.lookup("ejb:/ejb-demo//HelloBean!org.xmwu.demo.Hello");
        //Hello sless = (Hello) ic.lookup("java:module/HelloBean");
        System.out.println(sless.add(1,1));
        System.out.println(sless.hello("xiaoming"));
        //System.out.println("returnMessage():" + returnMessage());
        //System.out.println("StatelessSession bean says : " + returnMessage());
    }

   
}
