package Lesson2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class Task3 {
    public static void main(String[] args) {
        File file = new File("1.txt");
        PrintWriter fileWriter = null;
        try {
            file.createNewFile();
            fileWriter = new PrintWriter(file);
            fileWriter.println("Anna=4\n");
            fileWriter.println("Elena=5\n");
            fileWriter.println("Marina=6\n");
            fileWriter.println("Valdimir=?\n");
            fileWriter.println("Konstantin=?\n");
            fileWriter.println("Ivan=4\n");

        } catch (IOException e) {
            System.out.println("Can't write file");
        }finally {
            fileWriter.close();
        }
        parseFile(file);
    }

    private static void parseFile(File file){
        Map<String, String> names = new HashMap<>();
        String temp;
        if (file != null){
            System.out.println("here");
            try {
                BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                System.out.println(fileReader.readLine());
                while((temp = fileReader.readLine())!=null) {
                    System.out.println(temp);

                    if (temp != null && !"".equals(temp)) {
                        names.put(temp.split("=")[0], temp.split("=")[1]);
                    }
                }
                if (names.containsValue("?")){
                    for (Map.Entry<String,String> e: names.entrySet()){
                        if("?".equals(e.getValue())){
                            e.setValue(String.valueOf(e.getKey().length()));
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("Can't read file");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
