package ch03GuardedSuspension.q3_5;

public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue1 = new RequestQueue();
        RequestQueue requestQueue2 = new RequestQueue();
        new TalkThread(requestQueue1, requestQueue2, "Alice").start();
        new TalkThread(requestQueue2, requestQueue1, "Bobby").start();
    }
}
/*
Alice:BEGIN
Bobby:BEGIN
dead???
 */