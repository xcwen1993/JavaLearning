package hashmap;

import java.util.HashMap;
import java.util.Scanner;


/**
 * Created by XiaochengWen on 16/4/29.
 */
public class MyHashMap {
    public static int x = 10;
    private HashMap<Integer,String> CoinName = new HashMap<>();
    public MyHashMap(){
        CoinName.put(1,"penny");
        CoinName.put(10,"dime");
        CoinName.put(25,"quarter");
        CoinName.put(50,"half-dollar");
        CoinName.put(100, "dollar");
    }
    private String getName(int amount){
        if (CoinName.containsKey(amount)) {
            return CoinName.get(amount);
        }
        else {
            return "没有";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        MyHashMap myHashMap = new MyHashMap();
        String name = myHashMap.getName(amount);
        System.out.print(name);

    }
}
