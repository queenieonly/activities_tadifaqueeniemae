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
public class number3 {
    public static void main(String[] args){
      int[] numbers = new int[] {85, 85, 85, 89, 89, 85, 85};
      
      double sum = 0;
      for (int i=0; i < numbers.length ; i++) {
          sum = sum + numbers[i];
      }
      double average = sum / numbers.length;
      System.out.println("Average value of the array elements is : " + average);
      
    }
}
