package org.example;

import java.io.*;
import java.util.List;

public class FileManager {
    private BufferedWriter writer;
    private BufferedReader reader;
    private File file;

    public FileManager(String filePath) {
        this.file = new File(filePath);
    }

    // ფაილში ჩაწერა
    public void writeToFile(List<Person> people) {
        try {
            writer = new BufferedWriter(new FileWriter(file));
            for (Person p : people) {
                writer.write(p.toString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ფაილის წაკითხვა
    public void readFile() {
        try {
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ფაილის ბოლოში ტექსტის დამატება
    public void appendToFile(String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ფოლდერში არსებული ყველა ფაილის დაბეჭდვა
    public void printAllFiles(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        if (files != null) {
            System.out.println("\nFiles in " + folderPath + ":");
            for (File f : files) {
                System.out.println(f.getName());
            }
        }
    }

    // ფაილის დეტალების დაბეჭდვა
    public void printFileDetails() {
        if (file.exists()) {
            System.out.println("\nFile details:");
            System.out.println("Name: " + file.getName());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        }
    }

    // რესურსების დახურვა (conn.close())
    public void close() {
        try {
            if (writer != null) writer.close();
            if (reader != null) reader.close();
            System.out.println("\nResources closed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
