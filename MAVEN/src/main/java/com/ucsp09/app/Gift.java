package com.ucsp09.app;

import java.util.ArrayList;
import java.util.Collections;

public class Gift{
    private  ArrayList<Chocolate> chocs;
    private  ArrayList<Candy> cands;
    public Gift()
    {
        chocs=new ArrayList();
        cands=new ArrayList();
    }
    public void addSweet(Chocolate c)
    {
        chocs.add(c);
    }
    public void addSweet(Candy c)
    {
        cands.add(c);
    }
    public void removeSweet(Chocolate c)
    {
        chocs.remove(c);
    }
    public void removeSweet(Candy c)
    {
        cands.remove(c);
    }
    public void listSweets()
    {
        for(int i=0;i<chocs.size();i++)
            System.out.println(chocs.get(i).name+" "+chocs.get(i).weight);
        for(int i=0;i<cands.size();i++)
            System.out.println(cands.get(i).name+" "+cands.get(i).weight);
    }
    public void sortChocolatesBy(String option) throws Exception
    {
        if(option.equals("name"))
            Collections.sort(chocs,new SortByName());
        else if(option.equals("weight"))
            Collections.sort(chocs,new SortByWeight());
        else
            throw new InvalidOptionException("option value should be either name or weight");
    }
    public boolean findCandiesBy(String option,String value) throws Exception
    {
        if(option.equals("name"))
        {
            FindByName obj=new FindByName();
            return obj.find(cands,value);
        }
        else if(option.equals("weight"))
        {
            FindByWeight obj=new FindByWeight();
            return obj.find(cands,Integer.parseInt(value));
        }
        else
            throw new InvalidOptionException("option value should be either name or weight");
    }
}