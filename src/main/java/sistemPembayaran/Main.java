/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sistemPembayaran;

/**
 *
 * @author Dewanta Rahma Satria
 */
public class Main {

    public static void main(String[] args) {
        Item[] item = {
            new Item(10, "food"),
            new Item(15, "drink"),
            new Item(20, "dessert")
        };
        
        for(Item items : item){
            System.out.println(items.toString());
        }
    }
}
