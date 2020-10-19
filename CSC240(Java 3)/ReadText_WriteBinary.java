/*
Name:           Anthony Berrios
Class:          CSC 240-80
Professor:      Frank Ganther
Assignment:     Lab 4
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadText_WriteBinary {


    public static void main(String[] args) throws IOException {
        String name;
        int yearsPlayed;
        char position;
        int jerseyNumber;
        int weight;
        double fortyTime;
        String teamName;
        Boolean isActive;

         File file;
         Scanner readFile;
         String[] inputs;
         String line;
         String fileName;
         int x = 1;

         ArrayList<String> stats = new ArrayList<String>();

        do {
            Scanner kb = new Scanner(System.in);
            System.out.println("Please enter the name of a " +
                    "file containing football player data:");
            fileName = kb.nextLine();

            try {
                file = new File(fileName);
                Scanner inputFile = new Scanner(file);
                while(inputFile.hasNext()) {
                    stats.add(inputFile.nextLine());
                }
                x=2;

            }
            catch (FileNotFoundException e)
                {
                System.out.print("File not found. ");
                }
           }
        while(x==1);

        FileOutputStream j = new FileOutputStream("stats.bin");
        DataOutputStream out = new DataOutputStream(j);

        for (String s : stats) {
            String[] info = s.split(", ");

             name = info[0];
             yearsPlayed = Integer.parseInt(info[1]);
             position= (info[2].charAt(0));
             jerseyNumber= Integer.parseInt(info[3]);
             weight= Integer.parseInt(info[4]);
             fortyTime= Double.parseDouble(info[5]);
             teamName= info[6];
             isActive= Boolean.parseBoolean(info[7]);

            try {

                out.writeUTF(name);
                out.writeInt(yearsPlayed);
                out.writeChar(position);
                out.writeInt(jerseyNumber);
                out.writeInt(weight);
                out.writeDouble(fortyTime);
                out.writeUTF(teamName);
                out.writeBoolean(isActive);

            }
            catch (IOException e) {

            }

        }
        out.flush();
        out.close();
    }




}
