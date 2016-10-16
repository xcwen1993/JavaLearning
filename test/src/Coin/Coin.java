package Coin;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by XiaochengWen on 16/4/29.
 * @author XiaochengWen
 * @version 1.0
 */
public class Coin {
    private HashMap<Integer,String> coinname = new HashMap<>();
    public Coin(){
        coinname.put(1,"penny");
        coinname.put(10,"dime");
        coinname.put(25,"quarter");
        coinname.put(50,"half-doller");
    }
    private String getName(int amount){
        return coinname.get(amount);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        Coin coin = new Coin();
        String name = coin.getName(amount);
        System.out.print(name);
    }
}
