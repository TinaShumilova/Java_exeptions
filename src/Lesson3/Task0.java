package Lesson3;
/*
* Перепишите следующий код, используя ресурсный try
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task0 {
    public static void main(String[] args) {

    }
    public void rwLine(Path pathRead, Path pathWrite) {
        try(BufferedReader in = Files.newBufferedReader(pathRead);
            BufferedWriter out = Files.newBufferedWriter(pathWrite)){
            out.write(in.readLine());
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
