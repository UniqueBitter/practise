import java.util.ArrayList;
import java.util.HashMap;

public class TestMap {

    public static HashMap<String, Integer> test = new HashMap<>();
    public static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] ares) {

        //增 删 查
        list.add("111");
        list.add("pub");

        System.out.println(list);

        list.remove("111");
        System.out.println(list.get(0));


//        test.put("test", 1);
//        test.put("sx",12);
//        test.put("pix", 10);
//
//        System.out.println("PIX:" + test.get("pix"));
//        //增 删 改 查
//        //.  .     .
//        test.remove("pix");
//        System.out.println(test);
//
//        test.put("pix", 9);
//        System.out.println(test);
//
//        for (String key : test.keySet()) {
//            System.out.println(key + ":" + test.get(key));
//        }

    }

}
