package day14_io;

import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        try(FileReader fr = new FileReader("src/main/java/day14_io/myfiles/demo.txt");) {
            int data;
            while ((data = fr.read()) != -1) {
                sb.append((char)data);
            }
        } catch (Exception e) {
        }
        System.out.println(sb);
        System.out.println(sb.toString().split("\n").length);
    }
}
