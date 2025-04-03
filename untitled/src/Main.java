import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String inputFile = "sample.txt";
        String outputFile = "output.txt";
        Map<String, List<String>> anagramList = findAnagrams(inputFile);
        saveAngramListToFile(anagramList, outputFile);
    }

    public static Map<String, List<String>> findAnagrams(String filename) {
        Map<String, List<String>> anagramList = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue; // skip empty lines

                String word = sortString(line.trim()); // sort chars of the word to create a key

                List<String> group = anagramList.get(word); // get the exists list or create a new one
                if (group == null) {
                    group = new ArrayList<>();
                    anagramList.put(word, group); // add word to anagram list
                }
                group.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return anagramList;
    }

    // sort the charactrs of a string alphabeti
    private static String sortString(String input) {
        char[] characters = input.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }

    // writes the anagram list to a file, one list per line.
    private static void saveAngramListToFile(Map<String, List<String>> groups, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (List<String> group : groups.values()) {
                if (!group.isEmpty()) {
                    writer.write(String.join(" ", group));
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}