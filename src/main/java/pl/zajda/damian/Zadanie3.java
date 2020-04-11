package pl.zajda.damian;

import java.util.HashMap;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<String, String>();

        while(true)
        {
            System.out.println("Podaj pierwsze imie");
            String name1 = scan.nextLine();

            System.out.println("Podaj drugie imie");
            String name2 = scan.nextLine();

            if(name1.equals("-") || name2.equals("-"))
            {
                break;
            }
            else
            {
                map.put(name1, name2);
            }
        }

        if(map.size() > 0)
        {
            System.out.println("Podaj imie do wywołania:");
            String tempName = scan.nextLine();
            System.out.println(map.get(tempName));
        }
        else
        {
            System.out.println("Brak imion!");
        }
    }
}
