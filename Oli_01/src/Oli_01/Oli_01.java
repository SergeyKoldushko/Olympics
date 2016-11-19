/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oli_01;

/**
 *
 * @author Lenovo
 */
public class Oli_01 {
    //функция определения простоты числа:
    public static boolean prost(int n) {
        int kol=0;
        for (int i=1; i<=(int) Math.sqrt(n); i++) {
            if (n%i==0) {
                if (i==Math.sqrt(n)) 
                    kol++;
                else kol+=2; 
                
            }
        }    
        if (kol==2) return true;//если число простое
        else return false;//если число составное
        }
    public static void main(String[] args) {
       int a=1,aa=a,b=100,kvo=0;//kvo -  кол-во чисел-близнецов
           
           System.out.print("Числа: ");
           while (aa%6!=0) aa++;
           for (int i=aa; i<=b; i+=6) {
               if (prost(i-1) && prost(i+1)) {//если оба числа простые
                   if (!((i-1)<aa || (i+1)>b))  {kvo++; System.out.print((i-1)+" "+(i+1)+" ");} //если оба числа в границах промежутка
               }   
           }
           System.out.print("Кол-во пар чисел-близнецов на отрезке ["+a+"; "+b+"] :"+kvo);
        }
    
}
