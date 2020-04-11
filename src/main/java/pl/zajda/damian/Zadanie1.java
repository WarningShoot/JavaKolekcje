package pl.zajda.damian;

import java.util.HashMap;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        while(true)
        {
            String name = scan.nextLine();

            if(name.equals("-"))
            {
                break;
            }
            else if(map.containsKey(name))
            {
                int temp = map.get(name) + 1;
                map.replace(name, temp);
            }
            else
            {
                map.put(name, 1);
            }
        }

        for(HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
