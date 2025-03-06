package homework_43_1;

public class PasswordValidateException extends Exception {

    public PasswordValidateException(String message) {
        super(message);
    }


    @Override
    public String getMessage() {
        return "Password Validate Exception: " +super.getMessage();
    }
}
