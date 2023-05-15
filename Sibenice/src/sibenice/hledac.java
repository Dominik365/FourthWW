package sibenice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;


public class hledac {
    private char difficulty;
    private String filePath = "C:\\Users\\pytho\\Documents\\NetBeansProjects\\Sibenice\\src\\sibenice\\slova.txt"; // přepsat cestu na odpovídající podle PC kdes to otevřel slova.txt -> properties a cesta. Až to uděláš, dej Clean and Build (kladivo s koštetem tlačítko). Potom přepiš 2. cestu v okno.java a zopakuj proces s kladivem. Pak by to mělo být OK
    
    public hledac() {
    
    }
    public void nastav_obtiznost(char obtiznost){
        this.difficulty = obtiznost;
    }

    public String findRandomWord() {
        int length = 0;
        if (difficulty == 't') {
            length = 8;
         }
        else{
            length = 6;
        }
        ArrayList<String> words = new ArrayList<>();
        try {
            // Use a BufferedReader with UTF-8 encoding
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split(" ");
                for (String w : lineWords) {
                    if (w.length() == length) {
                        words.add(w);
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Random random = new Random();
        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }
}
