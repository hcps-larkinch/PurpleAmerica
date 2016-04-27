/*
 * Political Map Project
 * Name: 
 * Block:
 * 
 * Program Purpose:
 *
 * Algorithm:
 * 
 * Future/possible improvements:
 *
 */
package map;
import edu.princeton.cs.introcs.*;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author 
 */
public class PoliticalMap {
    public static void main(String[] args) throws FileNotFoundException{;
        File file = new File("C:\\Users\\hcps-larochesp\\Documents\\PurpleAmericaProject\\PurpleAmerica\\src\\data\\USA-county.txt");
        Scanner scan = new Scanner(file);
        StdDraw.setCanvasSize(1200, 650);
        StdDraw.setPenRadius(0.002);
        StdDraw.setPenColor(Color.BLACK);
        double xMin = scan.nextDouble();
        double yMin = scan.nextDouble();
        double xMax = scan.nextDouble();
        double yMax = scan.nextDouble();
        int regionNum = scan.nextInt();
        StdDraw.setXscale(xMin, xMax);
        StdDraw.setYscale(yMin, yMax);
        double[] xVal;
        double[] yVal;
        int pointNum = 0;
        
        for(int i = 0; i < regionNum; i++){
            if(scan.hasNextInt() == true){
                pointNum = scan.nextInt();
                xVal = new double[pointNum];
                yVal = new double[pointNum];
                for(int j = 0; j < pointNum; j++){
                   xVal[j] = scan.nextDouble();
                   yVal[j] = scan.nextDouble();
                }
                StdDraw.polygon(xVal, yVal);
            }
            else{
                i = i - 1;
                scan.next();
            }
        }
        
    }
}//Real
