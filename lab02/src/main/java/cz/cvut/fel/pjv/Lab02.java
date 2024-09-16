/*
 * File name: Lab06.java
 * Date:      2014/08/26 21:39
 * Author:    @author
 */

package cz.cvut.fel.pjv;

import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Lab02 {
    public void start(String[] args) {
        TextIO textIO = new TextIO();
        List<Double> list = new LinkedList<>();
        int count = 0;
        int lines = 0;
        int temp = 0;
        while (true) {
            temp++;
            String line = textIO.getLine();
            if (line.equals("")) {
                break;
            }
            lines++;

            if (!TextIO.isDouble(line)) {
                System.err.println("A number has not been parsed from line " + lines);
                temp--;
            } else {
                list.add(Double.valueOf(line));
                count++;
            }

            if (count == 10) {
                fun(list, count, temp);
                count = 0;
            }
        }

        System.err.println("End of input detected!");
        if (count > 1) {
            temp--;
            fun(list, count, temp);
        }
    }

    private void fun(List<Double> arr, int Count, int temp) {
        double sum1 = 0;
        double sum2 = 0;


        for (int i = temp-Count; i < temp; i++) {
            sum1 += arr.get(i);
        }
        double per2 = sum1 / Count;

        for (int i = temp-Count; i < temp; i++) {
            sum2 += ( arr.get(i) - per2) * ( arr.get(i) - per2);
        }

        double rez = sqrt(sum2 / Count);

        String format = "%2d" + " " + "%.3f" + " " + "%.3f\n";
        System.out.printf(format, Count, per2, rez);
    }
}
