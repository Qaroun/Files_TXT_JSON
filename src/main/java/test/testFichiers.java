package test;
import entities.Game;
import service.GameService;
public class testFichiers {
    public static void main(String[] args) {


        GameService gameservice1 = new GameService();

        //******************* Les fichiers ************************************

         //txt

       gameservice1.importerDepuisTxt("src/main/resources/importDepuisTxt.txt");
       gameservice1.exporterVersTxt("src/main/resources/exporterVersTxt.txt");

        //Excel
            //gameservice1.importerDepuisExcel("src/main/resources/fileExcel.xlsx");
            // gameservice1.exporterVersExcel("src/main/resources/fileExcel.xlsx");

        //json

        //gameservice1.importerDepuisJson("src/main/resources/importDepuisJson.json");
        //gameservice1.exporterVersJson("src/main/resources/exportVersJson.json");

           }

        }


