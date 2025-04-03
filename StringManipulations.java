public class StringManipulations {

  
    public static String reverseString(String str)       //  Reverse a String
     {
        return new StringBuilder(str).reverse().toString();
    }

   
    public static boolean isPalindrome(String str)         //  Check for Palindrome
     {
        String reversed = reverseString(str);
        return str.equalsIgnoreCase(reversed);
    }


    public static void countVowelsAndConsonants(String str)              //  Count Vowels and Consonants
    {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    
    public static String removeDuplicates(String str)              //  Remove Duplicate Characters
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }


    public static char mostFrequentChar(String str)                      //  Find the Most Frequent Character
     {
        int[] frequency = new int[256];
        char mostFrequent = ' ';
        int maxCount = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                frequency[c]++;
                if (frequency[c] > maxCount) {
                    maxCount = frequency[c];
                    mostFrequent = c;
                }
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        String input = "java_programming";
        
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverseString(input));
        System.out.println("Is Palindrome? " + isPalindrome(input));
        countVowelsAndConsonants(input);
        System.out.println("String without Duplicates: " + removeDuplicates(input));
        System.out.println("Most Frequent Character: " + mostFrequentChar(input));
    }
}
