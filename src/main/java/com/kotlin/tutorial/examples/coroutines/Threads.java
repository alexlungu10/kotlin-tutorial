package com.kotlin.tutorial.examples.coroutines;

public class Threads {

  public static void main(String[] args) {

    for (int i = 0; i < 1_000_000; i++) {

      new Thread(
              () -> {
                try {
                  Thread.sleep(1000);
                } catch (InterruptedException e) {
                  throw new RuntimeException(e);
                }
                System.out.print(".");
              })
          .start();
    }

    //

  }
}
