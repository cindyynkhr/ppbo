/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsppbo;

/**
 *
 * @author cinn
 */
public class mac extends laptop{
    String security;

    public mac() {
    }

    public mac(String security) {
        this.security = security;
    }

    public mac(String security, String jenisBaterai) {
        super(jenisBaterai);
        this.security = security;
    }

    public mac(String security, String jenisBaterai, String merk, int kecProcessor, int sizeMemori, String jenisProcessor) {
        super(jenisBaterai, merk, kecProcessor, sizeMemori, jenisProcessor);
        this.security = security;
    }
    
     public void tampilData(){
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Merk Komputer  : "+merk);
        System.out.println("Kecepatan Processor  : "+kecProcessor);
        System.out.println("Size Memori  : "+sizeMemori);
        System.out.println("Jenis Processor  : "+jenisProcessor);
        System.out.println("Jenis Baterai  : "+jenisBaterai);
         System.out.println("Security   : "+security);
    } 
}
