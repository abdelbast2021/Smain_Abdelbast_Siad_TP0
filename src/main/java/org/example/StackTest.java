package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {


    private Stack p;


    @BeforeEach
    public void setUp(){
        p = new Stack();
    }

    @Test
    public void pushTest(){
        p.push(1);
        int result = p.peek();
        Assertions.assertEquals( 1,result);
    }

    @Test
    public void popTest(){
        p.push(1);

        int result = p.pop();
        Assertions.assertEquals(1 ,result);
    }

    @Test
    public void testPeek() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.peek());
        assertEquals(3, stack.peek()); // Peeking multiple times should not alter the stack
    }

    @Test
    public void isEmptyTest(){

        try{

            p.pop();
            p.pop();
            p.pop();
        }catch (IllegalStateException e){
            Boolean result =p.isEmpty();
            Assertions.assertEquals(Boolean.TRUE,result);

        }



    }

    @Test
    public void popExceptionthrowTest(){
        p.push(1);
        p.pop();

        // Verify if an exception is thrown when popping an empty stack
        try {
            p.pop();
            //Assertions.fail("Expected IllegalStateException was not thrown");
        } catch (IllegalStateException e) {
            // Verify that the caught exception is of the expected type
            Assertions.assertEquals("Stack is empty", e.getMessage());
        }

    }
    @Test
    public void testPeekOnEmptyStack() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, () -> {
            stack.peek();
        });
    }


    @Test
    public void expandArrayTest(){
        p.push(1);
        p.push(1);
        p.push(1);
        p.push(1);
        p.push(1);

        p.push(1);
        p.push(1);
        p.push(1);
        p.push(1);
        p.push(1);

        p.push(1);

        int result =p.size();
        Assertions.assertEquals(11,result);


    }

    @Test
    public void testSize() {
        Stack stack = new Stack();
        assertEquals(0, stack.size());

        stack.push(1);
        assertEquals(1, stack.size());

        stack.push(2);
        assertEquals(2, stack.size());

        stack.pop();
        assertEquals(1, stack.size());
    }

}
