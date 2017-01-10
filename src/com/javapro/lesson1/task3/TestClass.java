package com.javapro.lesson1.task3;

import java.io.*;

/**
 * Created by smith on 16.12.16.
 */
public class TestClass implements Serializable{
    @Save
    private int a = 5;
    private double b = 10.0;
    @Save
    private boolean c = true;
    @Save
    private String d = "hello";


}
