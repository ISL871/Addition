/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;

/**
 *
 * @author ECD PC - VI
 */
import java.util.Scanner;
public class Addition {

 
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter Two Numbers");
       int a = scan.nextInt();
       int b = scan.nextInt();
       int total = a + b;
       System.out.println(total);
    }
    
}
