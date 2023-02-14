package thelibrarysystem;

public class LibManSystem {
    private int userType;
    private String userName;
    private String password;
    public LibManSystem[] libArr = new LibManSystem[20];  
    
    public LibManSystem(int userType, String userName, String password){
        this.userType = userType;
        this.userName = userName;
        this.password = password;
    }

    public void setUserType(int userType){
        this.userType = userType;
    }
    
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public int getUserType(){
        return userType;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public String getPassword(){
        return password;
    }
    
    public LibManSystem[] getLibMan(){
        return libArr;
    }
    
    public void register(LibManSystem LMS){
        int i;
        for(i = 0; i < libArr.length; i++){
            if(getLibMan()[i] == null){
                break;
            }
        }
        libArr[i] = LMS;
    }
    
    public void login(String userName, String password){
        if(getUserName().equals(userName) && getPassword().equals(password)){
            System.out.println("you have gained access.");
        } else{
            System.out.println("Wrong input.");
        }
    }
    
    public void logout(){
        System.exit(0);
    }
}
