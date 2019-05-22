package com.fpfos.algorithm.sorting;

import java.util.Arrays;

/** @author Fu Pengfei @Date 2019-05-21 @Description TODO */
public class Example {

  public static void sort(Comparable[] a) {}

  public static boolean isSorted(Comparable[] a) {
    for (int i = 1; i < a.length; i++) {
      if (less(a[i], a[i - 1])) {
        return false;
      }
    }
    return true;
  }

  private static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
  }

  private static void exch(Comparable[] a, int i, int j) {
    Comparable t = a[i];
    a[i] = a[j];
    a[j] = t;
  }

  private static void show(Comparable[] a) {
    Arrays.stream(a).forEach(System.out::println);
  }

  public static void main(String[] args) {
    String[] a = new String[] {"dd", "ff", "cc", "bb", "aa"};
    sort(a);
    assert isSorted(a);
    show(a);
  }
}
