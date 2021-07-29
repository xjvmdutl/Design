package com.company.design.facade;

public class SftpClient {
    //facade
    //모든 의존성은 해당 클라이언트가 가지게 한다.
    private Ftp ftp;
    private Reader reader;
    private Writer writer;

    public SftpClient(Ftp ftp,Reader reader,Writer writer){
        this.ftp = ftp;
        this.reader = reader;
        this.writer = writer;
    }

    public SftpClient(String host,int port,String path,String fileName){
        //오버로딩
        //해당 객체내에서 파라미터롤 4개의 값을 받으면 생성이 가능하기 때문에
        this.ftp = new Ftp(host,port,path);
        this.reader = new Reader(fileName);
        this.writer = new Writer(fileName);
    }

    public void connect(){
        //파일 연결
        //새로운 인터페이스를 제공한다.
        ftp.connect();
        ftp.moveDirectory();
        writer.fileConnect();
        reader.fileConnect();
    }

    public void disConnect(){
        ftp.disConnect();
        writer.fileDisConnect();
        reader.fileDisconnect();
    }
    
    public void read(){
        reader.fileRead();
    }

    public void writer(){
        writer.write();
    }
}
