// Enter to the percent of tex in Indian



import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Check_tex
{
    public static void main(String[] args) {
        
        int taxPercent;
        Scanner bc = new Scanner(System.in);
        System.out.println("Enter the value to check the tax made 5 % 20% & 30% ");
        taxPercent = bc.nextInt();
        if(taxPercent>= 250000 && taxPercent<=500000)
        {
            System.out.println("your Text will deduct 5 % ");
            System.out.println("The value you have enter is" + taxPercent);
            taxPercent = taxPercent*5/100;
            System.out.println("The value you have enter is" + taxPercent);

        }
        else if(taxPercent>= 500000 && taxPercent<=1000000)
        {
            System.out.println("your Text will deduct 30 % ");
            System.out.println("The value you have enter is" + taxPercent);
            taxPercent = taxPercent*20/100;
            System.out.println("The value you have enter is" + taxPercent);

        }
        else if(taxPercent>1000000)
        {
            System.out.println("your Text will deduct 30 % ");
            System.out.println("The value you have enter is" + taxPercent);
            taxPercent = taxPercent*30/100;
            System.out.println("The value you have enter is" + taxPercent);

        }
        else
        {
            System.out.println("no tax will deduct");
        }


    }
}#   t e s t 3  
 