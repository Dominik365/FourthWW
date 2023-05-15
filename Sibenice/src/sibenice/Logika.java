/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sibenice;

/**
 *
 * @author honza
 */
public class Logika {
    private String slovo;
    private hledac vyhledavac;
    public Logika(){
        vyhledavac = new hledac();
    }
    public void nove_slovo(){
        slovo = vyhledavac.findRandomWord();
    }
    public void nastav_obtiznost(char obtiznost){
        vyhledavac.nastav_obtiznost(obtiznost);
    }
    public String odkryj_pismena(String skryte_slovo, char pismeno){
        String nove_slovo = "";
        for (int i = 0; i < skryte_slovo.length(); i++){
            if(skryte_slovo.charAt(i) == '-')
            {
                if(slovo.charAt(i) == pismeno){
                    nove_slovo += pismeno;
                }
                else if(pismeno == 'a' && slovo.charAt(i) == 'á'){
                    nove_slovo += 'á';
                }
                else if(pismeno == 'e' && slovo.charAt(i) == 'é'){
                    nove_slovo += 'é';
                }
                else if(pismeno == 'i' && slovo.charAt(i) == 'í'){
                    nove_slovo += 'í';
                }
                else if(pismeno == 'o' && slovo.charAt(i) == 'ó'){
                    nove_slovo += 'ó';
                }
                else if(pismeno == 'u' && slovo.charAt(i) == 'ů'){
                    nove_slovo += 'ů';
                }
                else if(pismeno == 'u' && slovo.charAt(i) == 'ú'){
                    nove_slovo += 'ú';
                }
                else if(pismeno == 'y' && slovo.charAt(i) == 'ý'){
                    nove_slovo += 'ý';
                }
                 else if(pismeno == 'c' && slovo.charAt(i) == 'č'){
                    nove_slovo += 'č';
                }
                 else if(pismeno == 'd' && slovo.charAt(i) == 'ď'){
                    nove_slovo += 'ď';
                }
                 else if(pismeno == 'n' && slovo.charAt(i) == 'ň'){
                    nove_slovo += 'ň';
                }
                 else if(pismeno == 'r' && slovo.charAt(i) == 'ř'){
                    nove_slovo += 'ř';
                }
                 else if(pismeno == 's' && slovo.charAt(i) == 'š'){
                    nove_slovo += 'š';
                }
                 else if(pismeno == 't' && slovo.charAt(i) == 'ť'){
                    nove_slovo += 'ť';
                }
                 else if(pismeno == 'z' && slovo.charAt(i) == 'ž'){
                    nove_slovo += 'ž';
                }
                 else{ // písmeno nebylo odhaleno
                     nove_slovo += '-';
                 }
            }
            else{
                nove_slovo += skryte_slovo.charAt(i);
            }
        }
        if (nove_slovo.equals(skryte_slovo)){
            return "!"; // nebylo nic odkryto, ! znamena posun další fáze šibenice
        }
        return nove_slovo; // vrátí slovo s odkrytými znaky podle písmena
    
}
}
