package baitap2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // cho phép nhạp vào 10 số nguyên
        // hiển thi ra số lớn nhất và nhất
        List<Integer> list  = new ArrayList<>();
        TreeMap<Integer,String> map = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1));
            list.add(sc.nextInt());
        }
        // sắp xếp rồi
        for (Integer number: list) {
            map.put(number,null);
        }
        // lấy phần tử đầu
        Map.Entry<Integer,String> first = map.firstEntry();
        Map.Entry<Integer,String> last = map.lastEntry();
        System.out.println(first.getKey()+ " - "+ last.getKey());
    }
}
