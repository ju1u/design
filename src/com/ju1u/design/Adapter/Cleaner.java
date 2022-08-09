package com.ju1u.design.Adapter;

public class Cleaner implements Electronic110V{

    @Override
    public void powerOn() {
        System.out.println("청소기 110V on");
    }
}
