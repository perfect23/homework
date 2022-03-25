package Vectors;

public class Vector {
    private double coordinates [];

    public Vector (double [] coordinates){
        this.coordinates = coordinates;
    }
    // length of vectors
    public double length (){
        double sum = 0;
        for (int i = 0; i< coordinates.length; i++){
            sum += coordinates[i] * coordinates[i];
        }
        return Math.sqrt(sum);
    }
    //scalar
    public double scalarProd (Vector vector) {
        double res = 0;
        for ( int i = 0; i < coordinates.length; i++){
            res += coordinates[i] * vector.coordinates[i];
        }
        return res;
    }
    //add vector
    public Vector add (Vector vector) {
        double [] another = new double[coordinates.length];
        for (int i = 0; i < coordinates.length; i++){
            another [i] = coordinates[i] + vector.coordinates[i];
        }
        return new Vector(another);
    }
    //minus vector
    public Vector minus (Vector vector) {
        double [] another = new double[coordinates.length];
        for (int i = 0; i < coordinates.length; i++){
            another [i] = coordinates[i] - vector.coordinates[i];
        }
        return new Vector(another);
    }
}
