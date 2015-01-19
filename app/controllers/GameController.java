package controllers;

import java.util.UUID;

import contracts.data.DataProvider;
import contracts.model.IUser;
import data.DatabaseController;
import authentication.MyAuthenticator;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.game.*;
import play.mvc.Security;
import java.util.List;
import mock.*;

public class GameController extends Controller{

    // GET /game/
    @Security.Authenticated(MyAuthenticator.class)
    public static Result index() {
    	
    	//get uid from request
    	String pid = request().username();
    	
    	//get database connection
    	//DataProvider dp = DatabaseController.getInstance();
    	
    	//CHANGED CHANGED, Ändern bitte, da game.main.html eine Card will, ich jedoch keine geben kann
        //CHANGED Im der UI benötige keien Zugriff auf die Datensicht, geht nur über Logik
        //return ok(main.render(dp.getAllCards().get(0)));
        return ok(views.html.game.selectModus.render());
    }
    // Demo Comment
    // POST /game/create
    //@Security.Authenticated(MyAuthenticator.class)
    public static Result createGame(){
    
        return play.mvc.Results.TODO;
    }
    
    // POST /game/play
    public static Result playCard(){
        
        return TODO;
    }
    
    // GET /game/status
    public static Result getStatus(){
        
        return  TODO;
    }
    
    //POST /game/commit
    public static Result commitRound(){
        
        return TODO;
    }
    
    //POST /game/abord
    public static Result abortGame(){
        
        return TODO;
    }
}
