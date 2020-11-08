/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan32.daftarfilm;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan proses
 */
public class Film {

    public String filmName, filmGenre;
    public Double filmRating;
    public int filmDuration;
    
    public void nowPlaying() {
      System.out.println("Judul Film : ".concat(filmName));
      System.out.println("Genre Film : ".concat(filmGenre));
      System.out.println("Rating Film : ".concat(Double.toString(filmRating)));
      System.out.println("Duration Film : ".concat(Integer.toString(filmDuration).concat(" Menit")));
      System.out.println("");
    }
    
}
