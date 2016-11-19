
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
        {
    for (int i=1; i<10; i += 2)
        {
     for (int с=0; с < (4 - i / 2); с++)
            {
                System.out.print(" ");
            }
     for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
     System.out.println("");
         }
System.out.println("-0-0-0-0-0-"); // <- разеделение фигур    
        int i;
        int j;

    for(i=1; i<=6; i++)
        {
            for(j=1; j<i; j++)
            {       
             System.out.print("*");
            }
            System.out.println();
        }
System.out.println("-0-0-0-0-0-"); // <- разеделение фигур   
     for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
             System.out.println();
        }
System.out.println("-0-0-0-0-0-"); // <- разеделение фигур     
    
    int space = 1;
Scanner s=new Scanner(System.in);
System.out.println("Enter number of rows: ");
        int n = s.nextInt();

space = n - 1;
        int c;
        int k;

  for (k = 1; k<=n; k++)
  {
    for (c = 1; c<=space; c++)
      System.out.print(" ");

    space--;

    for (c = 1; c<= 2*k-1; c++)
      System.out.print("*");

    System.out.print("\n");
  }
 
  space = 1;
 
  for (k = 1; k<= n - 1; k++)
  {
    for (c = 1; c<= space; c++)
      System.out.print(" ");
 
    space++;
 
    for (c = 1 ; c<= 2*(n-k)-1; c++)
      System.out.print("*");
 
    System.out.println("");
  }
}
    
    
    
    
    }
  
         

