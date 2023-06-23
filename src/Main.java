import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("0987665943","Hồ Xuân Hùng");
        hashMap.put("0987735943","Nguyễn Huy Hoàng");
        hashMap.put("0983765943","Đỗ Đức Minh");
        hashMap.put("0987669543","Nguyễn Văn Đạt");
        hashMap.put("0987669543","Nguyễn Văn Đạt 1");
        hashMap.put(null,"Nguyễn Văn Đạt 1");

//        System.out.println(hashMap);
        // duyệt map - lấy ra lần lượt tưng phẩn tử
//         duyệt theo key - keySet()
        Set<String> listKey = hashMap.keySet();
        for (String key : hashMap.keySet()) {
            System.out.println(key);
            // lấy ra giá trị ứng với key
            System.out.println(hashMap.get(key));
        }
        // duyệt theo value // không có cơ chế lấy râ key tương ứng
        Collection<String> values = hashMap.values();
        for (String value:  hashMap.values()) {
            System.out.println(value);
        }
        // kiểm tra sự tồn tại của key hoặc value
        System.out.println(hashMap.containsKey("098376594312"));
        System.out.println(hashMap.containsValue("Nguyễn Huy Hoàng"));
        Set<Map.Entry<String,String>> listEntry= hashMap.entrySet();
        for (Map.Entry<String,String> entry:listEntry
             ) {
            System.out.println("key : "+entry.getKey());
            System.out.println("value : "+entry.getValue());
        }
        // xáo 1 phần tử
        hashMap.remove("0987669543");
        System.out.println(hashMap);
        // LinkedHashMap
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "QUần áo");
        linkedHashMap.put(8, "Giày dép");
        linkedHashMap.put(3, "Trang sức");
        linkedHashMap.put(6, "Thiết bị");
        linkedHashMap.put(5, "Mũ");
        for (Integer key: linkedHashMap.keySet()
             ) {
            System.out.println(key+ " - "+linkedHashMap.get(key));
        }
        // Tree
//        node gốc

//
        Node<Integer> root = new Node<>(100);
        Node<Integer> left = new Node<>(80);
        Node<Integer> right = new Node<>(150);
        root.left = left;
        root.right = right;
        root.left.left = new Node<>(60);
        root.left.right = new Node<>(90);
        root.right.left = new Node<>(140);
        root.right.right = new Node<>(160);

        /*
                             100
                            /  \
                         80     150
                         /  \   /  \
                       60   90 140  160
         */

        TreeMap<String,Double> marks = new TreeMap<>();
        marks.put("SV001",8.5);
        marks.put("SV002",7.5);
        marks.put("SV003",6.5);
        marks.put("SV004",9.5);
        marks.put("SV005",4.5);
        marks.put("SV006",5.5);
        marks.put("SV007",8.0);
        marks.put("SV008",6.0);
        marks.put("SV009",7.0);
        marks.put("SV010",8.5);
        marks.put("SV011",10.0);
        marks.put("SV012",4.0);
        System.out.println(marks.containsKey("SV001"));
    }
}