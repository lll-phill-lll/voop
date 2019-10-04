package com.company;

public class Ship {
    private int count;
    private Size size;
    private Type type;


    public enum Type {
        DRESS(1), BANANA(2), MEAL(3);
        private int type;

        Type(int type) {
            this.type = type;
        }
    }

    public enum Size {
        SMALL(10), MIDDLE(50), LARGE(100);

        Size(int value){
            this.value = value;
        }
        private int value;

        public int getValue() {
            return value;
        }
    }

    public Ship(Size size, Type type) {
        this.size = size;
        this.type = type;
    }

    public void add(int count) {
        this.count += count;
    }

    public boolean countCheck() {
        if (count >= size.getValue()) {
            return false;
        }
        return true;
    }

    public int getCount() {
        return count;
    }

    public Type getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }
}

