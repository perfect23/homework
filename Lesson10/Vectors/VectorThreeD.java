package Vectors;

import java.util.Arrays;
import java.util.Random;

public class VectorThreeD {
    private double x;
    private double y;
    private double z;
    public static final String INFO = "Это вектор для трёхмерной системы координат";

    protected VectorThreeD(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double Dot(VectorThreeD vectorThreeD) {
        return x * vectorThreeD.x + y * vectorThreeD.y + z * vectorThreeD.z;    //скалярное произведение
    }

    protected double VectLength() {    //длина вектора
        return Math.sqrt(x * x + y * y + z * z);
    } // длина вектора

    protected VectorThreeD addVector(VectorThreeD vectorThreeD) {
        return new VectorThreeD(x + vectorThreeD.x, y + vectorThreeD.y, z + vectorThreeD.z); //сумма векторов
    }

    protected VectorThreeD minusVector(VectorThreeD vectorThreeD) {
        return new VectorThreeD(x - vectorThreeD.x, y - vectorThreeD.y, z - vectorThreeD.z); //разность векторов
    }

    protected void equalsVect(VectorThreeD VectorThreeD) { //сравнение векторов
        System.out.println(equals(VectorThreeD));
    }




    protected static VectorThreeD[] createVectors(int n) {
        Random random = new Random();
        VectorThreeD[] vector3ds = new VectorThreeD[n];
        for (int i = 0; i < n; i++) {
            vector3ds[i] = new VectorThreeD(random.nextDouble(), random.nextDouble(), random.nextDouble());
        }
        System.out.println(Arrays.toString(vector3ds));
        return vector3ds;
    }

    protected double compare(VectorThreeD VectorThreeD) {
        return this.VectLength() - VectorThreeD.VectLength();
    }


    @Override
    public String toString() {
        return INFO + "VectorThreeD{" +
                "x=" + x +
                ", y=" + y +
                '}';


    }
}

