package com.vidhansharma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class FootballCoach implements Coach {

    @Autowired
            @Qualifier("randomFortuneServiceImpl")
    FortuneService fortuneService;
    @Override
    public String dailyWorkout() {
        return fortuneService.getFortune();
    }
}
