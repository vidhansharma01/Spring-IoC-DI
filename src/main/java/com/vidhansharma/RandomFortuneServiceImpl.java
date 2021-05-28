package com.vidhansharma;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneServiceImpl implements FortuneService {
    @Override
    public String getFortune() {
        return "GO LIve@@@";
    }
}
