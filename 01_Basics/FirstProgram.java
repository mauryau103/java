/**
 * FirstProgram
 */
public class FirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

//class keyword is used to declare a class in java
//public keyword is a access modifier which represent visibility.It means it is visible to all
//static is a keyword.If we declare any method as a static, it is known as a static method.the core advantage of the static method is that there is no need to create an object to invoke the static method.The main method is executed by JVM,so it does'nt require to create an object to invoke the method.so it saves memory.
//void is the return type of the method.it means it does not return any value.
//main return the starting point of the program
//String[] args is used for command line argument.
//System.out.println() -->it is used print statement.

//--> if you executed the class file that does not exist, a NoClassDefFoundError will occur.
//--> if you executed a class file that does not have a main method or you have typed a main method wrong like instead of main you have typed Main then NoSuchMethodError will occur.

//********************************************Note*************************************************/

/*
 
Welcome.java(java source-code file)-->"compiled by"--> java compiler-->"generates"-->Welcome.class(javabytecode executable file)

-->"executed by"-->JVM

jab hum log java program ko pahle compile karte hai to java compiler code ko java bytecode me convert karta hai...now phir jab hum log use execute karte hai tab JVM load karta hai class ke bytecode ko memory me by using program called the class loader .and suppose apke class ke andar koi dusra class bhi call hua hai to class loader dynamically loads them when they are needed. and it execute accordingly
 */

