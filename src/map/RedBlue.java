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
//import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author hcps-larkinch
 */
public class RedBlue  {
    
    public static void colorStates() throws FileNotFoundException{
        File file = new File("C:\\Users\\hcps-larkinch\\Documents\\Classes\\Programming\\DrawPrac\\src\\data\\USA2012.txt");
        Scanner scan = new Scanner(file);  
        File file2 = new File("C:\\Users\\hcps-larkinch\\Documents\\Classes\\Programming\\DrawPrac\\src\\data\\USA-county.txt");
        Scanner scan2 = new Scanner(file);
        int pointNum = 0;
        double[] xVal;
        double[] yVal;
        int regionNum = scan.nextInt();
        
        scan.nextLine();
        
        for(int i=0; i < 51; i++){
           scan.next(); 
           int j;
           int r_value = scan.nextInt();
           int d_value = scan.nextInt();
           int o_value = scan.nextInt();
           xVal = new double[pointNum];
           yVal = new double[pointNum];
            for(int f = 0; f < regionNum; f++){
            if(scan.hasNextInt() == true){
                pointNum = scan.nextInt();
                
                for(j = 0; j < pointNum; j++){
                   xVal[j] = scan.nextDouble();
                   yVal[j] = scan.nextDouble();
                }
                
            }
            else{
                f = f - 1;
                scan.next();
            }
            
           if(r_value > d_value && r_value > o_value){
               StdDraw.setPenColor(java.awt.Color.red);
               //StdDraw.filledPolygon(xVal[j], yVal[j]);

           }
           
           else if(d_value > r_value && d_value > o_value){
               //make state blue
               StdDraw.setPenColor(java.awt.Color.blue);
               StdDraw.filledPolygon(xVal, yVal);
           }
           else{
               //make state green
               StdDraw.setPenColor(java.awt.Color.green);
               StdDraw.filledPolygon(xVal, yVal);
           }
           
        }
       
    }
        
    }
    
}
