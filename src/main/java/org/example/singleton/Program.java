package org.example.singleton;

public class Program {
    public static void main(String[] args) {
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.getName();
        singletonEnum.setName("Oleg");
        singletonEnum.getName();

        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        singletonEnum2.getName();
        singletonEnum2.setName("Mihail");
        singletonEnum2.getName();
        System.out.println(singletonEnum == singletonEnum2);
        System.out.println("========================================");

////////////////////////////////////////////////////////////////////////////////

        SingletonThreadSafe.getProgramLogger().addLogInfo("First log...");
        SingletonThreadSafe.getProgramLogger().addLogInfo("Second log...");
        SingletonThreadSafe.getProgramLogger().addLogInfo("Third log...");

        SingletonThreadSafe.getProgramLogger().showLogFile();


    }
}
