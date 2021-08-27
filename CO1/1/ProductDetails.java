/* Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of
the class and find the product having the lowest price.*/

class Product{
    int pcode;
    String pname;
    double price;

	Product( int pcode, String pname , double price){
	this.pcode =pcode;
	this.pname =pname;
	this.price =price;
}

    String lowest(Product p1, Product p2, Product p3) {
        if (p1.price < p2.price) {
            if (p1.price < p3.price) {
                return p1.pname;
            } else {
                return p3.pname;
            }
        } else {
            if (p2.price < p3.price) {
                return p2.pname;
            } else {
                return p3.pname;
            }
        }

    }
}

public class ProductDetails {
    public static void main(String[] args) {
        Product p1 = new Product(001,"ASUS",35000);
	Product p2 = new Product(002,"ACER",44000);
	Product p3 = new Product(003,"DELL",51000);
	
       

        String low = p1.lowest(p1, p2, p3);
        System.out.println("The product having lowest price is : " + low);
    }
}