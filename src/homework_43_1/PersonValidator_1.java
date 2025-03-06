package homework_43_1;

public class PersonValidator_1 {
    public static boolean  validatePassword(String password) throws PasswordValidateException {
        if (password == null || password.length() < 8) {

            throw new PasswordValidateException("Password length must be more than 8 symbols");
        }

        String specChars = "!%$@&*()[]";


        boolean isDigit = false;
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isSpecSymbol = false;



        for (int i = 0; i < password.length(); i ++) {
            char ch1 = password.charAt(i);


            if (Character.isDigit(ch1)) {
                isDigit = true;
            }
            else if (Character.isLowerCase(ch1)) {
                isLowerCase = true;
            }
            else if (Character.isUpperCase(ch1)) {
                isUpperCase = true;
            }
            else if (specChars.contains(String.valueOf(ch1))) {
                isSpecSymbol = true;


            }


        }
       // return isDigit && isLowerCase && isUpperCase && isSpecSymbol;
        throw new PasswordValidateException("invalid symbol");

    }
}
