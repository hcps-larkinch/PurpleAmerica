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
           
           int[] rgbValue = {(red/total),(green/total), (blue/total)};
           System.out.println(rgbValue);
        }
    
}
}
