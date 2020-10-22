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
 