package Exception;

public class InvalidAmount extends Exception{
    
    private static final long serialVersionUID = 1L;
    public InvalidAmount(String e){
        super(e);
    }
}
