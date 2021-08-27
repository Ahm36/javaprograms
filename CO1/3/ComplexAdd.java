// Add two complex numbers

class ComplexNum {
    int real;
    int image;

    ComplexNum(int real, int image) {
        this.real = real;
        this.image = image;
    }

    void result(ComplexNum n1, ComplexNum n2) {
        int RealRes = n1.real + n2.real;
        int ImageRes = n1.image + n2.image;

        System.out.println("The First Complex number is : " + n1.real + " + i" + n1.image);
        System.out.println("The Second Complex number is : " + n2.real + " + i" + n2.image);

        System.out.println("The Sum of two Complex numbers is : " + RealRes + " + i" + ImageRes);

    }
}

public class ComplexAdd {
    public static void main(String[] args) {
        ComplexNum myCom1 = new ComplexNum(10, 13);
        ComplexNum myCom2 = new ComplexNum(7, 12);

        myCom1.result(myCom1, myCom2);

    }
}