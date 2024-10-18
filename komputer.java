/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsppbo;

/**
 *
 * @author cinn
 */
public class komputer {
    String merk;
    int kecProcessor, sizeMemori;
    String jenisProcessor;

    public komputer() {
    }

    public komputer(String merk, int kecProcessor, int sizeMemori, String jenisProcessor) {
        this.merk = merk;
        this.kecProcessor = kecProcessor;
        this.sizeMemori = sizeMemori;
        this.jenisProcessor = jenisProcessor;
    }
    
    public void tampilData(){
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Merk Komputer  : "+merk);
        System.out.println("Kecepatan Processor  : "+kecProcessor);
        System.out.println("Size Memori  : "+sizeMemori);
        System.out.println("Jenis Processor  : "+jenisProcessor);
    }
}
