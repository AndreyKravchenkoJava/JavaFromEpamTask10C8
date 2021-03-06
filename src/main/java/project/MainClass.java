package project;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        try {
            Path path = FileSystems.getDefault().getPath("Text.txt");
            List<String> list = Files.readAllLines(path, StandardCharsets.UTF_8);
            StringBuilder text = new StringBuilder();
            for (String str : list) {
                text.append(str + "\n");
            }

            System.out.println("");
            System.out.println(text.toString());
            System.out.println("------------------------------------------");
            System.out.println("");
            System.out.println(text.toString().replaceAll("\\s+", " "));

            File file = new File("C:\\Users\\Andrey\\IdeaProjects\\Task10C8\\Result.txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(text.toString().replaceAll("\\s+", " "));
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
