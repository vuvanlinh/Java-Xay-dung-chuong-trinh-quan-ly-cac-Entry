package codegym.test;

import codegym.todo.Entry;
import codegym.todo.TodoList;

import java.util.Scanner;

public class TestTodo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        TodoList todoList = new TodoList();
        Entry entry1 = new Entry(5, "an sang");
        Entry entry2 = new Entry(2, "den lop");
        Entry entry3 = new Entry(3, "hoc");
        Entry entry4 = new Entry(10, "lam bai tap");
        Entry entry5 = new Entry(12,"di ngu");

        todoList.addEntry(entry1);
        todoList.addEntry(entry2);
        todoList.addEntry(entry3);
        todoList.addEntry(entry4);
        todoList.addEntry(entry5);


        todoList.sortList();

        todoList.removeEntry(12);





    }
}
