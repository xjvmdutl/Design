package com.company.design.proxy;

public class Browser implements IBrowser {//Browser이기 떄문에 IBrowser 구현해야된다.

    private  String url;

    public  Browser(String url){
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("browser loading html from : " + url);
        return new Html(url);//새로운 HTML 파일을 준다.
    }
}
