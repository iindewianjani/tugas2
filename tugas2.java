/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

/**
 *
 * @author anjani
 */
public class tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah = 5;
        for (int i = 1; i <= jumlah; i++) {
            for (int j = 1; j <= jumlah; j++) {
                if (j == 1 || j == jumlah) {
                    System.out.print("#");
                } 
                else if (i == 1 || i == jumlah) {
                    System.out.print("#");

                } 
                else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
