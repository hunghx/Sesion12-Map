package baitap8;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // yêu cầu người dụng nhập vào 1 câu
        Scanner sc = new Scanner(System.in);
        String paragraph = sc.nextLine();
        Map<String,Integer> map =new TreeMap<>();
        String[] listWord = paragraph.split(" ");
        for (String word : listWord) {
            // kiểm tra xem từ đã có trong map chưa
            if(map.containsKey(word)){
                // đã tồn tại
                int oldCount = map.get(word);
                map.put(word,oldCount+1);
            }else {
                // chưa tồn tại
                map.put(word,1);
            }
        }

        for (String key: map.keySet()) {
            System.out.println(key + " - "+map.get(key));
        }
    }
}
