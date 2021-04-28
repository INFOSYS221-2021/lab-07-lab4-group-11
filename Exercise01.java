public class ExerciseOne {
    public static void main(String args[]) {
      ExerciseOne ex01 = new ExerciseOne();
      
      String word = "redorangeyellowgreen";

      System.out.println(word + " to uppercase is " + ex01.stringToUppercase(word));
      System.out.println("The length of " + word + " is " + ex01.wordLength(word));
      System.out.println("The index of yellow in " + word + " is " + ex01.stringIndexOf("yellow", word));
      System.out.println("The word combo is " + ex01.wordCombo(word));
      System.out.println("The number of \'e\' in " + word + " is " + ex01.freqOfLetterInString('e', word));
      
    }
    
    // Complete this method to return the word in all uppercase
    private String stringToUppercase(String word) {
        return word.toUpperCase();
    }
    
    // Complete this method to return the length of the word
    private int wordLength(String word) {
        return word.length();
    }
    
    // Complete this method to return the index of the specified substring in the given word
    private int stringIndexOf(String subStr, String word) {
        return word.indexOf(subStr);
    }
    
    // Complete this method to return a combination of the first three letters and the last four letters of the given word.
    private String wordCombo(String word) {
        String newWord = "";
        newWord += word.substring(0, 3);
        newWord += word.substring(word.length() - 4);
        return newWord;
    }
    
    // Complete this method to return the frequencey of the specified letter in the given word. If the specified letter is not in the given word, then return -1.
    private int freqOfLetterInString(char letter, String word) {
        int freq = 0;
        for (int i = 0; i < word.length(); i++) {
            if (letter == word.charAt(i)) {
                freq += 1;
            }        
        }
        if (freq == 0) {
            return -1
        }
        return freq;
    }
}
