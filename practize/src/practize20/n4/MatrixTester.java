package practize20.n4;

import java.util.Arrays;

public class MatrixTester {
    public static void main(String[] args) {
        Matrix<Double> matrix1 = new Matrix<>(Arrays.asList(
                Arrays.asList(1.0, 2.0, 3.0),
                Arrays.asList(4.0, 5.0, 6.0)
        ));

        Matrix<Double> matrix2 = new Matrix<>(Arrays.asList(
                Arrays.asList(7.0, 8.0, 9.0),
                Arrays.asList(10.0, 11.0, 12.0)
        ));

        System.out.println("Матрица 1:");
        matrix1.print();

        System.out.println("\nМатрица 2:");
        matrix2.print();

        System.out.println("\nСложение матриц:");
        Matrix<Double> sum = matrix1.add(matrix2);
        sum.print();

        Matrix<Double> matrix3 = new Matrix<>(Arrays.asList(
                Arrays.asList(1.0, 2.0),
                Arrays.asList(3.0, 4.0),
                Arrays.asList(5.0, 6.0)
        ));

        System.out.println("\nМатрица 3:");
        matrix3.print();

        System.out.println("\nУмножение матриц:");
        Matrix<Double> res = matrix1.multiply(matrix3);
        res.print();

        System.out.println("\nТранспонирование матрицы 1:");
        Matrix<Double> transposed = matrix1.transpose();
        transposed.print();
    }
}
