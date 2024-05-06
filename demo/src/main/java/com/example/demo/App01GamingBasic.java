package com.example.demo;

public class App01GamingBasic {
    public static void main(String[] args) {
        var marioGame= new MarioGame();
       
        var GameRunner = new GameRunner(marioGame);
        GameRunner.run();

    }
}
