package com.study.java17.sealedClass;


sealed interface shape permits Circle, Rectangle {

}

 sealed class  Circle implements shape permits Semicircle {

}

final class Semicircle extends Circle{

}

 non-sealed class  Rectangle implements shape  {

}

class Square extends Rectangle{

}


public class SealedClassExample {

    public static void main(String[] args) {

    }
}
