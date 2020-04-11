package pl.zajda.damian;

import java.util.Random;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        Dane dane;

        System.out.println("Losowanie wybierz liczbe aby przejść dalej:");
        System.out.println("1: wylosuje N liczb od -100 do 100");
        System.out.println("2: Sam wprowadzisz liczby");

        while(true)
        {
            String temp = scan.nextLine();

            if(temp.equals("1"))
            {
                System.out.println("Podaj ile liczb wygenerować:");
                dane = new Dane(rnd, scan.nextInt());
                break;
            }
            else if(temp.equals("2"))
            {
                dane = new Dane();
                while(true)
                {
                    System.out.println("Podaj liczbe:");
                    String randomInt = scan.nextLine();

                    if(randomInt.equals("-"))
                    {
                        break;
                    }
                    else
                    {
                        dane.AddToArr(Integer.parseInt(randomInt));
                    }
                }
            }
            else
            {
                System.out.println("Nie ma takiej opcji");
            }
        }

        while(true)
        {
            String temp = scan.nextLine();
            System.out.println("Co wyświetlić");
            System.out.println("1: Wypisz dane");
            System.out.println("2: Wypisz sume");
            System.out.println("3: Wypisz średnia");
            System.out.println("4: Wypisz minimum z listy");
            System.out.println("5: Wypisz liczbe liczb dodatnich");
            System.out.println("-: Wyjdz z programu");

            if(temp.equals("-"))
            {
                break;
            }
            else if(temp.equals("1"))
            {
                dane.GetData();
            }
            else if(temp.equals("2"))
            {
                System.out.println("Suma liczb wynosi: " + dane.GetSum());
            }
            else if(temp.equals("3"))
            {
                System.out.println("Srednia liczb wynosi: " + dane.GetAvg());
            }
            else if(temp.equals("4"))
            {
                System.out.println(dane.GetMin());
            }
            else if(temp.equals("5"))
            {
                System.out.println("Ilość liczb dodatnich: " + dane.GetPositive());
            }
            else
            {
                System.out.println("Brak komendy!");
            }
        }
    }
}
