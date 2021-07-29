package com.company.design.facade;

public class Main {
    public static void main(String[] args) {
        //Facade 사용 x
        Ftp ftpClient = new Ftp("www.foo.co.kr",22,"/home/etc");
        ftpClient.connect();//ftp연결
        ftpClient.moveDirectory();//이동

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();//파일 연결
        writer.write();//파일 쓰기

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();//파일 연결
        reader.fileRead();//파일 읽기

        reader.fileDisconnect();//파일 연결 종료
        writer.fileDisConnect();//파일 연결 종료
        ftpClient.disConnect();//연결 종료
        //클라이언트가 모든 의존성을 가지고 있다.문제

        SftpClient sftpClient = new SftpClient("www.foo.co.kr",22,"/home/etc","text.tmp");
        //Facade객체를 통해 안에 존재하는 복잡한 의존성을 가진 것들의 새로운 인터페이스 형태로 제공한다.
        //기능 자체는 sftpClient가 제공하기 때문에 코드도 짧아진다.
        sftpClient.connect();
        sftpClient.writer();
        sftpClient.read();
        sftpClient.disConnect();

    }
}
