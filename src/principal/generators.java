/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author sebas
 */
public class generators {
    
        public String generatePlaca(){
        String placa = "";
        int randAlpha;
        int randNumber;
        int iterator = 0;
        while(iterator < 3){
            randAlpha = 1+(int) Math.floor(Math.random()*27);
            switch(randAlpha){
                case 1:
                    placa = placa + "A";
                    break;
                case 2:
                    placa = placa + "B";
                    break;
                case 3:
                    placa = placa + "C";
                    break;
                case 4:
                    placa = placa + "D";
                    break;
                case 5:
                    placa = placa + "E";
                    break;
                case 6:
                    placa = placa + "F";
                    break;
                case 7:
                    placa = placa + "G";
                    break;
                case 8:
                    placa = placa + "H";
                    break;
                case 9:
                    placa = placa + "I";
                    break;
                case 10:
                    placa = placa + "J";
                    break;
                case 11:
                    placa = placa + "K";
                    break;
                case 12:
                    placa = placa + "L";
                    break;
                case 13:
                    placa = placa + "M";
                    break;
                case 14:
                    placa = placa + "N";
                    break;
                case 15:
                    placa = placa + "O";
                    break;
                case 16:
                    placa = placa + "P";
                    break;
                case 17:
                    placa = placa + "Q";
                    break;
                case 18:
                    placa = placa + "R";
                    break;
                case 19:
                    placa = placa + "S";
                    break;
                case 20:
                    placa = placa + "T";
                    break;
                case 21:
                    placa = placa + "U";
                    break;
                case 22:
                    placa = placa + "V";
                    break;
                case 23:
                    placa = placa + "W";
                    break;
                case 24:
                    placa = placa + "X";
                    break;
                case 25:
                    placa = placa + "Y";
                    break;
                case 26:
                    placa = placa + "Z";
                    break;
                default:
                    placa = placa + "A";
                    break;
            }
        iterator++;
        }
        iterator = 0;
        while(iterator < 3){
            randNumber = (int) Math.floor(Math.random()*10);
            placa = placa + Integer.toString(randNumber);
            iterator++;
        }
        
        return placa;
    }
        
    public String generateReferenceCode(){
        String code = "US";
        int iterator = 0;
        int rand;
        while (iterator < 7){
            rand = (int)Math.floor(Math.random()*9);
            code = code + Integer.toString(rand);
            iterator++;
        }
        return code;
    }
        
        
    
}
