// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class user{
    private String username;
    private String email;
    
user(String username, String email)
    {
        this.username=username;
        this.email=email;
    }
    
    public String getUsername()
    {
        return username;
    }
    public String getEmail()
    {
        return email;
    }
}


class EmailValidator{
    public static boolean isValid(String email)
    {
        if(email != null && email.contains("@")){
            return true;
        }
        
        System.out.println("Invalid email format");
        
        return false;
    }
}

class UserRepository{
    public void save(user u){
        if(EmailValidator.isValid(u.getEmail()))
        {
            System.out.println("Connecting to database");
            System.out.println("Saving user "+u.getUsername()+" to users table.");
        }
    }
}

public class Main {
    public static void main(String[] args) 
    {
        user u = new user("Fariba Diya Ahmed", "faribadiya2003@gmail.com");
        
        UserRepository repo = new UserRepository();
        
        repo.save(u);
        
        user u2 = new user("Fariba Diya Ahmed", "faribadiya2003.com");
        
        UserRepository repo2 = new UserRepository();
        
        repo.save(u2);
    }
}
