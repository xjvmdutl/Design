package com.company.design.facade;

public class Reader {

    private String fileName;

    public Reader(String fileName){
        this.fileName = fileName;
    }

    public  void fileConnect(){
        //파일 연결
        String msg = String.format("Reader %s 로 연결합니다.",fileName);
        System.out.println(msg);
    }

    public  void fileRead(){
        //내용 읽기
        String msg = String.format("Reader %s 의 내용을 읽어 옵니다.",fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        //파일 연결 끊기
        String msg = String.format("Reader %s 로 연결 종료 합니다.",fileName);
        System.out.println(msg);
    }

}
