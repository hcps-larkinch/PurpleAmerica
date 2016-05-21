/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package map;
import edu.princeton.cs.introcs.StdDraw;
import java.io.File;
import java.io.FileNotFoundException;
import edu.princeton.cs.introcs.*;
import java.awt.Canvas;
import java.util.Scanner;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author hcps-larkinch
 */
public class Purple {
    
    public static void findShade() throws FileNotFoundException{
         File file = new File("C:\\Users\\hcps-larkinch\\Documents\\Classes\\Programming\\DrawPrac\\src\\data\\USA2012.txt");
        Scanner scan = new Scanner(file);  
        int red;
        int blue;
        int green;
           
        for(int i=0; i < 51; i++){
           scan.nextLine();
           scan.next(); 
           red = scan.nextInt();
           blue = scan.nextInt();
           green = scan.nextInt();
           
           int total = red + blue + green;
           
           int[] rgbValue = {(red/total * 100) ,(green/total * 100) , (blue/total * 100)};
           System.out.println(rgbValue);
        }
        
        File file2 = new File("C:\\Users\\hcps-larkinch\\Documents\\Classes\\Programming\\DrawPrac\\src\\data\\USA2012.txt");
        Scanner scan2 = new Scanner(file);  
        File file3 = new File("C:\\Users\\hcps-larkinch\\Documents\\Classes\\Programming\\DrawPrac\\src\\data\\USA-county.txt");
        Scanner scan3 = new Scanner(file);
        int pointNum = 0;
        double[] xVal;
        double[] yVal;
        int regionNum = scan2.nextInt();
        
        scan2.nextLine();
        
        for(int i=0; i < 51; i++){
           scan2.next(); 
           int j;
           int r_value = scan2.nextInt();
           int d_value = scan2.nextInt();
           int o_value = scan2.nextInt();
           xVal = new double[pointNum];
           yVal = new double[pointNum];
            for(int f = 0; f < regionNum; f++){
            if(scan.hasNextInt() == true){
                pointNum = scan2.nextInt();
                
                for(j = 0; j < pointNum; j++){
                   xVal[j] = scan2.nextDouble();
                   yVal[j] = scan2.nextDouble();
                }
                
            }
            else{
                f = f - 1;
                scan2.next();
            }
            
    
            }
        }
    }
}
