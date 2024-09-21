/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.praktikum4;

/**
 *
 * @author DINI
 */
public class Hasil {
    public static void main(String[] args) {
        Balok b = new Balok(4, 2, 3);
        Kubus k = new Kubus(2);

        System.out.println("Volume kubus : " + k.volume());
        System.out.println("Volume balok : " + b.volume());
        System.out.println("Luas kubus : " + k.luas());
        System.out.println("Luas balok : " + b.luas());
    }
}
