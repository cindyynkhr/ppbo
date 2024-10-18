/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsppbo;

/**
 *
 * @author cinn
 */
public class windows extends laptop{
    String fitur;

    public windows() {
    }

    public windows(String fitur) {
        this.fitur = fitur;
    }

    public windows(String fitur, String jenisBaterai) {
        super(jenisBaterai);
        this.fitur = fitur;
    }

    public windows(String fitur, String jenisBaterai, String merk, int kecProcessor, int sizeMemori, String jenisProcessor) {
        super(jenisBaterai, merk, kecProcessor, sizeMemori, jenisProcessor);
        this.fitur = fitur;
    }
    
     public void tampilData(){
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Merk Komputer : "+merk);
        System.out.println("Kecepatan Processor : "+kecProcessor);
        System.out.println("Size Memori  : "+sizeMemori);
        System.out.println("Jenis Processor : "+jenisProcessor);
        System.out.println("Jenis Baterai : "+jenisBaterai);
         System.out.println("Fitur : "+fitur);
    } 
}
