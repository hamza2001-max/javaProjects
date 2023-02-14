package Exception;

public class ExceedingLimit extends Exception{
    private static final long serialVersionUID = 1L;
    public ExceedingLimit(String e){
        super(e);
    }
}
