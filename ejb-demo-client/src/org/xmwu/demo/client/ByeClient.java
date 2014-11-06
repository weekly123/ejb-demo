/**
 * Copyright (c) 2014,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:ejb-demo-client
 * Package Name:org.xmwu.demo.client
 * File Name:ByeClient.java
 * Date:2014年11月5日 下午6:35:29
 * 
 */
package org.xmwu.demo.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.xmwu.demo.Bye;
import org.xmwu.demo.Hello;

 /**
 * ClassName: ByeClient <br/>
 * Description: TODO <br/>
 * Date: 2014年11月5日 下午6:35:29 <br/>
 * <br/>
 * 
 * @author xmwu(邮箱)
 * 
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public class ByeClient {
    public static void main(String args[]) throws Exception {
        //System.out.println("StatelessSession bean says : " + returnMessage());
        final Properties env = new Properties();
        env.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        env.put("jboss.naming.client.ejb.context", true);
//        env.put("remote.connectionprovider.create.options.org.xnio.Options.SSL_ENABLED", "false");
//        env.put("remote.connections","default");
//        env.put("remote.connection.default.host", "localhost");
//        env.put("remote.connection.default.port", "4447");
        
        InitialContext ic = new InitialContext(env);
        Bye bye = (Bye) ic.lookup("ejb:/ejb-demo//ByeBean!org.xmwu.demo.Bye");
        //Hello sless = (Hello) ic.lookup("java:module/HelloBean");
        System.out.println(bye.bye());
        return;
    }
}
