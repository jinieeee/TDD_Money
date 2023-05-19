package com.example.tdd.money.domain;

// unused
public class Franc extends Money {

    private String currency;

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

//    Franc과 Dollar의 times가 동일해졌다. 상위 클래스로 올릴 수 있다.
//    public Money times(int multiplier) {
//        return new Money(amount * multiplier, currency);
//    }

    @Override
    public String currency() {
        return "CHF";
    }
}
