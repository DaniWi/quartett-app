import java.io.FileNotFoundException;

import play.Application;
import play.GlobalSettings;
import data.DatabaseController;

/**
 * Class to initialize the database with the information about the communes and
 * the ranking
 * 
 * @author Witsch Daniel
 *
 */
public class Global extends GlobalSettings {

    /**
     * method to load the database and insert all cards/communes into the
     * database
     */
    @Override
    public void onStart(Application arg0) {
	DatabaseController db = DatabaseController.getInstance();
	try {
	    db.load();
	} catch (FileNotFoundException e) {
	    System.out.println("File data.csv not found");
	    e.printStackTrace();
	}
	super.onStart(arg0);
    }
}
