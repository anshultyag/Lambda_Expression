package com.company;
public class UserRegistration {

    @FunctionalInterface
    public interface Validate {
             boolean validateDetails(String name);
        }
    public static Validate firstName() {
            return employeeName -> employeeName.matches("^[A-Z][A-Za-z]{2,}$");
        }
    public static Validate lastName() {
        return employeeName -> employeeName.matches("^[A-Z][A-Za-z]{2,}$");
    }
    public static Validate email() {
        return employeeName -> employeeName.matches("^abc[.a-z]+@bl[.]co[.a-z]+");
    }

   public static void main(String[] args) {
            boolean isValidName = UserRegistration.firstName().validateDetails("Anshul");
                 System.out.println(isValidName);
            boolean isValidLastName = UserRegistration.lastName().validateDetails("Tyagi");
                 System.out.println(isValidLastName);
            boolean isValidEmailName = UserRegistration.email().validateDetails("abc.abc@bl.co.in");
                 System.out.println(isValidEmailName);
                }
}