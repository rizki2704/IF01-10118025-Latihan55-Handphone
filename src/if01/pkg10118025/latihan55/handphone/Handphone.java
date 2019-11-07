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
public class Handphone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String manufacture, String operatingSystem, String model, int harga) {
        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.harga = harga;
    }

    public void displayProduct() {
        System.out.printf("Manufaktur\t\t: %s%n", manufacture);
        System.out.printf("OS\t\t\t: %s%n", operatingSystem);
        System.out.printf("Model\t\t\t: %s%n", model);
        System.out.printf("Harga\t\t\t: %d%n", harga);
    }
}
