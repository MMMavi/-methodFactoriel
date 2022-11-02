/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodfactoriel;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MethodFactoriel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter value");
        int n = scan.nextInt();

        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        System.out.println("resultat = " + f);
    }
    
    
}
