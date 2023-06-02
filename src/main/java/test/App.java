package test;

import entities.Game;
import service.GameService;

public class App {
    public static void main(String[] args) {
        GameService gameservice1 = new GameService();

        // Ajout d'un jeu
        Game newGame = new Game();
        newGame.setNom("game2");
        newGame.setNomDeveloppeur("dohi");
        newGame.setAnneeDeSortie(2000);
        newGame.setPlateforme("phone");
        newGame.setGenre("religion");

        gameservice1.save(newGame);

        //Affichage :
        for (Game game : gameservice1.findAll())
            System.out.println(game);

        // Test de la méthode delete
        /*int gameIdToDelete = 134; // Remplacez par l'ID du jeu que vous souhaitez supprimer
        gameservice1.remove(gameIdToDelete);
        System.out.println("Jeu supprimé avec succès !");*/

        // Test de la méthode update
        int gameIdToUpdate = 141; // Remplacez par l'ID du jeu que vous souhaitez mettre à jour
        Game gameToUpdate = gameservice1.findById(gameIdToUpdate);
        if (gameToUpdate != null) {
            // Mettez à jour les informations du jeu
            gameToUpdate.setNom("Nouveau");
            gameToUpdate.setNomDeveloppeur("Nouveau");
            gameToUpdate.setAnneeDeSortie(2023);
            gameToUpdate.setPlateforme("Nouvelle");
            gameToUpdate.setGenre("Nouveau");


            gameservice1.update(gameToUpdate);
            System.out.println("Jeu mis à jour avec succès !");
        } else {
            System.out.println("Jeu introuvable !");
        }

        // Test de la méthode findById
       /* int gameIdToFind = 135; // Remplacez par l'ID du jeu que vous souhaitez trouver
        Game foundGame = gameservice1.findById(gameIdToFind);
        if (foundGame != null) {
            System.out.println("Jeu trouvé : " + foundGame);
        } else {
            System.out.println("Jeu introuvable !");
        }*/
    }




    }

