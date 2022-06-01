package Bridgelab;
import java.lang.Math;
public class UC1 {
    public static void main(String[] args) {
        int p = 1;


        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == p) {
            System.out.println("Employe is Present");
        } else {
            System.out.println("Employe is Absent");

        }
    }


}