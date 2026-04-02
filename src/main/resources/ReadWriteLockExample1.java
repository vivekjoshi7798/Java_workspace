package com.study.multithreading.lock;
/*
Implement a system that allows multiple readers to access a resource concurrently, but only one writer at a time using `ReadWriteLock`.

Requirements:
     - Create a shared resource that supports both reading and writing operations.
     - Use `ReentrantReadWriteLock` to ensure that multiple threads can read simultaneously, but writing operations must be exclusive.
     - Simulate multiple threads reading and writing to the shared resource, and ensure that the lock behavior is respected.

Implement fairness for the readers and writers using the `fair` parameter of `ReentrantReadWriteLock`.*/


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Library {

    ReadWriteLock lock= new ReentrantReadWriteLock(true);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public void readArticle() {
        System.out.println("Trying to acquire read lock by : " + Thread.currentThread().getName());
        try{
            lock.readLock().lock();
            System.out.println("Reading has been started at : "+ LocalDateTime.now().format(formatter) +" by : " + Thread.currentThread().getName());
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println("Exception : " + e.getMessage());

        }
        finally {
            lock.readLock().unlock();
            System.out.println("Reader   has been ended at : "+  LocalDateTime.now().format(formatter)  +" by : " + Thread.currentThread().getName());
        }
    }


    public void writeArticle() {
        System.out.println("Trying to acquire writeLock lock by : " + Thread.currentThread().getName());
        try{
            lock.writeLock().lock();
            System.out.println("Writing  has been started at : "+  LocalDateTime.now().format(formatter)  +" by : " + Thread.currentThread().getName());
            Thread.sleep(20000);
        }catch (Exception e){
            System.out.println("Exception : " + e.getMessage());

        }
        finally {
            lock.writeLock().unlock();
            System.out.println("Writing  has been ended at : "+  LocalDateTime.now().format(formatter)  +" by : " + Thread.currentThread().getName());
        }
    }
}
public class ReadWriteLockExample1 {
    public static void main(String[] args) {
        Library compDept= new Library();
        Library mechDept= new Library();

        Thread[] students = new Thread[] {
            new Thread(compDept::readArticle, "Student 1"),
            new Thread(compDept::readArticle, "Student 2"),
            new Thread(compDept::writeArticle, "Student 3"),
            new Thread(compDept::readArticle, "Student 4"),
                new Thread(compDept::readArticle, "Student 19"),
                new Thread(compDept::readArticle, "Student 20"),

            new Thread(mechDept::readArticle, "Student 5"),
            new Thread(mechDept::writeArticle, "Student 6"),
            new Thread(mechDept::readArticle, "Student 7"),
            new Thread(mechDept::readArticle, "Student 8")
        };

        for (Thread student : students) {
            student.start();
        }



    }


}


/*
Trying to acquire writeLock lock by : Student 6
Trying to acquire read lock by : Student 19
Trying to acquire read lock by : Student 7
Trying to acquire read lock by : Student 8
Trying to acquire read lock by : Student 5
Trying to acquire writeLock lock by : Student 3
Trying to acquire read lock by : Student 2
Trying to acquire read lock by : Student 4
Trying to acquire read lock by : Student 1
Trying to acquire read lock by : Student 20
Writing  has been started at : 2026-01-22 18:26:34 by : Student 6
Reading has been started at : 2026-01-22 18:26:34 by : Student 19
Writing  has been started at : 2026-01-22 18:26:44 by : Student 3
Reader   has been ended at : 2026-01-22 18:26:44 by : Student 19
Reading has been started at : 2026-01-22 18:26:54 by : Student 7
Reading has been started at : 2026-01-22 18:26:54 by : Student 5
Reading has been started at : 2026-01-22 18:26:54 by : Student 8
Writing  has been ended at : 2026-01-22 18:26:54 by : Student 6
Writing  has been ended at : 2026-01-22 18:27:04 by : Student 3
Reading has been started at : 2026-01-22 18:27:04 by : Student 2
Reading has been started at : 2026-01-22 18:27:04 by : Student 20
Reading has been started at : 2026-01-22 18:27:04 by : Student 4
Reading has been started at : 2026-01-22 18:27:04 by : Student 1
Reader   has been ended at : 2026-01-22 18:27:04 by : Student 5
Reader   has been ended at : 2026-01-22 18:27:04 by : Student 7
Reader   has been ended at : 2026-01-22 18:27:04 by : Student 8
Reader   has been ended at : 2026-01-22 18:27:14 by : Student 4
Reader   has been ended at : 2026-01-22 18:27:14 by : Student 20
Reader   has been ended at : 2026-01-22 18:27:14 by : Student 2
Reader   has been ended at : 2026-01-22 18:27:14 by : Student 1

conclusion  :



Using a fair ReentrantReadWriteLock, the system allows concurrent readers while guaranteeing exclusive writes,
 which prevents starvation, and enforces FIFO ordering per shared resource
*/
