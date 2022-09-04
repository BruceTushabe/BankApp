 package com.phone;
class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand(){
        return brand;
    }

    void setBrand(String aBrand){
        brand = aBrand;
    }

    int getNumOfPickups(){
        return numOfPickups;
    }

    void setNumOfPickUps(int num){
        numOfPickups = num;
    }

    boolean getRockStarUsesIt(){
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean yesOrNo){
        rockStarUsesIt = yesOrNo;
    }
}