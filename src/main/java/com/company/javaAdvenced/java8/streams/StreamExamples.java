package com.company.javaAdvenced.java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//zasada dzialania strumieni jest PANTHA REI

/*
* generowanie strumienia:
* -metoda stream() na kolekcjach
* -metoda of(elements) na elementach wyliczonych
* -Arrays.stream(Object[]) - strumien na elementach tabeli
*
* metody posrednie:
* - map - przeksztalcenie z kilku strumieni do 1
* - filter - filtrowanie po zadanych parametrach
* - limit - ma ilosc elementow zwracanych
* - distinct - przechadza tylko elementy niepowtarzalne
*
* metody konczace:
* - toArray - zraca tabele
* - collect - zwraca "cos" - to moze byc kolekcja, czy pojedyncza wartosc
* - reduce - zwraca 1 wartosc
* - count - zwraca ilosc elementow
* - max - zwraca wartosc max wg zadanych kryteriow
* - findAny - zwraca Optional<costam>
* - findFirsst - zwraca Optional<costam>
*/



public class StreamExamples {

    public static void main(String[] args) {

        //DTO - data transfer object
        //nuzywany do przekazywania danych obiektu do pliku, przez siec, itp
        class HumanDTO {
            String name;
            String surname;

            public HumanDTO(String name, String surname) {
                this.name = name;
                this.surname = surname;
            }
        }

        List<Human> people = new LinkedList<>();
        people.add(new Human("Jan", "Kowalski", 14));
        people.add(new Human("Marian", "Nowak", 33));
        people.add(new Human("Pwaeł", "Wiewiór", 44));
        people.add(new Human("Anna", "Jalewska", 55));

        //wypisac wszystkich ludzi na ekran
        System.out.println("-----Tradirional way-----");
        for (Human person : people) {
            System.out.println(person);
        }
        System.out.println("-----Stream away-----");
        //stream
        //1 - operacja generujaca strumien np. metoda stream()
        //2 - operacja posrednie - wykonujace jakies przekssztalcnia
        //3 - operacje konczace - zwracajace wartosc albo void
        //stream() powoluje strumien obiektow z elementow listy people,
        // dalej operacja konczaca, wypisujaca elementy na ekran
        people.stream().forEach(x -> System.out.println(x));

        //wypisac jesli wiek wiekszy od 20
        System.out.println("-----Filter old way-----");
        for (Human person : people) {
            if (person.getAge() > 20) {
                System.out.println(person);
            }
        }


        //filtrowanie z java 8
        System.out.println("-----Filter new way-----");
        people.stream()
                .filter(human -> human.getAge() > 20) //metoda posrednia
                .forEach(System.out::println); //konczenie strumienia

        //first two elements
        System.out.println("-----List first two elements-----");
        people.stream()
                .limit(2)
                .forEach(System.out::println);

        System.out.println("-----Limit 2 and filter under 30-----");
        people.stream()
                .limit(2)
                .filter(x -> x.getAge() < 30)
                .forEach(System.out::println);

        System.out.println("-----Print names-----");
        people.stream()
                .map(x -> x.getName()) //map() przeksztalca strumien Human na strumien String
                //bo map() zbraca obiekty zwracane przez wywolana operacje (u nas getName)
                .forEach(System.out::println);

        System.out.println("-----Map to another object-----");
        List<HumanDTO> listDTOs = people.stream()
                //dla kazdego elementy strumienia map
                //wola konstruktor klasy humanDTO
                //przekazujac dane z aktualnego elementu strumienia (obiektu Human)

                .map(x -> new HumanDTO(x.getName(), x.getSurname()))
                .collect(Collectors.toList());

        listDTOs.forEach(x -> System.out.println(x.name + " " + x.surname));

        System.out.println("-----Wydruk wspolny-----");
        //laczenie kilku kolekcji i wykonanie operacji na ich elementach
        Set<Human> peopleset = new HashSet<>();
        peopleset.add(new Human("Anna", "Wilkowsaka", 18));
        peopleset.add(new Human("Piotr", "Bania", 33));
        peopleset.add(new Human("Agata", "Ruwier", 45));
        peopleset.add(new Human("Karolina", "Inglot", 11));

        List<Human> humanConCat = Stream.of(people, peopleset) //of() sklada strumien z podanych
                //kolekcji
                //flatmap przeksztalca zlozona strukture w prostsza (jednowymiarowa)
                //z srumoienia dwoch kolekcji robi jeden strumien
                //z wszystkich elementow obu kolekcji
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        humanConCat.forEach(System.out::println);
        System.out.println("-----Wydruk wspolny imie + wiek-----");
        Stream.of(people, peopleset)
                .flatMap(x -> x.stream())
                .forEach(el -> System.out.println(el.getName() + " " + el.getAge()));

        System.out.println("-----Ludzie z przedzialu 23 - 40 -----");
        Stream.of(people, peopleset)
                .flatMap(x -> x.stream())
                .filter(x -> x.getAge() < 40)
                .filter(x -> x.getAge() > 23)
                .forEach(System.out::println); //po operacji konczacej nie nie zrobie

        System.out.println("----------");
        Stream.of(people, peopleset)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList())
                //po collect powyzszy strumien sie konczy i jak chcemy robic cos
                //strumieniowo dalej to znowu wolamy stream()
                //i teraz odnosi sie to do listy wyplutej przez .collect()
                .stream()
                .filter(c -> c.getAge() > 30)
                .map(el -> el.getName())
                .filter(a -> a.length() > 6)
                .forEach(System.out::println);

