
package Tugas1;

import java.util.ArrayList;


public class Input_mahasiswa {
   
   private  ArrayList<Integer>npm = new ArrayList<>();
    
   private ArrayList<String>namamahasiswa = new ArrayList<>();
    
   private ArrayList<String> alamat = new ArrayList<>();
    
   private ArrayList<String> gelar = new ArrayList<>();

   // NPM
   
   public void Setnpm(int npm)
   {
       this.npm.add(npm);
   }
  
    public int Setidnpm(int npm)
    {
        return  this.npm.get(npm);
    }
    
    // NAMA MAHASISWA
    
    public void Setnamamahasiswa(String namamahasiswa)
    {
        this.namamahasiswa.add(namamahasiswa);
    }
 
    
    public String Setidnama(int namamahasiswa)
    {
        return this.namamahasiswa.get(namamahasiswa);
    }
    
    // ALAMAT 
      
    public void Setalamatmahasiswa(String alamatmahasiswa)
    {
        this.alamat.add(alamatmahasiswa);
    }
    
  
    
    public String Setidalamat(int alamatmahasiswa)
    {
        return this.alamat.get(alamatmahasiswa);
    }
    
    //GELAR
      
    public void SetGelar(String gelar)
    {
        this.gelar.add(gelar);
    }
    
  
    public String Setidgelar(int gelar)
    {
        return this.gelar.get(gelar);
    }
}
