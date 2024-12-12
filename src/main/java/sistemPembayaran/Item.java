/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemPembayaran;

/**
 *
 * @author Dewanta Rahma Satria
 */
public class Item {
    private int harga;
    private String name;

    public Item(int harga, String name) {
        this.harga = harga;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" + "harga=" + harga + ", name=" + name + '}';
    }
    
    
}
