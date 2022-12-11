package com.zipcodewilmington.singlylinkedlist;
import org.junit.*;



/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void constructorTest_position0(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        int expected = 0;
        int actual = list.getPosition(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest_position1(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        int expected = 1;
        int actual = list.getPosition(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest_position2(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        int expected = 2;
        int actual = list.getPosition(4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLength4(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        int expected = 4;
        int actual = list.getLength();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLength2(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        int expected = 2;
        int actual = list.getLength();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLength0(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        int expected = 0;
        int actual = list.getLength();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove_withlength_4(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        list.remove(0);
        int expected = 3;
        int actual = list.getLength();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove_withlength_3(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.remove(1);
        int expected = 2;
        int actual = list.getLength();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove_withlength(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.remove(2);
        int expected = 2;
        int actual = list.getLength();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContains_True(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        boolean actual = list.contains(4);
        Assert.assertTrue(actual);
    }

    @Test
    public void testContains_False(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        boolean actual = list.contains(3);
        Assert.assertFalse(actual);
    }

    @Test
    public void testGetValuePosition2(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        int expected = 4;
        int actual = list.getNodeData(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetValuePosition0(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        int expected = 1;
        int actual = list.getNodeData(0);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testCloneLength(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        SinglyLinkedList<Integer> clone = list.clone();

        int expected = 4;
        int actual = clone.getLength();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCloneGet(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        SinglyLinkedList<Integer> clone = list.clone();

        int expected = 1;
        int actual = clone.getNodeData(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetNodeData(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        list.setNodeData(0, 4);
        int expected = 4;
        int actual = list.getNodeData(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLength(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        int expected = 4;
        int actual = list.getLength();
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testSort(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(6);
        list.add(8);
        list.sort();

        System.out.print("[");
        for (int i = 0; i < list.getLength(); i++) {

            if (i == list.getLength() - 1) {
                System.out.print(list.getNodeData(i));
            } else {
                System.out.print(list.getNodeData(i) + ",");
            }
        }
        System.out.print("]\n");
    }


}
