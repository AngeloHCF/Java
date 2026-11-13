package twelve;

public class Recursion {
  public static void main(String[] args) {
    String reversedString = "olegna si eman ym";
    System.out.println(reverseString(reversedString));
  }

  public static String reverseString(String input) {
    if(input == "") return "";

    return input.charAt(input.length() - 1) + reverseString(input.substring(0, input.length() - 1));
  }
}