        System.out.println("-----Sortowanie w strumieniu-----");
        Stream.of(people, peopleset)
                .flatMap(x -> x.stream())
                .sorted() //uzywamy komparatora z klasy Human z Comparable
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("-----Sortowanie z zewnetrznum komparatorem-----");
        Stream.of(people, peopleset)
                .flatMap(str -> str.stream())
                .sorted(new HumanComparedByNameAndAge())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("-----Ilosc lat wszystkich razem-----");
        //po stremu
        int oldWaySum = 0;
        for (Human person : people) {
            oldWaySum += person.getAge();
        }
        System.out.println("old way sum = " + oldWaySum);

        int ageSum = people.stream()
                .map(a -> a.getAge())
                //do reduce przekazujemy stan poczatkowy (w naszym wypadku 0)
                //(sum, el) -> sum + el) okresla
                //jekie dzialanie nelezy w kolejnych elementach strumienia
                .reduce(0, (sum, el) -> sum + el);
        System.out.println("Age sum = " + ageSum);

        System.out.println("-----Laczenie stringow-----");
        String namesJoined = people.stream()
                //przy wywolaniu przez referencje (::)
                //odnosimy sie do klasy a nie do elementu strumienia
                .map(Human::getSurname)
                .collect(Collectors.joining());
        System.out.println("names joined = " + namesJoined);

        String namesJoinedWithComma = people.stream()
                //przy wywolaniu przez referencje (::)
                //odnosimy sie do klasy a nie do elementu strumienia
                .map(Human::getSurname)
                .collect(Collectors.joining(","));
        System.out.println("names joined = " + namesJoinedWithComma);

        System.out.println("-----Najwyzsza wartosc (wiek)-----");
        Optional<Integer> maxAge = peopleset.stream()
                .map(Human::getAge)
                .max(Integer::compareTo);

        System.out.println(maxAge.isPresent() ? "Max wiek " + maxAge.get() : "Nie znaleziono");

        System.out.println("-----Full name print-----");
        people.stream()
                .map(x -> x.getName() + " " + x.getSurname())
                .forEach(System.out::println);

        System.out.println("-----Function info-----");
        Object[] peopleArray = people.stream()
                .map(StreamExamples::returnHumanInfo)
                .toArray();
        for (Object o : peopleArray) {
            System.out.println(o);
        }


    }
    private static String returnHumanInfo(Human human) {
        return human.getSurname() + " " +
                human.getName() + " " +
                human.getAge();

    }
}

