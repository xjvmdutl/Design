package com.company.design.facade;

public class Writer {

    private String fileName;

    public Writer(String fileName){
        this.fileName = fileName;
    }

    public void fileConnect(){
        //파일 연결
        String msg = String.format("Reader %s 로 연결합니다.",fileName);
        System.out.println(msg);
    }

    public void fileDisConnect(){
        //파일 연결 끊기
        String msg = String.format("Reader %s 로 연결 종료 합니다.",fileName);
        System.out.println(msg);
    }
    
    public void write(){
        //파일 쓰기
        String msg = String.format("Reader %s 로 파일쓰기를 합니다",fileName);
        System.out.println(msg);
    }
}
