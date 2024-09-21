/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.praktikum4;

/**
 *
 * @author DINI
 */
public class Balok {
    int p, l, t; // panjang, lebar, tinggi

    public Balok(int p, int l, int t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    // Menghitung volume balok
    public int volume() {
        return p * l * t;
    }

    // Menghitung luas permukaan balok
    public int luas() {
        return 2 * (p * l + p * t + l * t);
    }
}