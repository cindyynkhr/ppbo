/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsppbo;

/**
 *
 * @author cinn
 */
public class Utsppbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instansiasi objek Mac
        mac macBook = new mac("Touch ID", "Li-ion", "Apple", 3500, 16, "M2");
        macBook.tampilData();

        // Instansiasi objek Windows
        windows windowsLaptop = new windows("Windows Hello","Vivobook", "Asus", 3000, 8, "Intel i7");
        windowsLaptop.tampilData();

        // Instansiasi objek Pc
        pc personalComputer = new pc(32, "HP", 2400, 16, "Intel i5");
        personalComputer.tampilData();
    }
}
