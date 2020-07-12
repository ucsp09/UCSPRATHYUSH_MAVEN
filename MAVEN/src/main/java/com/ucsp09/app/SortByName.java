package com.ucsp09.app;
import java.util.Comparator;
public class SortByName implements Comparator<Chocolate> {
    public int compare(Chocolate a,Chocolate b)
    {
        return a.name.compareTo(b.name);
    }
}