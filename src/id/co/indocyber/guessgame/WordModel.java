/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessgame;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class WordModel {

    private String basicWord;
    private String soal;
    private String hint;
    private String jawaban;

    public WordModel(String basicWord, String hint) {
        this.basicWord = basicWord;
        this.hint = hint;
    }

    public String createSoal() {
        basicWord = basicWord.toUpperCase();
        String[] arrayOfword = basicWord.split("");

        System.out.println("Huruf Ketiga : " + arrayOfword[2]);

        for (int i = 0; i < arrayOfword.length; i++) {
            System.out.println(arrayOfword[i]);

        }

        char[] karakter = { 'a','b' };
        
        Arrays.sort(arrayOfword);
        StringBuilder sb = new StringBuilder();

        for (String arrayOfword1 : arrayOfword) {
            sb.append(arrayOfword1);
        }

        String soal = sb.toString();
        return soal;
    }

    public String acakHuruf() {
        basicWord = basicWord.toUpperCase();
        String[] arrayOfWord = basicWord.split("");
        List<String> hurufHuruf = Arrays.asList(arrayOfWord);
        Collections.shuffle(hurufHuruf);

        StringBuilder sb = new StringBuilder();
        for (String huruf : hurufHuruf) {
            sb.append(huruf);
        }
        return sb.toString();
    }

    public boolean cekJawaban() {
        boolean hasil = false;

        if (getJawaban().equalsIgnoreCase(basicWord)) {
            hasil = true;
        }
        return hasil;
    }

    /**
     * @return the basicWord
     */
    public String getBasicWord() {
        return basicWord;
    }

    /**
     * @param basicWord the basicWord to set
     */
    public void setBasicWord(String basicWord) {
        this.basicWord = basicWord;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

    /**
     * @return the soal
     */
    public String getSoal() {
        return soal;
    }

    /**
     * @param soal the soal to set
     */
    public void setSoal(String soal) {
        this.soal = soal;
    }

    /**
     * @return the jawaban
     */
    public String getJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

}
