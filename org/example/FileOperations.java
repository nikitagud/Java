package org.example;

import java.io.*;
import java.nio.file.*;

public class FileOperations {
    public static void main(String[] args) {
        // სამუშაო მაგიდის გზა
        String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
        String folderPath = desktopPath + File.separator + "Working Folder" + File.separator + "All Files";
        String filePath = folderPath + File.separator + "My File.txt";

        try {
            // ფოლდერის შექმნა
            File folder = new File(folderPath);
            if (!folder.exists()) {
                folder.mkdirs();
                System.out.println("ფოლდერი შეიქმნა: " + folderPath);
            }

            // ფაილის შექმნა და ჩაწერა
            File file = new File(filePath);
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("ფაილი შეიქმნა: " + filePath);
                }
            }

            // "Hello world!" ჩაწერა ფაილში (try-with-resources ავტომატურად დახურავს რესურსს)
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("Hello world!");
            }

            // ფაილის წაკითხვა და კონსოლზე გამოტანა (try-with-resources ავტომატურად დახურავს რესურსს)
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String content = reader.readLine();
                System.out.println("ფაილის შიგთავსი: " + content);
            }

            // ფაილის წაშლა
            if (file.delete()) {
                System.out.println("ფაილი წაიშალა: " + filePath);
            } else {
                System.out.println("ფაილის წაშლა ვერ მოხერხდა.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("კავშირის დახურვა დასრულებულია. (მიუხედავად იმისა, რომ File-ს close() არ სჭირდება)");
        }
    }
}
