package entities;

import java.io.Serializable;
import java.util.Objects;

public class Game  implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String nom;
    private String nomDeveloppeur;
    private int anneeDeSortie;
    private String plateforme;
    private String genre;


    public Game(String nom, String nomDeveloppeur, int anneeDeSortie, String plateforme, String genre) {
        this.nom = nom;
        this.nomDeveloppeur = nomDeveloppeur;
        this.anneeDeSortie = anneeDeSortie;
        this.plateforme = plateforme;
        this.genre = genre;
    }

   public Game(){}





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomDeveloppeur() {
        return nomDeveloppeur;
    }

    public void setNomDeveloppeur(String nomDeveloppeur) {
        this.nomDeveloppeur = nomDeveloppeur;
    }

    public int getAnneeDeSortie() {
        return anneeDeSortie;
    }

    public void setAnneeDeSortie(int anneeDeSortie) {
        this.anneeDeSortie = anneeDeSortie;
    }

    public String getPlateforme() {
        return plateforme;
    }

    public void setPlateforme(String plateforme) {
        this.plateforme = plateforme;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id && anneeDeSortie == game.anneeDeSortie && Objects.equals(nom, game.nom) && Objects.equals(nomDeveloppeur, game.nomDeveloppeur) && Objects.equals(plateforme, game.plateforme) && Objects.equals(genre, game.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, nomDeveloppeur, anneeDeSortie, plateforme, genre);
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nomDeveloppeur='" + nomDeveloppeur + '\'' +
                ", anneeDeSortie=" + anneeDeSortie +
                ", plateforme='" + plateforme + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}



