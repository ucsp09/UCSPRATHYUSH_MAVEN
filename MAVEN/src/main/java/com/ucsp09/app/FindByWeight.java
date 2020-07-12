package com.ucsp09.app;
import java.util.ArrayList;
public class FindByWeight {
    public boolean find(ArrayList<Candy> list,int weight)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).weight==weight)
                return true;
        }
        return false;
    }
}