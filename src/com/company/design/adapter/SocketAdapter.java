package com.company.design.adapter;


public class SocketAdapter implements Electronic110V{
    //220V -> 110V
    //자신의 형태는 110V이다.
    //자신이 연결할 220V를 가지고 있어야 한다.
    private Electronic220V electronic220V;

    //디폴트생성자에서 자신이 사용할 220V를 받아야된다
    public SocketAdapter(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
