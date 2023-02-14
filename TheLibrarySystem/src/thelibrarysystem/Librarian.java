package thelibrarysystem;

public class Librarian {
    private int ID;
    private String Name;
    private String password;
    
    LibManSystem LMS = new LibManSystem(1, Name, password);
    
    public Librarian(int ID, String Name, String password){
        this.ID = ID;
        this.Name = Name;
        this.password = password;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public int getId(){
        return ID;
    }
    
    public String getName(){
        return Name;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void verifyLibrarian(int ID){
        if(getId() == ID){
            System.out.println("verified");
        } else {
            System.out.println("Not verified");
        }
    }
    
    
}
