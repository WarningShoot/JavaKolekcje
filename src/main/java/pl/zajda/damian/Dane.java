package pl.zajda.damian;

import java.util.ArrayList;
import java.util.Random;

public class Dane {
    ArrayList<Integer> arr;
    Random rnd;

    public Dane()
    {
        arr = new ArrayList<Integer>();
    }

    public Dane(Random rnd, int n)
    {
        this();
        this.rnd = new Random();
        arr = new ArrayList<Integer>();
        fillArr(n);
    }

    private void fillArr(int n)
    {
        int x = -100;
        int y = 100;
        for(int i = 0; i < n; i++)
        {
            arr.add(rnd.nextInt(y-x+1)+x);
        }
    }

    public void AddToArr(int n)
    {
        arr.add(n);
    }

    public double GetAvg()
    {
        return GetSum() / arr.size();
    }

    public int GetSum()
    {
        int sum = 0;

        for(int i: arr)
        {
            sum += i;
        }
        return sum;
    }

    public int GetPositive()
    {
        int counter = 0;
        for(int i: arr)
        {
            if(i >= 0)
            {
                counter++;
            }
        }

        return counter;
    }

    public String GetMin()
    {
        int min = arr.get(0);
        int index = 0;

        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i) < min)
            {
                min = arr.get(i);
                index = i;
            }
        }

        return "Najmniejsza liczba to " + min + " o indeksie w liście " + index;
    }

    public void GetData()
    {
        for(int i: arr)
        {
            System.out.println(i);
        }
    }
}
