package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    //helper for dependency
    private FortuneService fortuneService;

    //add new fields for email and Team
    private String emailAddress;
    private String team;

        //setters
        public void setEmailAddress(String emailAddress) {
            System.out.println("CricketCoach: inside setter method - setEmailAddress");
            this.emailAddress = emailAddress;
        }

        public void setTeam(String team) {
            System.out.println("CricketCoach: inside setter method - setTeam");
            this.team = team;
        }

        //getters
        public String getEmailAddress() {
            return emailAddress;
        }

        public String getTeam() {
            return team;
        }

    //create a non-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

        //create a setter method
        public void setFortuneService(FortuneService fortuneService) {
            System.out.println("CricketCoach: inside setter method - getFortuneService");
            this.fortuneService = fortuneService;
        }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
