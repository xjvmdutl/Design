package com.company.design.strategy;

public class Main {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        //base64
        EncodingStrategy base64 = new Base64Strategy();

        //normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";
        //전략을 세팅해 준다.
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        //전략을 세팅해 준다.
        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);
        //전략에 따라 결과가 달라지는 디자인 패턴
        //디자인 패턴을 많이 알고 있으면 소프트웨어 설계 구현에 훨신 용이하다.
    }
}
