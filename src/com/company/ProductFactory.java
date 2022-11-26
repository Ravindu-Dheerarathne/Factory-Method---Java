package com.company;

public class ProductFactory {

    public Product createNotifiaction(String Note){

        if(Note==null){
            return null;
        }

        if(Note=="ProdTwo"){
            return new ProductTwo();
        }
        else if(Note=="ProdThree"){
            return new ProductThree();
        }
        else if(Note=="ProdOne"){
            return new ProductOne();
        }


        return null;
    }

}
