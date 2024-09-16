package cz.cvut.fel.pjv;

import java.util.Arrays;

public class BruteForceAttacker extends Thief {

    char[] Array;
    boolean check;

    @Override
    public void breakPassword(int sizeOfPassword) {
        Array = new char[sizeOfPassword];
        for (int i = 0; i < sizeOfPassword; i++){
            Array[i] = ' ';
        }
        check = tryOpen(Array);
        if(!check){
            breaking(Array, -1, sizeOfPassword);
        }
    }
    public void breaking(char[] Array, int counter_of_size, int sizeOfPassword){
        if (counter_of_size == sizeOfPassword-1) return;
        char[] Array_temp = Arrays.copyOf(Array, sizeOfPassword);
        counter_of_size++;
        for (char i: getCharacters()){
            Array_temp[counter_of_size] = i;
            check = tryOpen(Array_temp);
            breaking(Array_temp, counter_of_size, sizeOfPassword);
            if (check) return;
        }
    }
}