public class register {
    
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    
    public register(){}
    public register(String id, String firstName){
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }
    public void setFirstname(String id){this.firstname = firstname;}
    public void setLastname(String firstName){this.lastname = lastname;}
    public void setUsername(String id){this.username = username;}
    public void setPassword(String password){this.password = password;}
    
    
    
    
    
    public String getFirstname(){return firstname;}
    public String getLastname() {return lastname;}
    public String getUsername(){return username;}
    public String getPassword() {return password;}
  }
    