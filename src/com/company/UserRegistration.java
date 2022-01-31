package com.company;
public class UserRegistration {

    @FunctionalInterface
    public interface Validate {
             boolean validateDetails(String name);
        }
    public static Validate firstName() {
            return employeeFname -> employeeFname.matches("^[A-Z][A-Za-z]{2,}$");
        }
    public static Validate lastName() {
        return employeeLname -> employeeLname.matches("^[A-Z][A-Za-z]{2,}$");
    }
    public static Validate email() {
        return employeeeEmail -> employeeeEmail.matches("^abc[.a-z]+@bl[.]co[.a-z]+");
    }
    public static Validate mobile() {
        return employeeMobile -> employeeMobile.matches("91\\s[8-9][0-9]{9}$");
    }
    public static Validate password() {
        return employeeMobile -> employeeMobile.matches("^[A-Za-z]{8,}$");
    }
    public static Validate passwordUpperCase() {
        return employeePasswordUpperCase -> employeePasswordUpperCase.matches("^(?=.*[A-Z])[A-Za-z]{8,}$");
    }
    public static Validate passwordOneNumeric() {
        return employeePasswordOneNumeric -> employeePasswordOneNumeric.matches("^(?=.*[A-Z])(?=.*[0-9])[A-Za-z\\d]{8,}$");
    }
    public static Validate passwordSpecialCharacter() {
        return employeePasswordSpecialCharacter -> employeePasswordSpecialCharacter.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z\\d]{8,}");
    }

        public static void main(String[] args) {
            boolean isValidName = UserRegistration.firstName().validateDetails("Anshul");
                 System.out.println(isValidName);
            boolean isValidLastName = UserRegistration.lastName().validateDetails("Tyagi");
                 System.out.println(isValidLastName);
            boolean isValidEmailName = UserRegistration.email().validateDetails("abc.abc@bl.co.in");
                 System.out.println(isValidEmailName);
            boolean isValidMobile = UserRegistration.mobile().validateDetails("91 9919819801");
                 System.out.println(isValidMobile);
            boolean isValidPassword = UserRegistration.password().validateDetails("absolute");
                 System.out.println(isValidPassword);
            boolean isValidPasswordUpperCase = UserRegistration.passwordUpperCase().validateDetails("Absolute");
                 System.out.println(isValidPasswordUpperCase);
            boolean isValidPasswordOneNumeric = UserRegistration.passwordOneNumeric().validateDetails("Absolute778");
                 System.out.println(isValidPasswordOneNumeric);
            boolean isValidPasswordSpecialCharacter = UserRegistration.passwordSpecialCharacter().validateDetails("Absolute@778");
                 System.out.println(isValidPasswordSpecialCharacter);
                }
}