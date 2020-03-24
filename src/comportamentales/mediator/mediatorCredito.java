/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.mediator;

import java.util.Date;
import java.math.BigInteger;

/**
 *
 * @author sebas
 */
public class mediatorCredito implements mediator{

    @Override
    public boolean verificarForm(BigInteger tarjetaC, String medioPago) {
        boolean verf = true;
        switch (medioPago){
                case "visa":
                    verf = true;
                    break;
                case "master card":
                    verf = true;
                    break;
                case "american express":
                    verf = true;
                    break;
                default:
                    verf = false;
                    break;
        }
        
 if(verificar(suma(arreglo(tarjetaC)))){
    verf = true;  
  }
  else{
    verf = false;
  }
        
        
        
        
        
        
        
    return verf;            
    }
      

BigInteger [] arreglo (BigInteger k){//conversiones
  char [] texto;
  String big;
  big=k.toString();
  texto=big.toCharArray();
  String cad[] =new String[texto.length];
  for (int i=0;i<cad.length;i++){
    cad[i]=Character.toString(texto[i]);    
    }
  int [] ent=new int[cad.length];
  for (int i=0;i<ent.length;i++){
    ent[i]=Integer.parseInt(cad[i]);
    }
  BigInteger [] arr=new BigInteger[ent.length];
  for (int i=0;i<arr.length;i++){
    arr[i]=new BigInteger(String.valueOf(ent[i]));    
    }
   return arr;
}

BigInteger suma(BigInteger [] j){//suma elementos ingresados
  BigInteger suma=new BigInteger("0");
  for (int i=0;i<j.length;i++){
    j[i]=par(j[i]);
    suma=suma.add(j[i]);   
    }
  return suma;
}

BigInteger par(BigInteger n){//si el valor es par
  BigInteger par=n;
  BigInteger cons=new BigInteger("2");
  BigInteger comp=new BigInteger("9");
  BigInteger mod=new BigInteger("10");
  BigInteger si=new BigInteger("0");
  si=par.mod(cons);
  if (si.compareTo(new BigInteger("0"))==0){
    par=par.multiply(cons);
      if (par.compareTo(comp)==1){
        BigInteger div=new BigInteger("0");
        BigInteger modul=new BigInteger("0");
        div=par.divide(mod);
        modul=par.mod(mod);
        par=div.add(mod);
        return par;
        }
      else{
      return par;    
      }
    }
    else{
    return par;    
  }
}

BigInteger digito(BigInteger d){//digito de verificacion
  BigInteger mod=new BigInteger("0");
  BigInteger cons=new BigInteger("10");
  mod=d.mod(cons);
  return mod;
}

boolean verificar(BigInteger d){//verifica el valor ingresado
  BigInteger verf=new BigInteger("0");
  BigInteger sumafinal=new BigInteger("0");
  BigInteger mod=new BigInteger("0");
  verf=digito(d);
  sumafinal=d.add(verf);
  mod=sumafinal.mod(new BigInteger("10"));
  return mod.compareTo(new BigInteger("0"))==0;
}
    
}
