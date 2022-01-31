package com.company;
public class UserRegistration {

    @FunctionalInterface
    public interface Validate {
             boolean validateDetails(String name);
        }
    public static Validate firstName() {
            return employeeName -> employeeName.matches("^[A-Z][A-Za-z]{2,}$");
        }

   public static void main(String[] args) {
            boolean isValidName = UserRegistration.firstName().validateDetails("Anshul");
                 System.out.println(isValidName);
                }
}