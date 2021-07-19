package org.example.singleton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe programLogger;
    private static String logFile = "This is log file. \n\n";

    public static synchronized SingletonThreadSafe getProgramLogger(){
        if(programLogger == null){
            programLogger = new SingletonThreadSafe();
        }
        return programLogger;
    }

    private SingletonThreadSafe(){

    }

    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }

}
