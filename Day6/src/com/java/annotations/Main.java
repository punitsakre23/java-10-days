package com.java.annotations;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer {
    int age() default 18;
    String country() default "India";
}

@CricketPlayer
class Player {
    int runs;
    int innings;

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }
}

public class Main {

    public static void main(String[] args) {

        Player p = new Player();

        Class c = p.getClass();

        Annotation a = c.getAnnotation(CricketPlayer.class);

        CricketPlayer cp = (CricketPlayer) a;

        System.out.println(cp.age());
        System.out.println(cp.country());

    }

}
