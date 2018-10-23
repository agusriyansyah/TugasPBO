/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import java.util.Scanner;
public class Perulangan {
     public static void main(String[] args) {
        int pil = 0;
        Scanner s= new Scanner (System.in);
        
        for(int i=0; pil != 3; i++){
            System.out.println("1. Input Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih : "); pil=s.nextInt();
        }
    }
}

