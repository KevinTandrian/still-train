    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Latihan3
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int harga, sks, tahun;
        String fakultas, jenis;
        Scanner input = new Scanner(System.in);
        System.out.println("angkatan tahun anda=");
        tahun = input.nextInt();
        if(tahun<2020)
        {
            System.out.println("pilih fakultas anda(1. bisnis, 2. hukum, 3. psikologi)=");
            fakultas = input.next();
            if("bisnis".equalsIgnoreCase(fakultas))
            {System.out.println("masukkan jumlah sks anda=");
            harga = 100000;
            sks = input.nextInt();
            System.out.println("jumlah yang anda harus bayar"+ harga*sks);
            }
            else if("hukum".equalsIgnoreCase(fakultas))
            {
            harga = 150000;
            System.out.println("masukkan jumlah sks anda=");
            sks = input.nextInt();
            System.out.println("jumlah yang anda harus bayar"+ harga*sks);
            }
            else if("Psikologi".equalsIgnoreCase(fakultas))
            {
            harga = 125000;
            System.out.println("masukkan jumlah sks anda=");
            sks = input.nextInt();
            System.out.println("jumlah yang anda harus bayar"+ harga*sks);
            }
        }
        
        else if (tahun>2020){
            System.out.println("pilih fakultas anda(1. bisnis, 2. hukum, 3. psikologi)=");
            fakultas = input.next();
                if("bisnis".equalsIgnoreCase(fakultas))
            {System.out.println("masukkan jumlah sks anda=");
            harga = 100000;
            sks = input.nextInt();
                System.out.println("jenis mata kuliah anda(online, offline)=");
                jenis = input.next();
            if("online".equalsIgnoreCase(jenis)){
                    System.out.println("jumlah yang akan anda bayar"+(harga*sks)*2);}
            else if ("offline".equalsIgnoreCase(jenis))
            {System.out.println("jumlah yang akan anda bayar"+(harga*sks)/2);}}
                
                
                else if("hukum".equalsIgnoreCase(fakultas)){
                    harga = 150000;
                    System.out.println("masukkan jumlah sks anda=");
                    sks = input.nextInt();
                    System.out.println("jenis mata kuliah anda(online, offline)=");
                    jenis = input.next();
                    if("online".equalsIgnoreCase(jenis)){
                    System.out.println("jumlah yang akan anda bayar"+(harga*sks)*2);}
            else if ("offline".equalsIgnoreCase(jenis))
            {System.out.println("jumlah yang akan anda bayar"+(harga*sks)/2);}
                }
         else if("psikologi".equalsIgnoreCase(fakultas)){
                    harga = 125000;
                    System.out.println("masukkan jumlah sks anda=");
                    sks = input.nextInt();
                    System.out.println("jenis mata kuliah anda(online, offline)=");
                    jenis = input.next();
                    if("online".equalsIgnoreCase(jenis)){
                    System.out.println("jumlah yang akan anda bayar"+(harga*sks)*2);}
            else if ("offline".equalsIgnoreCase(jenis))
            {System.out.println("jumlah yang akan anda bayar"+(harga*sks)/2);}
         }
        
                
                
            
            
                
            
        
    
        }
    }
}
    



