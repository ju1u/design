package com.ju1u.design.Adapter;

public class Airconditioner implements Electronic220V{

    @Override
    public void connect() {
        System.out.println("에어컨 220V on");
    }
}
