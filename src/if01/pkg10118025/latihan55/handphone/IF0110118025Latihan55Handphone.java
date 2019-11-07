/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan55.handphone;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Handphone andro, bb, wipon;

        andro = new Android("Samsung", "Android", "Grand", 3000000);
        bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        wipon = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);

        ((Android) andro).setKeyStore("234ibfd3840fo");
        ((BlackBerry) bb).setPinBB("BHS249");
        ((WindowsPhone) wipon).setWpKeyStore("UUUQIJWORJ");
        
        andro.displayProduct();
        System.out.printf("Android Key Store\t: %s%n%n", ((Android) andro).getKeyStore());

        bb.displayProduct();
        System.out.printf("Android Key Store\t: %s%n%n", ((BlackBerry) bb).getPinBB());

        wipon.displayProduct();
        System.out.printf("Android Key Store\t: %s%n%n", ((WindowsPhone) wipon).getWpKeyStore());
    }
    
}
