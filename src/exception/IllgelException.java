package exception;

public class IllgelException extends Exception {
    public IllgelException() {
    }

    public IllgelException(String message) {
        super(message);
    }

    public IllgelException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllgelException(Throwable cause) {
        super(cause);
    }

    public IllgelException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
