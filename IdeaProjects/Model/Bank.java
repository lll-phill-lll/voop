
import java.util.*;

/**
 * 
 */
public class Bank {

    /**
     * Default constructor
     */
    public Bank() {
    }

    /**
     * 
     */
    private Checker Checker;

    /**
     * 
     */
    private BankServer Server;




    /**
     * @param type 
     * @param login 
     * @param password 
     * @return
     */
    public Integer CreateNewAccount(String type, String login, String password) {
        // TODO implement here
        return null;
    }

    /**
     * @param accountId 
     * @param login 
     * @param password 
     * @return
     */
    public Integer CheckBalance(Integer accountId, String login, String password) {
        // TODO implement here
        return null;
    }

    /**
     * @param accountId 
     * @param amount 
     * @param login 
     * @param password 
     * @return
     */
    public Integer ChangeBalance(Integer accountId, Integer amount, String login, String password) {
        // TODO implement here
        return null;
    }

    /**
     * @param accountIdFrom 
     * @param AccountIdTo 
     * @param login 
     * @param password 
     * @return
     */
    public boolean Transaction(Integer accountIdFrom, Integer AccountIdTo, String login, String password) {
        // TODO implement here
        return false;
    }

    /**
     * @param checker 
     * @param server
     */
    public void Bank(Checker checker, BankServer server) {
        // TODO implement here
    }

}