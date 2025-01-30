package org.example;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        String folderPath = desktopPath + "/Working Folder/All Files";
        String filePath = folderPath + "/Persons.txt";

        // ფოლდერის შექმნა
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        // 5 პიროვნების შექმნა
        List<Person> people = Arrays.asList(
                new Person("John", "Doe", 25, Gender.MALE, 1.80, 75),
                new Person("Jane", "Smith", 30, Gender.FEMALE, 1.65, 60),
                new Person("Mike", "Johnson", 40, Gender.MALE, 1.75, 85),
                new Person("Emily", "Davis", 28, Gender.FEMALE, 1.70, 65),
                new Person("Chris", "Brown", 35, Gender.MALE, 1.85, 90)
        );

        // FileManager ობიექტის შექმნა და ფაილთან მუშაობა
        FileManager fileManager = new FileManager(filePath);

        fileManager.writeToFile(people);
        System.out.println("\nInitial file content:");
        fileManager.readFile();

        // ასაკის გაზრდა 1 წლით
        people.forEach(p -> p.age += 1);
        fileManager.writeToFile(people);

        fileManager.printAllFiles(folderPath);
        fileManager.printFileDetails();

        // დამატება "This is the end of task"
        fileManager.appendToFile("\nThis is the end of task");

        // განახლებული ფაილის დაბეჭდვა
        System.out.println("\nUpdated file content:");
        fileManager.readFile();

        // რესურსების დახურვა
        fileManager.close();
    }
}
