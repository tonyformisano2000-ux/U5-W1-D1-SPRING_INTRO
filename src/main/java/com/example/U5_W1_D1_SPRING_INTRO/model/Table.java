package com.example.U5_W1_D1_SPRING_INTRO.model;

public class Table {
   private int number;
   private int covers;
   private TableState state ;

   public Table(int number, int covers, TableState state){
       setNumber(number);
       setCovers(covers);
       this.state= state;
   }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCovers() {
        return covers;
    }

    public void setCovers(int covers) {
        this.covers = covers;
    }

    public TableState getState() {
        return state;
    }

    public void setState(TableState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Table{" +
                "number=" + number +
                ", covers=" + covers +
                ", state=" + state +
                '}';
    }
}
