package exercise.singleton;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance;
    private final List<String> commandHistory;

    private Undo() {
        commandHistory = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        commandHistory.add(command);
    }

    public String undoCommand() {
        if (commandHistory.isEmpty()) {
            throw new IllegalStateException("Cannot undo: command history is empty");
        }
        return commandHistory.remove(commandHistory.size() - 1);
    }

    public void showHistory() {
        if (commandHistory.isEmpty()) {
            System.out.println("History is empty");
        } else {
            System.out.println("Command history:");
            for (int i = 0; i < commandHistory.size(); i++) {
                System.out.println((i + 1) + ": " + commandHistory.get(i));
            }
        }
    }
}
