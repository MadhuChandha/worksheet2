/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

import java.util.Scanner;
/**
 *
 * @author home
 */
public class arithmetic {
    public static void main(String[] args)
    {
        System.out.println("enter the values of a and b");
        calc obj =new calc();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        
    }
    
}
class calc
{
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    int b=obj.nextInt();
    void add()
    {
        System.out.println("ADDITION result"+(a+b));
    }
    void sub()
    {
        System.out.println("SUBTRACTION result"+(a-b));
    }
    void mul()
    {
        System.out.println("MULTIPLICATION result"+(a*b));
    }
    void div()
    {
        System.out.println("DIVISION result"+(a/b));
    }
}
