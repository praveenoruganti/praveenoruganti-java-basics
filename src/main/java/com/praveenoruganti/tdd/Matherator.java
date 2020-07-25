package com.praveenoruganti.tdd;

public class Matherator implements Adder, Subtractor, Multiplier, Divider, Power {

  @Override
  public long add(long... operands) {
    long ret = 0;
    for (long operand : operands) {
      ret += operand;
    }
    return ret;
  }

  @Override
  public long subtract(long... operands) {
    long ret = operands[0];
    for (int aa = 1; aa < operands.length; aa++) {
      ret -= operands[aa];
    }
    return ret;
  }

  @Override
  public long multiply(long... operands) {
    long ret = operands[0];
    for (int aa = 1; aa < operands.length; aa++) {
      ret *= operands[aa];
    }
    return ret;
  }

  @Override
  public long divide(long... operands) {
    long ret = operands[0];
    for (int aa = 1; aa < operands.length; aa++) {
      ret /= operands[aa];
    }
    return ret;
  }

  @Override
  public long pow(long... operands) {
    long ret = operands[0];
    for (int aa = 1; aa < operands.length; aa++) {
      long base = ret;
      long exponent = operands[aa];
      if (exponent < 0) {
        throw new IllegalArgumentException("Unfortunately, this method only accepts positive integer powers. Sorry.");
      }
      long result = 1;
      for (long bb = 0; bb < exponent; bb++) {
        result *= base;
      }
      ret = result;
    }
    return ret;
  }

}
