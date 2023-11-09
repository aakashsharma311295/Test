import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Interview {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String filename = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/aksharma/Downloads/"+filename)) ) {
            ArrayList<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            Map<String, Integer> hostCounts = new HashMap<>();
            for (String lineStr : lines) {
                String[] parts = lineStr.split("\\s+");
                if (parts.length > 0) {
                    String host = parts[0];
                    hostCounts.put(host, hostCounts.getOrDefault(host, 0) + 1);
                }
            }

            String newFileName = "/Users/aksharma/Downloads/record_" + filename;
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFileName))) {
                for (Map.Entry<String, Integer> entry : hostCounts.entrySet()) {
                    writer.write(entry.getKey() + " " + entry.getValue() + "\n");
                }
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}

