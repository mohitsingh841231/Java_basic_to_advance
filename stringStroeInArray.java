public class stringStroeInArray {
    
    public static void main(String[] args) {
        // Define a string word
        String word = "Hello";

        // Convert the string to a character array
        char[] letterArray = word.toCharArray();

        // Print each letter
        for (char letter : letterArray) {
            System.out.println(letter);
        }

        String s1 = "mohit";
        char [] let = s1.toCharArray();
        for(char nums:let){
            System.out.print(" "+ nums);
        }
        System.out.println();
        System.out.println(s1.length());
    }
}
