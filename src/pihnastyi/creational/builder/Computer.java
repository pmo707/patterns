package pihnastyi.creational.builder;

class Computer {

    private int x;
    private int y;

    private Computer(Builder builder) {
        this.x = builder.x;
        this.y = builder.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static class Builder {
        private int x;
        private int y;

        public Builder(int x) {
            this.x = x;
        }

        public Builder setY(int y) {
            this.y = y;
            return this;
        }

        Computer build() {
            return new Computer(this);
        }
    }

}