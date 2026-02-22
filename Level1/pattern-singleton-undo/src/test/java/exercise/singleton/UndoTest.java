package exercise.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class UndoTest {

    @Test
    public void testSingletonReturnSameInstance() {
        Undo instance1 = Undo.getInstance();
        Undo instance2 = Undo.getInstance();

        assertSame(instance1, instance2, "Both instances should be the same");
    }

    @Test
    public void testAddCommand() {
        Undo undo = Undo.getInstance();
        String command = "mkdir test";

        undo.addCommand(command);

        String undoneCommand = undo.undoCommand();
        assertEquals(command, undoneCommand, "The undone commnad should match the added one");
    }

    @Test
    public void testUndoCommand() {
        Undo undo = Undo.getInstance();
        String command1 = "mkdir folder";
        String command2 = "cd folder";

        undo.addCommand(command1);
        undo.addCommand(command2);

        String undoneCommand = undo.undoCommand();
        assertEquals(command2, undoneCommand, "Undo should return the last command");

        String nextUndone = undo.undoCommand();
        assertEquals(command1, nextUndone, "After second undo, should return first command");
    }

    @Test
    public void testShowHistory() {
        Undo undo = Undo.getInstance();

        undo.showHistory();

        undo.addCommand("mkdir folder1");
        undo.addCommand("cd folder1");
        undo.addCommand("touch file.txt");

        undo.showHistory();
    }

    @Test
    public void testUndoCommandWhenEmptyThrowsException() {
        Undo undo = Undo.getInstance();

        assertThrows(IllegalStateException.class,
                () -> undo.undoCommand(),
                "Should throw exception when history is empty");
    }
}
