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


//        Anonimowe klasy są używane do zdefiniowania implementacji klasy “w locie”, bez potrzeby tworzenia osobnej, reużywalnej klasy. Często też używa się do stworzenia instancji klasy z nadpisanymi tylko kilkoma metodami. Daje nam to możliwość zmodyfikowania zachowania, bez tworzenia podklasy. Klasy anonimowe:
//
//        Nie mają nazwy
//        Nie mają modyfikatorów dostępu
//        Mają dostęp do statycznych i niestatycznych elementów klasy, którą implementują (z wyjątkiem elementów private)
//        Nie mają kontruktorów
//        Nie mogą rozszerzać/implementować innych klas i interfejsów
//        Nie mogą mieć żadnych statycznych elementów oprócz stałych, które są prymitywami lub stringami z modyfikatorem final.
//        Nie możemy użyć żadnych elementów, które zdefiniowaliśmy dodatkowo w klasie anonimowej. Można wywoływać tylko te, które są zdefiniowane w implementowanej klasie.
//                Nie użyjemy na nich instanceof ani nic innego co wymaga nazwy klasy
