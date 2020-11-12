/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadifaq.module1;

/**
 *
 * @author User
 */
public class number5 {
    public static void main(String[] args){
        String a = "i hate you";
        String b = "i hate";
        System.out.println("The given string is: " + a);
        System.out.println("The given mask string is: " + b);
        char arr[] = new char[a.length()];
        char[] mask = new char[256];
        for (int i = 0; i < b.length(); i++){
            mask[b.charAt(i)]++;
        }
        System.out.print("\nThe new string is: ");
        for (int i = 0; i <a.length(); i++) {
            if (mask[a.charAt(i)] == 0){
                System.out.print(a.charAt(i));
            }
        }
        System.out.println();
    }
}
