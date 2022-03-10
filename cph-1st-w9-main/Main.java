import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

       // printWordsStartingWith("Ø");

       // printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:
       // printLongestWords();

       // printFirstHalfOfEachWord();
        printFrequentChar();

    }

    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:

    private static void printLongestWords() // opgave 5 - 1
    {
        int maxLength = 0;
        String longestWord = "";
        for(String s : text)
        {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestWord = s;
            }
        }
        System.out.println(longestWord);
        }

        private static void printFirstHalfOfEachWord() // ogpave 5 - 2
        {
            for (String word : text)
            {
                System.out.println(word.substring(0, word.length() / 2));
            }
        }

        private static void printFrequentChar()
        {
            for(String letter : text)
            {
                System.out.println(letter.charAt(0));
            }
        }

    }




