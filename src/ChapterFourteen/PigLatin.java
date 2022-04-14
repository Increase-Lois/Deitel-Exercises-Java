package ChapterFourteen;

import java.util.Scanner;
/*
(Pig Latin) Write an application that encodes English-language phrases into pig Latin. Pig
Latin is a form of coded language. There are many different ways to form pig Latin phrases. For
simplicity, use the following algorithm:
To form a pig Latin phrase from an English-language phrase, tokenize the phrase into words
with String method split . To translate each English word into a pig Latin word, place the first
letter of the English word at the end of the word and add the letters “ay.” Thus, the word “jump”
becomes “umpjay,” the word “the” becomes “hetay,” and the word “computer” becomes “omputer-
cay.” Blanks between words remain as blanks. Assume the following: The English phrase consists of
words separated by blanks, there are no punctuation marks and all words have two or more letters.
Method printLatinWord should display each word. Each token is passed to method printLatin-
Word to print the pig Latin word. Enable the user to input the sentence. Then display the converted
sentence.
 */
public class PigLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to convert to pig latin: ");
        String [] userInput = scanner.nextLine().split(" ");
        StringBuilder pigLatinSentence = new StringBuilder();
        for(String word: userInput){
            pigLatinSentence.append(printLatinWord(word)).append(" ");
        }
        System.out.println(pigLatinSentence);
    }

    public static String printLatinWord(String word){
        StringBuilder result = new StringBuilder(word);
        Character character = result.charAt(0);
        result.insert(result.length(), character);
        result.append("ay");
        return result.substring(1);
    }
}
