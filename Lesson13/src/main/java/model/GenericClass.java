package model;

import java.io.Serializable;

public class GenericClass<T extends Comparable<String>, V extends Animal & Serializable, K extends Number> {
    private final T t;
    private final V v;
    private final K k;

    public GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printInformationClass() {
        System.out.println(t.getClass().getName());
        System.out.println(v.getClass().getName());
        System.out.println(k.getClass().getName());
    }
}