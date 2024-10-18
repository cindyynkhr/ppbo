/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsppbo;

/**
 *
 * @author cinn
 */
public class pc  extends komputer{
    int ukMonitor;

    public pc() {
    }

    public pc(int ukMonitor) {
        this.ukMonitor = ukMonitor;
    }

    public pc(int ukMonitor, String merk, int kecProcessor, int sizeMemori, String jenisProcessor) {
        super(merk, kecProcessor, sizeMemori, jenisProcessor);
        this.ukMonitor = ukMonitor;
    }
    
     public void tampilData(){
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Merk Komputer :  "+merk);
        System.out.println("Kecepatan Processor :  "+kecProcessor);
        System.out.println("Size Memori :  "+sizeMemori);
        System.out.println("Jenis Processor :  "+jenisProcessor);
         System.out.println("Ukuran Monitor : "+ukMonitor);
    }
    
}
