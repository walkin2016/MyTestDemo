package com.post;


import java.util.Arrays;
import java.util.logging.Logger;

import static com.post.Checker.check;


public class Bits {
  private static final int MAX_BIT_SIZE = 1024 * 8; // 如果要求bitIdx过大，就不要用这个了

  private byte[] bs;

  public Bits() {
    this.bs = new byte[2];
  }

  public Bits(byte[] bs) {
    this.bs = bs;
  }

  public void set(int i) {
//    Checker.check(i >= 0);
    if (i > MAX_BIT_SIZE) {
      String s = "Bits.set 位置过大，会占用非常多的内存! " + i;
      System.out.println(s);
    }

    int bi = i / 8;
    int pi = i % 8;

    if (bs.length <= bi) {
      bs = Arrays.copyOf(bs, bi + 1);
    }
    bs[bi] |= 1 << pi;
  }

  public boolean isSet(int i) {
    int bi = i / 8;
    if (bs.length <= bi) {
      return false;
    }

    int pi = i % 8;
    return (bs[bi] & (1 << pi)) != 0;
  }

  public int count() {
    int c = 0;
    for (byte b : bs) {
      for (int i = 0; i < 8; i++) {
        if ((b & (1 << i)) != 0) {
          c++;
        }
      }
    }
    return c;
  }

  public void setBits(byte[] bs) {
    this.bs = bs;
  }

  public byte[] raw() {
    return bs;
  }
}
