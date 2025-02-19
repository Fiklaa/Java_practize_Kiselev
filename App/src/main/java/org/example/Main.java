package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.YearMonth;

public class Main extends Application {

    private ComboBox<Integer> yearComboBox;
    private Label monthLabel;
    private GridPane calendarGrid;
    private Label yearLabel;
    private int currentYear;
    private int currentMonth;

    private static final String[] months = {
            "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
            "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
    };

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Простой Календарь");

        LocalDate today = LocalDate.now();
        currentYear = today.getYear();
        currentMonth = today.getMonthValue();

        yearComboBox = new ComboBox<>();
        for (int year = 1900; year <= 2100; year++) {
            yearComboBox.getItems().add(year);
        }
        yearComboBox.setValue(currentYear);
        yearComboBox.setOnAction(e -> {
            currentYear = yearComboBox.getValue();
            updateCalendar();
            yearLabel.setText(String.valueOf(currentYear));
        });

        yearLabel = new Label(String.valueOf(currentYear));
        yearLabel.setOnMouseClicked(e -> yearComboBox.show());
        yearLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        Button prevMonthButton = new Button("<");
        Button nextMonthButton = new Button(">");

        prevMonthButton.setOnAction(e -> {
            if (currentMonth == 1) {
                currentMonth = 12;
                currentYear--;
                yearLabel.setText(String.valueOf(currentYear));
            } else {
                currentMonth--;
            }
            updateCalendar();
        });

        nextMonthButton.setOnAction(e -> {
            if (currentMonth == 12) {
                currentMonth = 1;
                currentYear++;
                yearLabel.setText(String.valueOf(currentYear));
            } else {
                currentMonth++;
            }
            updateCalendar();
        });

        monthLabel = new Label(months[currentMonth - 1]);
        monthLabel.setStyle("-fx-font-size: 18px;");

        HBox monthNavigation = new HBox(10, prevMonthButton, monthLabel, nextMonthButton);
        monthNavigation.setAlignment(Pos.CENTER);

        calendarGrid = new GridPane();
        calendarGrid.setHgap(10);
        calendarGrid.setVgap(10);
        calendarGrid.setAlignment(Pos.CENTER);

        updateCalendar();

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setTop(yearLabel);
        root.setCenter(calendarGrid);
        root.setBottom(monthNavigation);

        BorderPane.setAlignment(yearLabel, Pos.CENTER);
        BorderPane.setAlignment(monthNavigation, Pos.CENTER);

        Scene scene = new Scene(root, 400, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateCalendar() {
        calendarGrid.getChildren().clear();

        int year = currentYear;
        int month = currentMonth;

        LocalDate today = LocalDate.now();

        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();
        LocalDate firstDayOfMonth = yearMonth.atDay(1);

        int dayOfWeekIndex = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        String[] daysOfWeek = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"};
        for (int i = 0; i < daysOfWeek.length; i++) {
            calendarGrid.add(new Label(daysOfWeek[i]), i, 0);
        }

        int dayCounter = 1;
        for (int row = 1; row <= 6; row++) {
            for (int col = 0; col < 7; col++) {
                if (row == 1 && col < dayOfWeekIndex) {
                    calendarGrid.add(new Label(""), col, row);
                } else if (dayCounter <= daysInMonth) {
                    Label dayLabel = new Label(String.valueOf(dayCounter));

                    if (year == today.getYear() && month == today.getMonthValue() && dayCounter == today.getDayOfMonth()) {
                        dayLabel.setStyle("-fx-background-color: yellow; -fx-border-color: black;");
                    }

                    calendarGrid.add(dayLabel, col, row);
                    dayCounter++;
                }
            }
        }

        monthLabel.setText(months[month - 1]);
    }

    public static void main(String[] args) {
        launch(args);
    }
}