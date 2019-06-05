package com.fronted.demo.models;

public class Doubled {
    private int received;
    private int result;


    public Doubled(int numberToDouble) {
        this.received = numberToDouble;
        this.result = numberToDouble * 2;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResault() {
        return result;
    }

    public void setResault(Integer resault) {
        this.result = resault;
    }

}
