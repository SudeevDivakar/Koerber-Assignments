package java9;

public class I_ProcessAPIUpdates {
    public static void main(String[] args) {
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("ID: " + currentProcess.pid());
        currentProcess.info().command().ifPresent(cmd -> System.out.println("Command: " + cmd));
        currentProcess.info().startInstant().ifPresent(start -> System.out.println("Start Time: " + start));
        currentProcess.info().arguments().ifPresent(argsList -> System.out.println("Arguments: " + String.join(" ", argsList)));
    }
}