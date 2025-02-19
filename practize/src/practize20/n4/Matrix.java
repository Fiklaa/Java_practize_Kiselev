package practize20.n4;

import java.util.ArrayList;
import java.util.List;

public class Matrix<T extends Number> {
    private final List<List<T>> data;

    public Matrix(List<List<T>> data) {
        this.data = data;
    }

    public int getRowCount() {
        return data.size();
    }

    public int getColumnCount() {
        return data.get(0).size();
    }

    public T get(int row, int col) {
        return data.get(row).get(col);
    }

    public Matrix<T> add(Matrix<T> other) {
        if (this.getRowCount() != other.getRowCount() || this.getColumnCount() != other.getColumnCount()) {
            throw new IllegalArgumentException("Размеры матриц должны совпадать для сложения");
        }

        List<List<T>> result = new ArrayList<>();
        for (int i = 0; i < getRowCount(); i++) {
            List<T> row = new ArrayList<>();
            for (int j = 0; j < getColumnCount(); j++) {
                Number sum = this.get(i, j).doubleValue() + other.get(i, j).doubleValue();
                row.add((T) sum);
            }
            result.add(row);
        }
        return new Matrix<>(result);
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (this.getColumnCount() != other.getRowCount()) {
            throw new IllegalArgumentException("Количество столбцов первой матрицы должно совпадать с количеством строк второй матрицы");
        }

        List<List<T>> result = new ArrayList<>();
        for (int i = 0; i < this.getRowCount(); i++) {
            List<T> row = new ArrayList<>();
            for (int j = 0; j < other.getColumnCount(); j++) {
                Number sum = 0;
                for (int k = 0; k < this.getColumnCount(); k++) {
                    sum = sum.doubleValue() + this.get(i, k).doubleValue() * other.get(k, j).doubleValue();
                }
                row.add((T) sum);
            }
            result.add(row);
        }
        return new Matrix<>(result);
    }

    public Matrix<T> transpose() {
        List<List<T>> result = new ArrayList<>();
        for (int i = 0; i < getColumnCount(); i++) {
            List<T> row = new ArrayList<>();
            for (int j = 0; j < getRowCount(); j++) {
                row.add(get(j, i));
            }
            result.add(row);
        }
        return new Matrix<>(result);
    }

    public void print() {
        for (List<T> row : data) {
            for (T value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}