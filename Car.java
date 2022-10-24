package project2;

public class Car {
    /*
    Create a Class Car that would have the following fields: carPrice and color and method
calculateSalePrice() which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck. The Truckclass has a field as weight and has its own
 implementation of calculateSalePrice() method in which returned price is calculated as
following: if weight>2000 then returned price car should include 10% discount, otherwise 20%
discount. The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */
    double carPrice;
    String color;
    double discount;

    Car(double carPrice,double discount){
        this.carPrice=carPrice;
        this.discount=discount;

    }

    double calculateSalePrice(){
        double salePrice=discount*carPrice/100;
        System.out.println("sale price "+salePrice);
        return  salePrice;
    }
}
class  Sedan extends Car {
    int length;

    Sedan(double carPrice, double discount, int length) {
        super(carPrice, discount);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        double salePrice=discount*carPrice/100;
        if (length > 20) {
            discount=5;
        } else {
            discount=10;
        }

        System.out.println(carPrice-salePrice);
        return salePrice;
    }
}
    class Truck extends Car {
        double weight;

        Truck(double carPrice, double discount, double weight) {
            super(carPrice, discount);
            this.weight = weight;
        }

        double calculateSalePrice() {
            double salePrice=discount*carPrice/100;
            if (weight > 2000) {
                discount=10;
            } else {
               discount= 20;
            }
            System.out.println(carPrice-salePrice);
            return salePrice;
        }
    }

