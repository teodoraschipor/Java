package System.Services;

import System.DataBase.DataBase;

//  DE IMPORTAT!!!
public class Services {
    private static final DataBase database = new DataBase();
    public DataBase getDatabase(){
        return database;
    }
}