package com.ucsp09.app;
import java.util.Comparator;
public class SortByWeight implements Comparator<Chocolate> {
    public int compare(Chocolate a,Chocolate b)
    {
        return a.weight-b.weight;
    }
}