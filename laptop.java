/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsppbo;

/**
 *
 * @author cinn
 */
public class laptop extends komputer {
    String jenisBaterai;

    public laptop() {
    }

    public laptop(String jenisBaterai) {
        this.jenisBaterai = jenisBaterai;
    }

    public laptop(String jenisBaterai, String merk, int kecProcessor, int sizeMemori, String jenisProcessor) {
        super(merk, kecProcessor, sizeMemori, jenisProcessor);
        this.jenisBaterai = jenisBaterai;
    }
    
    public void tampilData(){
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Merk Komputer : "+merk);
        System.out.println("Kecepatan Processor : "+kecProcessor);
        System.out.println("Size Memori  : "+sizeMemori);
        System.out.println("Jenis Processor  : "+jenisProcessor);
        System.out.println("Jenis Baterai  : "+jenisBaterai);
    }  
}
