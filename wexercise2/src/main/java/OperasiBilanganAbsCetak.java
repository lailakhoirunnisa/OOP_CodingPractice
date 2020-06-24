/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laila
 */
import java.util.InputMismatchException;
import java.util.Scanner;
final class OperasiBilanganAbsCetak extends OperasibilanganAbs {
    private static void cetakSemua(OperasibilanganAbs OB, double a, double b){
        OB.set_A(a);
        OB.set_B(b);
        OB.set_C();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner1= new Scanner(System.in);
        double a=0;
        double b=0;
        int err=0;
        try{
            System.out.println("Masukkan angka pertama ");
            a=scanner1.nextInt();
            
            System.out.println("Masukkan angka kedua");
            b=scanner1.nextInt();
        }
        catch(InputMismatchException e)
        {
            err=1;
            System.out.println("Program tidak bisa dijalankan, karena" + e);
        }
        finally{
            if (err==0){
                
            
        OperasiPenjumlahan hasiljumlah= new OperasiPenjumlahan(); 
        OperasiPengurangan hasilkurang= new OperasiPengurangan();
        OperasiPerkalian hasilkali= new OperasiPerkalian(); 
        OperasiPembagian hasilbagi= new OperasiPembagian();
        hasiljumlah.tampil(a,b);
        hasilkurang.tampil(a,b);
        hasilkali.tampil(a,b);
        hasilbagi.tampil(a,b);
      
    }
        
        else {
            System.out.println(" Program tidak berjalan");
}    
    }}
       
    
    @Override
    protected void set_A(double a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void set_B(double b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void set_C() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_A() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_B() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_C() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
 protected void tampil(double a, double b){
   


 };
    }
