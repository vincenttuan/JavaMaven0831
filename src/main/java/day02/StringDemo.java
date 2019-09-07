package day02;

public class StringDemo {
    public static void main(String[] args) {
        String word = "she sell sea shell on the sea shore";
        // indexof 找到指定字串的位置, -1 表示沒有找到
        String keyword = "on";
        if (word.indexOf(keyword) != -1) {
            System.out.println(word + " 裡面有 " + keyword);
        } else {
            System.out.println(word + " 裡面沒有 " + keyword);
        }
        // contains(指定字串) 是否有指定字串 ?
        if(word.contains(keyword)) {
            System.out.println(word + " 裡面有 " + keyword);
        } else {
            System.out.println(word + " 裡面沒有 " + keyword);
        }
        
    }
}
