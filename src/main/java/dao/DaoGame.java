package dao;

import entities.Game;

import java.text.ParseException;
import java.util.List;

public interface DaoGame {

    void insert(Game game ); // done (mais probable contient probleme )

    void update(Game game); // probleme

    void deleteById(Integer id); // done

    Game findById(Integer id); // done

    List<Game> findAll(); // done

    Game findByName(String name);


    //gestion fichiers


    public void exporterVersExcel(String path); // done
    public void importerDepuisExcel(String path) ; // a regler
    public void exporterVersTxt(String path); // done
    public void importerDepuisTxt(String path);// done
    public void exporterVersJson(String path); // done
    public void importerDepuisJson(String path); // probleme



}
