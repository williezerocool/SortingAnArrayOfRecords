/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storingdatainafile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
class car{

    String make, model, license;
    int year;
}
public class StoringDataInAFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Scanner keyboard = new Scanner(System.in);
        String input;
        
        car[] newCar = new car[5];
        
        System.out.print("What file do you want to load information from: ");
        input = keyboard.next();
        Scanner file = new Scanner(new File(input));
       
      
       
 
        while(file.hasNext()){
        
            for(int i=0; i<5; i++){
            
                newCar[i] = new car();
                newCar[i].make = file.next();
                newCar[i].model = file.next();
                newCar[i].year = file.nextInt();
                newCar[i].license = file.next();
            }
        }

        
      int temp = 0;
        for (car newCar1 : newCar) {
            for (car newCar2 : newCar) {
                if (newCar1.year < newCar2.year) {
                    temp = newCar1.year;
                    newCar1.year = newCar2.year;
                    newCar2.year = temp;
                }
            }
        }
        
        
        int count =1;
        for(int i=0; i<5; i++){
        
            System.out.println("Car " + count);
            System.out.println("\t Make: " + newCar[i].make);
            System.out.println("\t Model: " + newCar[i].model);
            System.out.println("\t Year: " + newCar[i].year);
            System.out.println("\t License: " + newCar[i].license);
            count++;
        }
 
    
    }
}
