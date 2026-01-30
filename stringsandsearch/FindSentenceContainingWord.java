public class FindSentenceContainingWord {

    /*
     Linear Search Problem 2: Search for a Specific Word in a List of Sentences
     Problem:
     You are given an array of sentences (strings).
     Write a program that performs Linear Search to find the first sentence containing a specific word.
     If found, return the sentence. Else return "Not Found".

     Approach:
     Loop through sentences.
     Check sentence.contains(word)
     Return first match, else "Not Found"
    */

    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
                "Java is powerful",
                "Python is easy",
                "I love coding in Java"
        };

        String word = "java";

        System.out.println("Result: " + findSentence(sentences, word));
    }
}
