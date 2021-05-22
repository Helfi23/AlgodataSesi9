/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author Helfi Apriliyandi F
 */
import java.util.Arrays;
import static java.util.concurrent.TimeUnit.NANOSECONDS;

public class Selectionsort {

  public static void main(String[] args) {
    int[] arr = {21,22,45,68,76,54,91,23,65,76}; 

    int min = arr[0];
    int index = 0;
    int swappingProcess = 0;

    long startTime = System.nanoTime();

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i; j < arr.length; j++) {
        if ( arr[j] < min ) {
          min = arr[j];
          index = j;
          swappingProcess++;
        }
        System.out.println(Arrays.toString(arr) + " - Jumlah Swap : " + swappingProcess);
      }
      if ( min < arr[i] ) {
        arr[index] = arr[i];
        arr[i] = min;
      }
      min = arr[i + 1];
    }

    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    System.out.println("Waktu Proses Yang Di Perlukan : " + timeElapsed + " Nano Detik");



  }

} 
