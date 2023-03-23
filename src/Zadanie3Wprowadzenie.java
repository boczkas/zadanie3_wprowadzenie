import java.util.ArrayList;
import java.util.List;

public class Zadanie3Wprowadzenie {
    public static void main(String[] args) {
//        1. Co to jest klasa?
//          Pozwalają nam na tworzenie własnych typów.
//            Jest to szablon. Foremka do wycinania ciastek to jest klasa. Konkretne ciastko to instancja klasy.
//            Nie ważne jak później przyozdobicie ciastka albo z jakiego ciasta go pieczecie i tak powstał według
//            szablonu do produkcji ciastek.
//        Ciastko piernik = new Ciastko("lukier");
//        Ciastko szarlotka = new Ciastko("cynamon");
//
//        Jak to może wyglądać w praktyce?
//        Stworzyć klasę Ciastko z polem dodatek. Utworzyć dwa obiekty klasy Ciastko.

//        Stworzyć klasę Pies z imieniem.
//        Dodać do klasy Pies metode wydajDzwiek()
//        Pies pies = new Pies("Burek");
//        pies.wydajDzwiek();

//        2. Dziedziczenie
//        Stworzyć klasę PiesRasowy dziedziczaca po Pies.
//        Dodać do klasy PiesRasowy metodę wydajDzwiek()
//        PiesRasowy piesRasowy = new PiesRasowy("Azor");
//        piesRasowy.wydajDzwiek();

//        3. Klasy abstrakcyjne
//        Widać, że chcemy aby każdy Pies miał metodę wydajDzwiek().
//        W jaki sposób możemy to osiągnąć?
//        - Klasa abstrakcyjna Zwierze
//        PiesRasowy piesRasowy = new PiesRasowy("burek");
//        piesRasowy.wydajDzwiek();
//        - Dlaczego piesRasowy wydaje dźwięk przy zakomentowanym wydajDzwiek w jego klasie?
//        - Nadpisać wydaj dźwięk w klasie PiesRasowy

//        4. Interfejsy
//        Chcielibyśmy teraz zrobić klasę Trabka. Mamy już metodę wydajDzwiek() więc fajnie by było nie duplikować kodu.
//        No ale słabo, żeby Trabka musiala dziedziczyć po Zwierze.
//        Stwórzmy sobie interfejs Halasliwy i dodajmy do niego metodę wydajDzwiek()
//        Tworzymy klase Trabka i implementujemy interfejs
//        Przerobmy klase Zwierze tak, aby implementowala interfejs
//        Teraz przydałoby się żeby trąbke można było nastroić. W sumie tak jak każdy instrument.
//        Stwórzmy sobie interfejs Tunable i dodajmy mu metodę nastroj().
//        Zaimplementujmy ten interfejs w Trabce
//        Jak widać istnieje możliwość zaimplementowania wielu interfejsów.
//        Zobaczmy czy można zrobić wielodziedziczenie.
//        Stwórzmy klasę Ssak i spróbujmy podziedziczyć po niej w Pies.

//        5. Uzupełnienie do klas abstrakcyjnych
//          Czasami chcemy stworzyć obiekt bez tworzenia dla niego podklasy klasy abstrakcyjnej.
        Zwierze zwierze2 = new Zwierze() {
            @Override
            public void wydajDzwiek() {
                System.out.println("miau");
            }
        };
//        zwierze.wydajDzwiek();
//        Zwierze zwierze = new Zwierze() {
//            @Override
//            public void wydajDzwiek() {
//                System.out.println("Miau!");
//            }
//        };
//        zwierze.wydajDzwiek();

//        6. No i po co to wszystko? Przecież można tworzyć osobne klasy dla każdego potrzebnego typu.
//          Po pierwsze daje nam to możliwość zaznaczenia poziomów abstrakcji i zależności między obiektami.
//          Dziedziczenie daje nam możliwość określanie relacji typu "jest" - PiesRasowy jest Psem.
//          Interfejsy dają nam możliwość określenie relacji "potrafi"/"spełnia kontrakt" - zarówno Pies jak i Trabka
//          potrafia wydać dzwięk.

//          Druga rzecz to przechowywanie kolekcji. Tutaj troszkę wybiegnę do przodu.
//          Dzięki klasie Zwierze możemy przechowywać sobie wszystkie zwierzeta w jednej kolekcji
//        PiesRasowy piesRasowy1 = new PiesRasowy("Burek");
//        Pies pies = new Pies("Wariot");
//
//        List<Zwierze> zwierzaki = new ArrayList<>();
//        zwierzaki.add(piesRasowy1);
//        zwierzaki.add(pies);
//        zwierzaki.add(zwierze2);
//
//        for (Zwierze zwierze : zwierzaki) {
//            zwierze.wydajDzwiek();
//        }

//        Dzieki interfejsowi Halasliwy jesteśmy w stanie przechowywać wszystko co zaimplementowało ten interfejs

//        List<Halasliwy> dzwieczni = new ArrayList<>();
//        dzwieczni.add(new Pies("Dexter"));
//        dzwieczni.add(new Trabka());
//        dzwieczni.add(new PiesRasowy("Alojzy"));
//
//        for (Halasliwy krzykacz : dzwieczni) {
//            krzykacz.wydajDzwiek();
//        }
//
//        DniTygodnia dzien = DniTygodnia.PONIEDZIALEK;
//        System.out.println(dzien);
    }
}
