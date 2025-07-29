package JavaFiles;

import java.io.*;
import java.util.*;

public class JavaBuffer {
    private static final String FILE_NAME = "data.txt";

    // Create or Add a new record
    public static void create(String record) throws IOException {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(record);
            bw.newLine();
        }
    }

    // Read all records
    public static List<String> readAll() throws IOException {
        List<String> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                records.add(line);
            }
        }
        return records;
    }

    // Update a record (replace oldRecord with newRecord)
    public static void update(String oldRecord, String newRecord) throws IOException {
        List<String> records = readAll();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String record : records) {
                if (record.equals(oldRecord)) {
                    bw.write(newRecord);
                } else {
                    bw.write(record);
                }
                bw.newLine();
            }
        }
    }

    // Delete a record
    public static void delete(String recordToDelete) throws IOException {
        List<String> records = readAll();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String record : records) {
                if (!record.equals(recordToDelete)) {
                    bw.write(record);
                    bw.newLine();
                }
            }
        }
    }

    // Example usage
    public static void main(String[] args) throws IOException {
        // Create
        create("Alice");
        create("Bob");
        // Read
        System.out.println("All records: " + readAll());
        // Update
        update("Alice", "Alicia");
        System.out.println("After update: " + readAll());
        // Delete
        delete("Bob");
        System.out.println("After delete: " + readAll());
    }
}

