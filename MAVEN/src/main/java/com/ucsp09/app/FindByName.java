package com.ucsp09.app;
import java.util.ArrayList;
public class FindByName {
    public boolean find(ArrayList<Candy> list,String name)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).name.equals(name))
                return true;
        }
        return false;
    }
}