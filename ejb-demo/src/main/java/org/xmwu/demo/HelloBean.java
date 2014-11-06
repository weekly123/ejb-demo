package org.xmwu.demo;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelloBean implements Hello {
    @EJB
    Customer customer;
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public HelloBean(){
        
    }
    public String hello(String name) {
        return "hello, world!"+name +",your age is "+customer.getAge(name);
    }
    public int add(int a,int b){
        return a+b;
    }
}
