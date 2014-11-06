package org.xmwu.demo;

import javax.ejb.Remote;

@Remote
public interface Hello {
    public String hello(String name);
    public int add(int a, int b);
}
