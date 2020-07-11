package com.company.innerClasses.anonymous;

public class ShoutableUse {

    void shoutOnSomebody() {        // klasa anonimowa


        Shoutable shoutable = new Shoutable() {

            @Override
            public String shout() {
                return "Yelling";
            }
        };
    }

}
// geecon, devoxx, jdd