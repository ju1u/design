package com.ju1u.design.Aop;

import com.ju1u.design.Proxy.Html;
import com.ju1u.design.Proxy.IBrowser;

public class AopBrowser implements IBrowser {
    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;

    public AopBrowser(String url, Runnable before, Runnable after){
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public Html show() {
        before.run();

        if(this.html == null){
            this.html = new Html(url);
            System.out.println("AopBrowser loading html from url : "+url);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        after.run();
        System.out.println("AopBrowser html cache : "+url);
        return null;
    }
}
