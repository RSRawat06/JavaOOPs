//Source: https://www.w3schools.com/java/tryjava.asp?filename=demo_strings 


public class Main {
  public static void main(String[] args) {
    String greeting = "Hello";
    System.out.println(greeting);
  
    //Quotes inside a String
    String txt1 = "It's alright";
    String txt2 = "That's great";
    System.out.println(txt1);
    System.out.println(txt2);
    
    //Length of a String
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());

    //UpperCase and LowerCase
    String txt = "Hello World";
    System.out.println(txt.toUpperCase());
    System.out.println(txt.toLowerCase());
    
    //Finding a string in a String    
    String txt = "Please locate where 'locate' occurs!";
    System.out.println(txt.indexOf("locate"));
    
    //Strng concatenation
    String firstName = "John";
    String lastName = "Doe";
    System.out.println(firstName + " " + lastName);
    
  }
}
