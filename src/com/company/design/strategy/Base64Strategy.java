package com.company.design.strategy;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Strategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        //전략을 정했다.
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
