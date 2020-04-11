package pl.zajda.damian;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        ArrayList<String> arrayUnique = new ArrayList<String>();

        while(true)
        {
            String name = scan.nextLine();

            if(name.equals("-"))
            {
                break;
            }
            else if(array.contains(name))
            {
                arrayUnique.remove(name);
                continue;
            }
            else
            {
                array.add(name);
                arrayUnique.add(name);
            }
        }

        System.out.println("Liczba unikalnych imion to:" + arrayUnique.size());
    }
}
