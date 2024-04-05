public class PasswordStrengthChecker {
    String checkPasswordStrength(String password)
    {
        int lengthCriteria = 8;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        String specialCharacters = "!@#$%^&*()_+[]{}|;:,.<>?~";

        if(password.length()>=lengthCriteria)
        {
            for(char c : password.toCharArray())
            {
                if(Character.isUpperCase(c))
                {
                    hasUppercase = true;
                }
                else if(Character.isLowerCase(c))
                {
                    hasLowercase = true;
                }
                else if(Character.isDigit(c))
                {
                    hasDigit = true;
                }
                else if(specialCharacters.contains(String.valueOf(c)))
                {
                    hasSpecial = true;


                }
            }

            if(hasSpecial == true && hasLowercase == true && hasDigit == true &&  hasUppercase == true)
            {
                return "Strong Password";
            }
            else {
                return "It is a Weak Password. Please include Uppercase Letters, Lowercase Letters, Numbers & Special Characters!";
            }


        }
        else {
            return "Password length must be at least " + lengthCriteria + " characters!";
        }


        }

}
