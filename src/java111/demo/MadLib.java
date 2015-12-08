package java111.demo;

/* Semester break challenge:

   Mad Lib explained: https://en.wikipedia.org/wiki/Mad_Libs#Format

   How might you use a file reader, file writer and/or the techniques
   in input helper to write a "Mad Lib" game?

   A sample Mad Lib is provided in madlib1.txt. Collect Nouns,
   adjectives, adverbs and verbs from the user and plug them into the story.

   HINT: The String class offers several methods that might help you.
   http://docs.oracle.com/javase/7/docs/api/java/lang/String.html

   See the code snippet below for one possible method to replace a value...

*/
public class MadLib {

    public static void main(String[] args) {

        // A little code to get the wheels turning
        String sentence = "The little girl VERB!";
        String verb = "jumped";
        String newSentence = "";

        System.out.println("Before the replace: " + sentence);

        newSentence = sentence.replace("VERB", verb);

        System.out.println("After the replace: " + newSentence);

    }


}
