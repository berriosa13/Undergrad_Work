/*
Anthony Berrios
CSC240-80
Week 1 Lab
Message Mapping
*/

import java.util.*;
import java.io.*;


public class CSC240_Week1MessageMapping {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        // Prompt user to enter file for reading
        System.out.print("Please enter the name of a file: "+"\n");
        String fileName = kb.nextLine();
        // Stores user's input file to open
        File file = new File(fileName);
        // Reads user's file
        String longestSentence = "";
        String currentSentence = "";
        String sentence = "";
        Scanner inputFile = new Scanner(file);
        Scanner inputFile2 = new Scanner(file);
        Scanner inputFile3 = new Scanner(file);
        Scanner inputFile4 = new Scanner(file);

        ArrayList<String> wordList = new ArrayList<>();
        int totalLines = 0;

        // this loop scans file and creates a counter
        // for the amount of words in the file
        while (inputFile.hasNextLine()) {
            totalLines++;
            inputFile.nextLine();
        }
        // scans file and stores each individual word
        // into a list with possible duplicates
        while (inputFile2.hasNext()) {
            wordList.add(inputFile2.next());
        }
        // scans file and searches for the
        // longest sentence in the file
        while(inputFile3.hasNext()) {
            currentSentence = getNextSentence(inputFile3);
            if (currentSentence.length() > longestSentence.length()) {
                longestSentence = currentSentence;
            }
        }
        // Creates a new list and calls removeDuplicates() method.
        // This method scans the list with duplicates and stores
        // all of the words into a new list without any duplicate words
        ArrayList<String> newList = removeDuplicates(wordList);
        System.out.println("The file that was read in was: "+fileName+"\n");
        System.out.println("The total amount of messages in this file is: " + totalLines+"\n");
        System.out.println("Below are the following words that were read in: ");
        for (String s : newList) {
            System.out.println(s.toLowerCase());
        }

       // int[][] twoDimensionalArray = new int[totalLines][Integer.parseInt(longestSentence)];
    }

    // Removes duplicate words from wordList
    public static <String> ArrayList<String> removeDuplicates(ArrayList<String> wordList) {
        // Creates new list
        ArrayList<String> newList = new ArrayList<String>();
        // Scans old list, and places non duplicated words into new list.
        for (String word : wordList) {
            // If this word is not in newList, add it
            if (!newList.contains(word)) {
                newList.add(word);
            }

        }

    // return the new list, non duplicated words list
            return newList;
        }

    public static String getNextSentence(Scanner inputFile3) {
        String sentence = "";
        while(inputFile3.hasNext()){
            sentence += " " + inputFile3.next();
            if(sentence.contains(".")) break;
        }
        return sentence;
    }


}












