import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

 public class Result {
    public static void iterateAndDivide(int[] arr, int startAt, int endAt, int divideBy) {
        try {
            System.out.println("Dividing by " + divideBy + ":");
            if (startAt < endAt) {
                for (int i = startAt; i <= endAt; i++) {
                    System.out.println("  Index " + i + ": " + (arr[i] / divideBy));
                }
            } else {
                for (int i = startAt; i >= endAt; i--) {
                    System.out.println("  Index " + i + ": " + (arr[i] / divideBy));
                }
            }
        }


        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
 }
