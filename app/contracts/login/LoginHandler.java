package contracts.login;

import contracts.model.IUser;

/**
 * Created by adanek on 14/01/15.
 */
public interface LoginHandler {
    
    IUser authenticate(String email, String password);
    
    IUser register(String firstName, String lastName, String email, String password);
}
