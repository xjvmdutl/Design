package com.company.design.singleton;

public class SocketClient {
    //한번 열었던 소켓으로 계속 통신 ( 싱글톤)
    private static SocketClient socketClient = null;

    private SocketClient(){
        //기본 생성자는 private로 막아야 한다.
    }

    public static SocketClient getInstance(){
        //어떠한 클래스에서도 호출이 가능한 메소드
        //현재 객체가 null인지 체크
        if(socketClient == null){
           socketClient = new SocketClient();//생성
        }
        return socketClient;//있는경우에는 그냥 있는거 제공
   }

   public void connect(){
       System.out.println("connect");
   }
}
