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
public class number4 {
    
    public boolean endsNg (String str) {
        int queenie = str.length();
        String mae = "mae";
        if (queenie < 3){
            return false;
        } else if (mae.equals(str.substring( queenie - 3, queenie))){
            return true;
         
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        number4 m = new number4();
        String strl = "queenie mae";
        System.out.println("The given strings is: " + strl);
        System.out.println("The string containing ng at last: " + m.endsNg(strl));
    }
}
