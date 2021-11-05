
package kelimeoyunu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.VPos;

public class Dosyaİslem {
    String[] array1 = new String[10];
    String[] array2 = new String[10];
    String[] array3 = new String[10];
    public void dosyaOku(){
        String[] array = null;
        int i = 0;
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("kelimeler.txt")))) {
            while (scanner.hasNextLine()) {
                String kelimeler = scanner.nextLine();
                array = kelimeler.split(",");
                this.array1[i] = array[0];
                this.array2[i] = array[1];
                i++;
            }
        
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadı...");
        }
        
    }
     public void dosyaGüncelle(String s,String b,int i){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("kelimeler.txt",true))){
                writer.write(s+","+b+"\n");
           
       } catch (IOException ex) {
            System.out.println("Dosya açılırken hata oluştu...");
        }
    }
    public void dosyaSil(){
        File f = new File("kelimeler.txt");
        if(f.exists()){ 
            f.delete();
        }
    }
    public void dosyaOku2(){
        int i = 0;
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("kelimeler.txt")))) {
            while (scanner.hasNextLine()) {
                String kelimeler = scanner.nextLine();
                array3[i] = kelimeler;
                i++;
            }
        
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadı...");
        }
    }
}
