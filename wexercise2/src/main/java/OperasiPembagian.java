
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laila
 */
class OperasiPembagian extends OperasibilanganAbs{
    protected double a,b,c;
    
    @Override
    protected void set_A(double a){
        this.a=a;
    };
    protected void set_B(double b){
        this.b=b;
    };
    
    @Override
    protected void set_C(){
      
    }
    
    protected double get_A(){
        return a;
        
        
    };
    protected double get_B(){
        return b;
    };
    protected double get_C(){
        return c;
    };
    protected void tampil(double a, double b){
        
        c=a/b;
        System.out.println("HASIL:" +c);
    };

//    @Override
//    protected void tampil() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
    
}
