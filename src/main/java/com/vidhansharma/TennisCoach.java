package com.vidhansharma;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String dailyWorkout() {
        return "Have Fun";
    }
}
