public class register {
    
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    
    public register(){}
    public register(String firstname, String lastname,String username,String password){
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }
    public void setFirstname(String firstname){this.firstname = firstname;}
    public void setLastname(String lastname){this.lastname = lastname;}
    public void setUsername(String username){this.username = username;}
    public void setPassword(String password){this.password = password;}
    
    
    
    
    
    public String getFirstname(){return this.firstname;}
    public String getLastname() {return this.lastname;}
    public String getUsername(){return this.username;}
    public String getPassword() {return this.password;}
  }
    