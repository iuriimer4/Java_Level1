package Lesson2;

import java.util.Arrays;

public class Lesson2 {

  public static void main(String[] args) {
    task_1();
    task_2();
    task_3();
    task_4();
    task_5();

  }

  /*
   * Task_1
   *
   * */
  public static void task_1() {
    int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

    for (int i = 0; i < array.length; i++) {
      if (array[i] == 1) array[i] = 0;
      else array[i] = 1;
    }
    System.out.println("Task_1: ");
    System.out.println(Arrays.toString(array));

  }

  /*
   * Task_2
   * */
  public static void task_2() {
    int[] array = new int[8];
    int j = 0;

    for (int i = 0; i < array.length; i++, j = j + 3) {
      array[i] = j;

    }

    System.out.println("Task_2: ");
    System.out.println(Arrays.toString(array));

  }
  /*
   * Task_3
   * */

  public static void task_3() {

    int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    System.out.println("Task_3: ");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 6) arr[i] = arr[i] * 2;
      System.out.println(arr[i] + " ");
    }

  }


  /*
   * Task_4
   * */
  public static void task_4() {
    int length = 5;
    int[][] arr = new int[length][length];
    System.out.println("Task_4: ");
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {

        if ((i == j) || (i == length - 1 - j)) {
          arr[i][j] = 1;

        }

      }

    }
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();


    }


  }
  /*
  * Task_5
  * */

  public static void task_5() {
    int[] array = {1, 5, 3, 2, 10, 8, 25, 10, 9, 6, 0, -1, 11};
    int min = array[0];
    int max = array[0];

    System.out.println("Task_5: ");

    for (int i : array) {

      System.out.println(i + " ");
    }
    for (int i = 0; i < array.length; i++) {
      min = (min < array[i]) ? min : array[i];
      max = (max > array[i]) ? max : array[i];

    }
    System.out.println("\n minimal element is: " + min + "\n maximal element is: " + max);
  }
}