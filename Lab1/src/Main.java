public class Main {


    public static void main(String[] args) {
        printall printer = new printall();
        printer.printstring("Hello, world!");
        printer.printnum(42);
        printer.printdub(23.22);
    }


    public static class printall<T> {
        private T variablename;

        public printall() {
            this.variablename = variablename;
        }

        public <T> void printnum(T variablename) {
            System.out.println(variablename);
        }

        public <T> void printdub(T variablename) {
            System.out.println(variablename);
        }

        public <T> void printstring(T variablename) {
            System.out.println(variablename);
        }
    }
}

