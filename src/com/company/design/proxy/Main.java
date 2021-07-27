package com.company.design.proxy;

import com.company.design.aop.AopBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        /*
            Browser browser = new Browser("www.naver.com");
            //현재는 캐시 기능이 없기떄문에 모두 똑같이 동작한다.
            browser.show();
            browser.show();
            browser.show();
            browser.show();
        */
        IBrowser browser = new BrowserProxy("www.naver.com");
        //캐싱 기능이 동작하여 첫번쨰만 로딩을 하고, 그 뒤엔 자신이 가진 html loading한다.
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();

         //AOP 사용하기
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },()->{
            long now = System.currentTimeMillis();
            end.set(now - start.get());
        });
        aopBrowser.show();
        System.out.println("loading time : "+ end.get());
        aopBrowser.show();
        System.out.println("loading time : "+ end.get());
    }
}
