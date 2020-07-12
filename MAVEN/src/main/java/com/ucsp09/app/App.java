package com.ucsp09.app;

public class App 
{
    public static void main( String[] args )
    {
        try{
            Gift g1=new Gift();
            System.out.println("Adding Multiple Types of Sweets to our gift");
            g1.addSweet(new Chocolate("Dairy Milk",20));
            g1.addSweet(new Chocolate("Perk",10));
            g1.addSweet(new Chocolate("Mars",15));
            g1.addSweet(new Chocolate("Kit-Kat",10));
            g1.addSweet(new Chocolate("Lindt",8));
            g1.addSweet(new Candy("MilkyWay",7));
            g1.addSweet(new Candy("Snickers",12));
            g1.addSweet(new Candy("Gems",12));
            g1.addSweet(new Candy("Skittles",12));
            System.out.println("Listing Sweets Before Sorting");
            g1.listSweets();
            System.out.println("Sorting Chocolates By Name");
            g1.sortChocolatesBy("name");
            System.out.println("Listing Sweets After Sorting");
            g1.listSweets();
            System.out.println("Sorting Chocolates By Weight");
            g1.sortChocolatesBy("weight");
            System.out.println("Listing Sweets After Sorting");
            g1.listSweets();
            System.out.println("Finding Candies By Name");
            if(g1.findCandiesBy("name", "Gems"))
                System.out.println("Candy with given name is present in the list");
            else
            System.out.println("Candy with given name is not present in the list");
            System.out.println("Finding Candies By Weight");
            if(g1.findCandiesBy("weight", "12"))
                System.out.println("Candy with given weight is present in the list");
            else
                System.out.println("Candy with given weight is not present in the list");
        }
        catch(Exception E){
            System.out.println(E.getMessage());
        }
    }
}
