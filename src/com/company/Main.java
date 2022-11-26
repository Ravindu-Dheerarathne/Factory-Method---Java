package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    ProductFactory fac = new ProductFactory();

        Product obj1 = fac.createNotifiaction("ProdOne");

        obj1.productCreate();

        Product obj2 = fac.createNotifiaction("ProdTwo");

        obj2.productCreate();

        Product obj3 = fac.createNotifiaction("ProdThree");

        obj3.productCreate();

    }
}
