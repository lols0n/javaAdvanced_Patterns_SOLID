package com.company.javaAdvenced.interfaces;

public interface Gaming {

    void plejdagejm(); //public i abstract domyslnie sa juz ustawione w interfejsach


    default boolean isWinner (int points) {
        return true;
    }

}

