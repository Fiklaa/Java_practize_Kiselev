package forth_one_1;

import java.util.Scanner;

public class Matrix {

    private final int[][] data;
    private final int cols, rows;

    public Matrix(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }

    public void setElement(int rows, int cols, int value){
        data[rows][cols] = value;
    }

    public void printMatrix(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.printf("%3d", data[i][j]);
            }
            System.out.println();
        }
    }

    public static Matrix createMatrixFromUser(Scanner scanner){
        System.out.println("Введите количество строк:");
        int rows = scanner.nextInt();
        System.out.println("Введите количество столбцов:");
        int cols = scanner.nextInt();

        Matrix matrix = new Matrix(rows, cols);

        System.out.println("Введите элементы матрцы построчно:");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.printf("Элемент [%d][%d]: ", i, j);
                int value = scanner.nextInt();
                matrix.setElement(i, j, value);
            }
        }
        return matrix;
    }

    public int getElement(int rows, int cols){
        return data[rows][cols];
    }

    //Сумма матриц
    public Matrix SumOfTwoMatrix(Matrix other){
        if (this.cols != other.cols || this.rows != other.rows){
            throw new IllegalArgumentException("Матрицы должны быть одного размера!!");
        }

        Matrix result = new Matrix(rows, cols);

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                result.setElement(i, j, this.data[i][j] + other.getElement(i, j));
            }
        }
        return result;
    }

    //Усножение матрицы на число
    public Matrix MuliplyOfMatrix(int scalar){
        Matrix result = new Matrix(rows, cols);

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                result.setElement(i, j, this.data[i][j] * scalar);
            }
        }
        return result;
    }

    public Matrix Multiply(Matrix other){
        if (this.cols != other.rows){
            throw  new IllegalArgumentException("Число столбцов первой матрицы должно совпадать с числом строк второй матрицы.");
        }

        Matrix res = new Matrix(this.rows, other.cols);

        for (int i = 0; i < this.rows; i++){
            for (int j = 0; j < other.cols; j++){
                int sum = 0;
                for (int k = 0; k < this.cols; k++){
                    sum += this.data[i][k] * other.getElement(k, j);
                }
                res.setElement(i, j, sum);
            }
        }
        return res;
    }

    //Основной блок кода
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Матрица A:");
        Matrix matrix1 = createMatrixFromUser(scanner);
        System.out.println("Матрица B:");
        Matrix matrix2 = createMatrixFromUser(scanner);
        System.out.println("Введите скаляр, на который будет умножена матрицы");
        int scalar = scanner.nextInt();

        System.out.println("--------------------------\nВведенная первая матрица:");
        matrix1.printMatrix();
        System.out.println("Введенная вторая матрица:");
        matrix2.printMatrix();

        System.out.println("-----------------------------------------\nБлок с операциями над введенными матрицами:" +
                "\n-----------------------------------------\nСумма двух матриц:");
        try {
            Matrix sum = matrix1.SumOfTwoMatrix(matrix2);
            sum.printMatrix();
        }catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Умножение матрицы A на скаляр " + scalar + ":");
        Matrix multiply = matrix1.MuliplyOfMatrix(scalar);
        multiply.printMatrix();

        System.out.println("Произведение матриц:");
        try {
            Matrix mulMatrix = matrix1.Multiply(matrix2);
            mulMatrix.printMatrix();
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e);
        }
    }
}