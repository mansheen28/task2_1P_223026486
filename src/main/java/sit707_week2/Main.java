package sit707_week2;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args )
    {
        SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
        SeleniumOperations.best_buy_registration_page("https://bestbuy.com.au/login.php?action=create_account");
    }
}
