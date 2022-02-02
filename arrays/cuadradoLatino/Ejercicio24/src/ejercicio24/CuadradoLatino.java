/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

/**
 *
 * @author jnieto
 */
public class CuadradoLatino {
    private int matriz[][];
    private int orden;
    
    public CuadradoLatino(int orden) {
       
        matriz=new int[orden][orden];
        this.orden=orden;
        asignaValores2();
        
    }
    private void asignaValores(){
         int num=0;
        
         for (int i = 0; i < orden; i++) {
            for (int j = 0; j < orden; j++) {
                matriz[i][j]=sig(num);
                num=sig(num);
                
            }
            num=matriz[i][orden-2];
        }
    }
    
    private void asignaValores2(){
        int pos=1;
        
         for (int i = 0; i < orden; i++) {
            for (int j = 0; j < orden; j++) {
                matriz[i][j]=pos;
                pos=sig(pos);
                
            }
            pos=matriz[i][orden-1];
        }
        
    }
    
    
    private int sig(int actual){
        if (actual==orden) return 1;
        else return ++actual;
        
    }
    
    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < orden; i++) {
            for (int j = 0; j < orden; j++) {
                ret.append(matriz[i][j]+"\t");
            }
            ret.append("\n");
        }
        return ret.toString();
    }
    
}
