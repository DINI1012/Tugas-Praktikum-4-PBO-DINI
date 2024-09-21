/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.praktikum4;

/**
 *
 * @author DINI
 */
public class Kubus {
    int s; // sisi

    public Kubus(int s) {
        this.s = s;
    }

    // Menghitung volume kubus
    public int volume() {
        return s * s * s;
    }

    // Menghitung luas permukaan kubus
    public int luas() {
        return 6 * (s * s);
    }
}
