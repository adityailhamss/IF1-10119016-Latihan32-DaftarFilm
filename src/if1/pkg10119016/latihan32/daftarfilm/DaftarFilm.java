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
 * Deskripsi Program : Program ini berisi program untuk menampilkan daftar film
 * yang sedang tayang
 */
public class DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("===Daftar Film Sedang Tayang===");
        System.out.println("");
        
        Film filmSatu = new Film();
        filmSatu.filmName = "Venom";
        filmSatu.filmGenre = "Action, Horror, Scifi";
        filmSatu.filmRating = 8.5;
        filmSatu.filmDuration = 120;
        
        Film filmDua = new Film();
        filmDua.filmName = "Small Foot";
        filmDua.filmGenre = "Animation";
        filmDua.filmRating = 9.0;
        filmDua.filmDuration = 96;
        
        Film filmTiga = new Film();
        filmTiga.filmName = "Crazy Rich Asian";
        filmTiga.filmGenre = "Comedy";
        filmTiga.filmRating = 7.8;
        filmTiga.filmDuration = 119;
        
        Film filmEmpat = new Film();
        filmEmpat.filmName = "Asih";
        filmEmpat.filmGenre = "Horror";
        filmEmpat.filmRating = 6.0;
        filmEmpat.filmDuration = 100;
        
        filmSatu.nowPlaying();
        filmDua.nowPlaying();
        filmTiga.nowPlaying();
        filmEmpat.nowPlaying();
    }
    
}