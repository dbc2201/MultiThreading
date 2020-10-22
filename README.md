# Multi-Threading in Java

- A `multithreaded` program in Java contains two or more parts that can run
 [`concurrently`](https://www.google.com/search?q=concurrently+meaning), each part of the program is called a 
 `thread`.
- Each `thread` defines a separate path of execution, hence we can say that `multithreading` is a 
special case of `multitasking`.

## Type of Multitasking
1. Process-based
2. Thread-based

- A `process` is essentially a program that is executing, hence, `process-based` multitasking is the feature that allows
a computer to run (or execute) two or more program concurrently.
For example, `Process-based` multitasking allows us to run the Java IDE, Zoom, Google Chrome, WhatsApp etc at the same
time on our computer. Here, a program is the smallest unit of code that can be dispatched by the scheduler.

- In a `thread-based` multitasking environment, a `thread` is the smalled unit of code that can be dispatched by the
scheduler. This means that a single program can execute two or more tasks
[simultaneously](https://www.google.com/search?q=simultaneously+meaning).
For example, we can still edit the code in our IDE when the compiler is compiling it
or the JVM is executing it, as long as these two tasks are being performed on two different threads.

Thus, we can say that,
- The `process-based` multitasking handles the "big-picture", and
- The `thread-based` multitasking handles the "fine-details".

**Multitasking threads require less resources than multitasking processes.**

## The Java Thread Model

The `multi-threading` capabilities of Java are built-in.

States of a thread in Java
1. Running (currently executing)
2. Suspended (paused, after running)
3. Resumed (starting after paused)
4. Blocked (not running, and waiting for a resource)
5. Ready (waiting to run)
6. Terminated (halted OR stopped)

**Thread Priorities**
The Java compiler will assign a `priority` to a thread.
This priority will tell us that how which thread should be treated with respect to others.
Basically, these are some integer values.
But a higher priority of a thread can not guarantee that a thread will perform its task
fast or slow, if it is the only thread running.
Priority of a thread can only be observed properly once there are two or more threads
running concurrently in a program space.
It is basically used to decide that when to switch from one running thread to the next
(context switch).
There are basic two rules for context switching
1. `A thread can voluntarily relinquish(to lose) control`:
This happens when explicitly yielding, sleeping, or when the thread is blocked.
In this, all other threads are examines, and the thread with the highest priority will be 
marked as ready to run.
2. `A thread can be preempted by a higher-priority thread`:
In this, a thread with a low-priority does not yield the processor, but when it is 
preempted by a higher-priority processor, it will yield.
 
# The `Thread` class and the `Runnable` Interface.

Java's multithreading system is built upon the `Thread` class, and its companion
interface, the `Runnable` interface. 

## The `Main` Thread

- Whenever a Java program executes, one thread starts running immediately,
this is called the `main` thread of the program.

- It is important for two main reasons.
1. It is the thread from which all the other threads will be created.
2. It must be the last thread to finish execution because it performs various shutdown 
actions.