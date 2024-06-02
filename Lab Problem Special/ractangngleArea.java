
class Rac{
    double len;
    double height;

    Rac(double len, double height){
        this.len = len;
        this.height = height;
    }

    double calculateArea(){
        return (len * height);
    }

}


public class ractangngleArea {

    public static void main(String[] args) {
        Rac rac = new Rac(5, 6);
        System.out.println(rac.calculateArea());
    }
}