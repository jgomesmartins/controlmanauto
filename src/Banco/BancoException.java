package Banco;

public class BancoException extends Exception{

    public BancoException() {
    }

    public BancoException(String message) {
        super(message);
    }

    public BancoException(String message, Throwable cause) {
        super(message, cause);
    }

    public BancoException(Throwable cause) {
        super(cause);
    }

    public BancoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String getMessage() {
        return super.getMessage(); 
    }

   
    
    
    
    
    
}
