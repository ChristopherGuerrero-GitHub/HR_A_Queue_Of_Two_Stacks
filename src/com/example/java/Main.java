package com.example.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            This program is a solution to HackerRank problem Queue of Two Stacks

            In this challenge, you must first implement a queue using two stacks.
            Then process queries, where each query is one of the following types:

            1. 1 x: Enqueue element x into the end of the queue.
            2. 2: Dequeue the element at the front of the queue.
            3. 3: Print the element at the front of the queue.

            The first line contains a single integer, q , denoting the number of queries.
            Each line i of the q subsequent lines contains a single query in the form described
            in the problem statement above. All three queries start with an integer denoting
            the query type, but only query 1 is followed by an additional space-separated value, x,
            denoting the value to be enqueued.

            For each query of type , print the value of the element at the front of the queue
            on a new line.

         */

/*
        Sample input:
        10
        1 42
        2
        1 14
        3
        1 28
        3
        1 60
        1 78
        2
        2
                Sample output: 14 14
*/

        //create a queue object
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) {        // enqueue put integer into queue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue remove the integer value from queue
                queue.dequeue();
            } else if (operation == 3) { // print/peek value in the queue FIFO
                System.out.println(queue.peek());
            }
        }
        scan.close();




	}
}
