package ru.avk.Shildt.OverLoad;

class OverloadDemo {

    void test() {
        System.out.print("\nПараметры отсутствуют: ");
    }

    void test(int a) {
        System.out.print("\nОдин целочисленный параметр: " + a);
    }

    void test(int a, int b) {
        System.out.print("\nДва целочисленных параметра: " + a + " и" + b);
    }

    double test(double a) {
        System.out.print("\nОдин параметр типа double: " + a);
        return a * a;
    }

    static class Overload {
        public static void main(String[] args) {
            OverloadDemo ob = new OverloadDemo();
            double result;

            ob.test();
            ob.test(10);
            ob.test(10, 20);
            ob.test(123.56);
            System.out.println("\n" + ob.test(123.65));
        }
    }
}
