package com.example.java;

import java.util.Stack;

/**
 * Created by Christopher on 9/13/2017.
 */
public class MyQueue<Integer> {

    //declare Stack instant data members
    Stack <Integer> firstStack;
    Stack <Integer> secondStack;

    //define default constructor MyQueue
    MyQueue(){
        firstStack = new Stack<Integer>();
        secondStack = new Stack<Integer>();
    }

    //push value into stack
    public void enqueue(Integer value){
        firstStack.push(value);
    }

    //If second stack is not empty then pop from second stack.
    //If second stack is empty then while first stack is not empty
    //push the values from the first stack into the second stack.
    //Then pop the value from the second stack.
    public void dequeue(){

        if (secondStack.isEmpty()){
            while (!firstStack.isEmpty()){
                secondStack.push(firstStack.pop());
            }
        }
        secondStack.pop();
    }

    //If second stack is not empty then peek from second stack.
    //If second stack is empty then while first stack is not empty
    //push the values from the first stack into the second stack.
    //Then peek the value from the second stack.
    public Integer peek(){
        if (secondStack.isEmpty()){
            while (!firstStack.isEmpty()){
                secondStack.push(firstStack.pop());
            }
        }
        return secondStack.peek();

    }





}
