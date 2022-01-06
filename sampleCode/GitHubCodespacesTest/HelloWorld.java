package sampleCode.GitHubCodespacesTest;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello Ephrata HS");
        thisIsAMethod();
        thisIsAnotherMethod(2);
    }

    public static void thisIsAMethod() {
        System.out.println("Hi! I'm a method.");
    }

    public static void thisIsAnotherMethod(int x) {
        System.out.println(x);
    }
}