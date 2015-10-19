/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        testCircle();
//        testCircumfrence();
//        testRectangle();
//        testPeramiter();
        testCylinder();
    }

    public static void testCircle() {
        double theRadius = Double.valueOf(JOptionPane.showInputDialog("what is the Radius"));
        double myrad = Circle.getArea(theRadius);
        System.out.println(myrad);
    }

    public static void testCircumfrence() {
        double aRadius = Double.valueOf(JOptionPane.showInputDialog("what is the Radius"));
        double circumfrence = Circle.getCircumfrence(aRadius);
        System.out.println(circumfrence);
    }

    private static void testRectangle() {
        double theWidth = Double.valueOf(JOptionPane.showInputDialog("please enter a width"));
        double theLength = Double.valueOf(JOptionPane.showInputDialog("please enter a length"));

        double rectangle = Rectangle.getArea(theWidth, theLength);
        System.out.println("this is your reult " + rectangle);

        double peramiter = Rectangle.getPeramiter(theWidth, theLength);
        System.out.println("this is your perimeter " + peramiter);

        System.out.println("this is your perimeter " + Rectangle.getPeramiter(theWidth, theLength));
    }

    private static void testCylinder() {
        double aRad = Double.valueOf(JOptionPane.showInputDialog("Please enter the value for radius"));
        double aHeight = Double.valueOf(JOptionPane.showInputDialog("Please enter the value for height"));
        double cylinder = Cylinder.getVolume(aRad, aHeight);

        double theRad = Double.valueOf(JOptionPane.showInputDialog("Please enter the value for radius"));
        double theHeight = Double.valueOf(JOptionPane.showInputDialog("Please enter the value for height"));
        double cylinder2 = Cylinder.getVolume(theRad, theHeight);

        System.out.println("Here is the volume of the cylinder " + aRad + (", ") + aHeight + (", ") + cylinder);
        System.out.println("Here is the volune for the second cylinder" + theRad + (", ") + theHeight + (", ") + cylinder2);
    }

}
