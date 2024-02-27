public class Thread_p {
    public static void main(String[] args) {
        // Thread atual
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        MeuRunnable meuRunnable = new MeuRunnable();

        // Nova thread
        Thread t1 = new Thread(meuRunnable);
        // t1.run(); // apenas executando na mesma thread

        // Runnable como lambda
        Thread t2 = new Thread(() -> System.out
                .println(Thread.currentThread().getName()));
        // t2.start(); // NÃO FAÇA! VAI LANÇAR EXCEÇÃO!

        // Várias threads
        Thread t3 = new Thread(meuRunnable);

        t1.start(); // executando em uma nova thread
        t2.start();
        t3.start();
    }
}
