/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datavalidationandtesting;
import javax.swing.*;
import java.util.Scanner;
/**
 *
 * @author kabut2496
 */
public class DataValidationAndTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        six();
        aEnter();
        StringThing();
        numberThing();
        negetive();
        lastOne();
        }
    
    public static void six(){
     Scanner keyInput = new Scanner(System.in);
    
    String input;
    
    int length,run;
    
    run=1;
    while(run==1){
        System.out.println("please enter a word with more then 6 charactors");
        input=keyInput.next();
        
        length=(input.length());
        try{
    if (input.length() >= 6) {
        System.out.println("you lisend"); 
        run++;
    } else {
        throw new Exception ();
    }
} catch(Exception e){
    System.out.println (" this is to short or is not a word please try a again");
    
}
    }
    }
    public static void aEnter(){
     Scanner keyInput = new Scanner(System.in);
    String ans;
     
     int run;
     
     run=1;
     while(run==1){
         System.out.println("please enter a word with a lower case a");
         ans=keyInput.next();
         try{
             if(ans.contains("a")){
                 System.out.println("ya you lisend");
                 run++;
             }else{
                 System.out.println("boo you suck");
                 System.out.println("please try again");
                 throw new Exception();
             }
             
         }catch(Exception e){
         }
     }
    }
    public static void StringThing(){
    Scanner keyInput = new Scanner(System.in);
    
    int run=1,length;
    String ans;
    
    while(run==1){
        System.out.println("please entere a word between 5 and 15 letters and does not have the letter z");
        ans=keyInput.next();
        length=(ans.length());
        try{
            if(ans.contains("z")==false&&length<15&&length>5){
                System.out.println("Thank you for lisend");
                run++;
            }else{
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println("you are incorect");
            System.out.println("please try again");
        }
    }
    }
    public static void numberThing(){
            Scanner keyInput = new Scanner(System.in);
        int ans,run;
        run=1;
        while(run==1){
        System.out.println("please enter number between 5 and 500");
        ans=keyInput.nextInt();
        
        try{
            if(ans>=5&&ans<=500){
                System.out.println("ya you lisend");
                run++;
            }else{
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println("you suck and can not read");
            System.out.println("pleas try again");     
                    }
        }
    }
    public static void negetive(){
   Scanner keyInput = new Scanner(System.in);
   
   int ans,run;
   run=1;
   while(run==1){
       System.out.println("please enter a negative intager");
       ans=keyInput.nextInt();
       try{
           if(ans<0){
               System.out.println("ya you lisend");
               run++;
           }else{
               System.out.println("you need to lear to read");
               System.out.println("please try again");
               throw new Exception();
           }
           
       }catch(Exception e){
       }
            
   }
}
    public static void lastOne(){
    Scanner keyInput= new Scanner(System.in);{
    int ans,run,odd;
    run=1;
    while(run==1){
        System.out.println("please enter a positive number that is odd");
        ans=keyInput.nextInt();
        odd=ans%2;
        try{
        if(ans>0&&odd==1){
            System.out.println("thank you for lisenning");
            run++;
        }else{
            System.out.println("how have you got this far in my program and are still not lisening ");
            System.out.println("please try again");
            throw new Exception();
        }
        }catch(Exception e){
        }
    }
}
    }
}


