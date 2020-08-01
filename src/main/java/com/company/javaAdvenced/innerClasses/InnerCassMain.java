package com.company.javaAdvenced.innerClasses;

public class InnerCassMain {

    public static void main(String[] args) {
        // najperw obiekt zewnetrzny
        CommonCar commonCar = new CommonCar();
        // potem na nim wolamy new dla obiektu klasy zewnetrznej
        CommonCar.Engine engine = commonCar.new Engine();



    }
}


//    Klasa wewnętrzna (ang. nested class) to po prostu klasa zdefiniowana wewnątrz innej klasy i powinna służyć tylko w klasie, w której się znajduje. Jeśli klasa jest też użyteczna gdzieś indziej, to powinna być zwykłą klasą (ang. top-level class).
//
//    Są cztery typy klas wewnętrznych:
//
//    static member class
//    nonstatic member class
//    anonymous class
//    local class

//    Statyczne klasy wewnętrzne są najczęściej wykorzystywanymi klasami z tej grupy i często są preferowane.
//
//    Mają dostęp do wszystkich statycznych elementów klasy, w której jest zadeklarowana, nawet tych zadeklarowanych jako private.
//    Jak to ze statycznymi elementami, należą do klasy, a nie do jej instancji
//    Nie potrzebują instnacji klasy, w której się znajdują
//    Mogą mieć wszystkie modyfikatory dostępu
//    Można w nich deklarować zarówno elementy statyczne i niestatyczne

//    Tak jak niestatyczne zmienne czy metody, każda instancja niestatycznej klasy wewnętrznej jest powiązana z instancją klasy, w której się znajduje.
//
//    Może mieć wszystkie modyfikatory dostępu
//    Ma dostęp do wszystkich elementów klasy bez względu na to, czy są statycznie, czy nie
//    Może deklarować tylko elementy niestatyczne
