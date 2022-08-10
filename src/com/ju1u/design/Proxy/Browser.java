package com.ju1u.design.Proxy;

public class Browser implements IBrowser{
    private String url;

    public Browser(String url){
        this.url = url;
    }

    public Html show(){
        System.out.println("Browser loading html from :" + url);
        return new Html(url);
    }
}
