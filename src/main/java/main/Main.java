package main;

import chart.BarChart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BarChart barChart = new BarChart("Task types report",new ArrayList());

        BarChart barChart1 = BarChart.builder()
                .withTitle("Test")
                .withFontName("Arial")
                .withFontSize(15)
                .withHeight(12)
                .withWidth(10)
                .build();

        System.out.println(barChart1.toString());
    }
}
