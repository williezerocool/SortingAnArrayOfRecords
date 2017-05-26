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

        //trying to sort my array here 
        int temp =0;
        for(int i=0; i<5; i++){
        
            for(int j=0; j<5; j++){
            
                if(newCar[i].year < newCar[j].year){
                  
                    newCar[temp].make = newCar[i].make;
                    newCar[temp].model = newCar[i].model;
                    newCar[temp].year = newCar[i].year;
                    newCar[temp].license = newCar[i].license;
                   
                    newCar[i].make = newCar[j].make;
                    newCar[i].model = newCar[j].model;
                    newCar[i].year = newCar[j].year;
                    newCar[i].license = newCar[j].license;
                    
                    newCar[j].make = newCar[temp].make;
                    newCar[j].model = newCar[temp].model;
                    newCar[j].year = newCar[temp].year;
                    newCar[j].license = newCar[temp].license;
                    
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