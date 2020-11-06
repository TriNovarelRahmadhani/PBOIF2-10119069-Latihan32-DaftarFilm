/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan32.daftarfilm;

/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 */
public class Film {
    public String filmName, filmGenre;
    public Double filmRating;
    public int filmDuration;

    public void nowPlaying() {
        System.out.println("Judul Film\t: "+filmName);
        System.out.println("Genre Film\t: "+filmGenre);
        System.out.printf("Rating Film\t: %.1f%n",filmRating);
        System.out.printf("Duration Film\t: %d Menit%n%n",filmDuration);
    }
}
