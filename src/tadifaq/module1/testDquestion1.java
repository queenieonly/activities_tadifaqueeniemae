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
public class testDquestion1 {
public static void main (String [] args){
String queen = "queeniemae";
char name[] = {'q','u','e','e','n','i','e','m','a','e'};
char middlechar = queen.charAt(queen.length()/4);
char midar[] = {middlechar};
String up =new String (midar).toUpperCase();
System.out.println(queen.replace(middlechar, up.charAt(0)));
System.out.println(queen.indexOf("m"));

}
}
