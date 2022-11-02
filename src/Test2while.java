
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author user
 */
public class Test2while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first value");

        int n = sc.nextInt();
        int f = 1;
        int i = 1;

        f = calculFact(i, n, f);
        System.out.println("resultat = " + f);
    }

    static int calculFact(int x, int y, int z) {
        while (x <= y) {
            z = z * x;

            x = x + 1;
        }
        return z;
    }

}
