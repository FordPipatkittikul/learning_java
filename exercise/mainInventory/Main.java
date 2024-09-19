package mainInventory;

import inventory.Product;
import inventory.Inventory;
import inventory.Warehouse;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.productId = 3;
        product.productName = "ipad";
        product.price = 3000;

        Inventory inventory = new Inventory();
        inventory.product = product;
        inventory.quantity = 100000;

        Warehouse warehouse = new Warehouse();
        warehouse.warehouseId = 5;
        warehouse.warehouseName = "PrimeWay Logistics Hub";
        warehouse.inventories = "electronic";

    }
}
