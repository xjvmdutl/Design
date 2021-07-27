package com.company.design.adapter;

public class Main {
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);//헤어 드라이어 온

        Cleaner cleaner = new Cleaner();

        Electronic110V adapter = new SocketAdapter(cleaner);//어뎁터를 통해 220V 짜리를 연결한다.
        connect(adapter);
        //connect(cleaner);//문제가 생긴다 -> 돼지코가 필요(어탭터 필요)

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);

        //서로 비슷하지만 인터페이스가 맞지 않을때 가운데 인터페이스를 두어 맞추는 것을 Adapter 패턴이라고 한다.

    }
    //콘센트
    public static void connect(Electronic110V electronic110V){
        //110V만 받아서 사용하는 콘센트가 존재
        electronic110V.powerOn();
    }
}
