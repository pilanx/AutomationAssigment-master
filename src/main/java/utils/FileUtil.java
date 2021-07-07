package utils;

import lombok.Getter;
import lombok.experimental.Accessors;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
@Getter
@Accessors(fluent = true)
public class FileUtil {
    public static void saveUrls(ArrayList<String> urls) throws IOException {
        FileWriter fileWriter = new FileWriter("3 Cheapest Item Links.txt");
        fileWriter.write(String.valueOf(urls));
        fileWriter.close();
    }
}
