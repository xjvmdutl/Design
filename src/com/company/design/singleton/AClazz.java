package com.company.design.singleton;

public class AClazz {//class가 예약어랑 clazz로 사용하기도 한다.
    private SocketClient socketClient;

    public AClazz(){
        //this.socketClient = new SocketClient();//불가능 , default생성자 막아서
        this.socketClient = SocketClient.getInstance();
        //this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
