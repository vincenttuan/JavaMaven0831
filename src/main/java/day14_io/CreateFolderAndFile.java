package day14_io;

import java.io.File;

public class CreateFolderAndFile {
    public static void main(String[] args) throws Exception {
        String folder_path = "src/main/java/day14_io/myfiles";
        File folder = new File(folder_path);
        if(!folder.exists()) {
            System.out.println("建立資料夾: " + folder.mkdir());
        }
        
        if(folder.exists()) {
            File file = new File(folder_path + File.separator + "demo.txt");
            if(!file.exists()) {
                System.out.println("建立檔案: " + file.createNewFile());
            }
        }
        
        System.out.println("finish.");
    }
}
