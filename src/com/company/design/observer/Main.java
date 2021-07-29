package com.company.design.observer;

public class Main {
    public static void main(String[] args) {
        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            //이벤트를 전달할 일이 있을경우 listener를 등록을 해두고 거기에 대해 이벤트를 전달해 주는 형태이다
            @Override
            public void clickEvent(String event) {

                System.out.println(event);
            }
        });
        button.click("메시지 전달 : click1");
        //특정 이벤트가 발생했을때 clickEvent라는 특정 옵저버를 통해서 전달해 준다.

        button.click("메시지 전달 : click2");
        button.click("메시지 전달 : click3");
        button.click("메시지 전달 : click4");
        button.click("메시지 전달 : click5");
    }
}
