package com.slsb;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class ReactBean
 */
@Stateless

public class ReactBean6 implements ReactBeanRemote, ReactBeanLocal {

    /**
     * Default constructor. 
     */
    public ReactBean6() {
        // TODO Auto-generated constructor stub
    }
    public String getUserInfo(String PNR){
    	return "VIP用户";
    }

}
