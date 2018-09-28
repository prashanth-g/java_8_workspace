package com.prashanth;

@FunctionalInterface
public interface FunctionalInterface01{
    void display(String data);
}

class FunctionInterfaceC01 {

    public static void main(String[] args){

        FunctionalInterface01 functionalInterface01 = (data) -> {
            System.out.println(data + " By FunctionalInterface01");
        };

        functionalInterface01.display("F01");
    }
}