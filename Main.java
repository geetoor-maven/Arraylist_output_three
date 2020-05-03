
package Tugas1;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        Input_mahasiswa mahasiswa = new Input_mahasiswa();
        
        for(int i = 0; i < 3; i++)
        {
            System.out.print("-- Masukan Npm = ");
            int npm = input.nextInt();
            mahasiswa.Setnpm(npm);
            
            System.out.print("-- Masukan Nama Mahasiswa = ");
            String namamahasiswa = input.next();
            mahasiswa.Setnamamahasiswa(namamahasiswa);
            
            System.out.print("-- Masukan alamat mahasiswa = ");
            String alamat = input.next();
            mahasiswa.Setalamatmahasiswa(alamat);
            
            System.out.print("-- Masukan gelar = ");
            String gelar = input.next();
            mahasiswa.SetGelar(gelar);
            
             System.out.println("-----------------------------------------------------------------");
             System.out.println("-----------------------------------------------------------------");
        }
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------");
      
        for(int i =0; i<3; i++){
          System.out.println("-- npm = "+ mahasiswa.Setidnpm(i));
          System.out.println("-- Nama mahasiswa = " + mahasiswa.Setidnama(i));
          System.out.println("-- Alamat mahasiswa = " + mahasiswa.Setidalamat(i));
          System.out.println("-- Gelar = " + mahasiswa.Setidgelar(i));
          
           System.out.println("-----------------------------------------------------------------");
            System.out.println("-----------------------------------------------------------------");
      }
    }
    
}
