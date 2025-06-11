package com.geek.core.java.interview.questions.singleton.concept;

import com.geek.core.java.interview.questions.singleton.concept.lazyIntantiation.LazySynchronized;

/**
 * Java Singleton Class<p>
 *  - It is a class that can have only one object/instance at a time. Once instance is initialized,
 *      if we try to create new instance of the same class, the already existing instance will be returned.<p>
 *  - Whatever modifications we do to any variable inside the singleton class, affects the variable of the same instance.<p>
 *
 *  Purpose of Singleton class: <p>
 *      - To restrict the limit on the no. of object creations to only one. This often ensures that there is access control to resources.
 *          For e.g., A Socket or a database connection.<p>
 *      - Memory Efficient: As the object creation will take place only once instead of creating it each time a new request is made,
 *          which reduces the overhead & make it memory efficient.<p>
 *      - Resource Control: Restrict the new object creation in multi-threaded & database applications mostly make use of the Singleton pattern
 *          for caching, logging, thread pooling, configuration settings etc.<p>
 *      - Thread safety: For e.g., there is a license with us & we have only one database connection or suppose our JDBC driver doesn't allow us to
 *          do multithreading, then the Singleton class comes into the picture & make sure that at a time, only a single connection or a single thread
 *          can access the connection.
 *  <p>
 *  Example of Singleton class: Runtime class
 *  <p>
 *  Normal Class Vs Singleton Class<p>
 *      1. To instantiate a normal class, we use a  java constructor while to instantiate a singleton class, we use the getInstance() method.<p>
 *      2. A normal class vanishes at the end of the lifecycle of the application while the singleton class doesn't destroy with the completion of an application.
 *
 *  <p>
 *   Use cases:<p>
 *      1. Use Eager initialization if resource is not a concern.<p>
 *      2. Use Double-checked locking or Bill Pugh Singleton for efficient Lazy initialization<p>
 *      3. Use Enum singleton for simplicity & robustness<p>
 */
public class SingletonMain {
    public static void main(String[] args) {
        LazySynchronized instance1 = LazySynchronized.getInstance();
        System.out.println(instance1.hashCode());

        LazySynchronized instance2 = LazySynchronized.getInstance();
        System.out.println(instance2.hashCode());
    }
}
