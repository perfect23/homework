package Vectors;


import java.util.Arrays;
import java.util.Random;

public class VectorTwoD {
    private double x;
    private double y;
    public static final String INFO = "Это вектор для двумерной системы координат";

    protected VectorTwoD (double x, double y){
        this.x = x;
        this.y = y;
    }

    public double Dot(VectorTwoD vectorTwoD) {
        return x * vectorTwoD.x + y * vectorTwoD.y;    //скалярное произведение
    }

    protected double VectLength(){    //длина вектора
     return Math.sqrt(x*x + y*y);
    } // длина вектора
    protected VectorTwoD addVector (VectorTwoD vectorTwoD){
       return new VectorTwoD(x + vectorTwoD.x, y + vectorTwoD.y); //сумма векторов
    }
    protected VectorTwoD minusVector (VectorTwoD vectorTwoD){
       return new VectorTwoD(x - vectorTwoD.x, y - vectorTwoD.y); //разность векторов
    }

    protected static VectorTwoD [] createVectors (int n) {
        Random random = new Random();
       VectorTwoD[] vector2ds = new VectorTwoD[n];
       for ( int i = 0; i < n; i++){
           vector2ds[i] = new VectorTwoD(random.nextDouble(), random.nextDouble());
       }
        System.out.println(Arrays.toString(vector2ds));
        return vector2ds;
    }
    protected  double compare(VectorTwoD vectorTwoD){
       return this.VectLength() - vectorTwoD.VectLength();
    }


    @Override
    public String toString() {
        return INFO + ": VectorTwoD{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }



}
