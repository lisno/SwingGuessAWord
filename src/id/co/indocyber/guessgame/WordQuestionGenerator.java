/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessgame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class WordQuestionGenerator {

    public static WordModel[] createQuestion() {

        WordModel soal1 = new WordModel("Pondok Indah", "daerah jakarta selatan");
        WordModel soal2 = new WordModel("Sudirman", "Jalan Utaman dijakarta");
        WordModel soal3 = new WordModel("Tugu Tani", "Patung Dekat Monas");
        WordModel soal4 = new WordModel("Citos", "Mall di jakarta selatan");

        WordModel[] bankSoal = {soal1, soal2, soal3, soal4};
        return bankSoal;
    }

    public static List<WordModel> createQuestionCollection(){

        WordModel soal1 = new WordModel("Pondok Indah", "daerah jakarta selatan");
        WordModel soal2 = new WordModel("Sudirman", "Jalan Utaman dijakarta");
        WordModel soal3 = new WordModel("Tugu Tani", "Patung Dekat Monas");
        WordModel soal4 = new WordModel("Citos", "Mall di jakarta selatan");

        List<WordModel> bankSoal = new ArrayList<>();
        bankSoal.add(soal1);
        bankSoal.add(soal2);
        bankSoal.add(soal3);
        bankSoal.add(soal4);
        return bankSoal;

    }
    
    public static List<WordModel>createQuestionFromFile(String filename) throws FileNotFoundException,IOException{
    List<WordModel> bankSoal = new ArrayList<>();
    File file = new File(filename);
    
    if(!file.exists()){
        System.out.println("File Not Found");
    }
         FileReader fileReader = new FileReader(file);
         BufferedReader reader = new BufferedReader(fileReader);

        String line = null;
        while ((line = reader.readLine()) != null) {
            
             String[] text = line.split(",");
             WordModel question1 = new WordModel(text[0],text[1]);
             bankSoal.add(question1);
            
        }
    return bankSoal;
    }  

}
