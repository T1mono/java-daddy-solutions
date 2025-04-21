package ru.javadaddy.roadmap.step5_AdvancedBase.topic6_Enums.task5_Operation;

public enum Operation {
    PLUS {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    }, MINUS {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    }, TIMES {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    }, DIVIDE {
        @Override
        public double apply(double x, double y) {
            if (y == 0) {
                throw new ArithmeticException();
            }
            return x / y;
        }
    };

    public abstract double apply(double x, double y);
}
