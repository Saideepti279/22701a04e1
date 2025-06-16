class Main {
    public int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
        public static void main(String[] args){
            Main obj = new Main();
            int n = 10;
            System.out.println("Fibonacci number at position " + n +" is " + obj.fib(n));
        }
    
}
