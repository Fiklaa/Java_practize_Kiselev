package practize6;



import java.util.Stack;

interface Command {
    void execute();
    void undo();
}

public class UndoStringBuilder {
    final StringBuilder sb = new StringBuilder();
    final Stack<Command> commandHistory = new Stack<>();

    public void append(String str) {
        AppCommand command = new AppCommand(this, str);
        command.execute();
        this.commandHistory.push(command);
    }

    public void delete(int start, int end) {
        DelCommand command = new DelCommand(this, start, end);
        command.execute();
        this.commandHistory.push(command);
    }

    public void undo() {
        if (!this.commandHistory.isEmpty()) {
            Command lastCommand = this.commandHistory.pop();
            lastCommand.undo();
        }
    }

    public String toString() {
        return this.sb.toString();
    }

    private void doAppend(String str) {
        this.sb.append(str);
    }

    private void doDelete(int start, int end) {
        this.sb.delete(start, end);
    }

    private void undoAppend(String str) { this.sb.delete(this.sb.length() - str.length(), this.sb.length()); }

    private void undoDelete(String deletedText, int start) {
        this.sb.insert(start, deletedText);
    }

    private class AppCommand implements Command {
        private UndoStringBuilder usb;
        private String text;

        public AppCommand(UndoStringBuilder usb, String text) {
            this.usb = usb;
            this.text = text;
        }

        @Override
        public void execute() {
            this.usb.doAppend(this.text);
        }

        @Override
        public void undo() {
            this.usb.undoAppend(this.text);
        }
    }

    private class DelCommand implements Command {
        private UndoStringBuilder usb;
        private String deletedText;
        private int start, end;

        public DelCommand(UndoStringBuilder usb, int start, int end) {
            this.usb = usb;
            this.start = start;
            this.end = end;
            this.deletedText = usb.sb.substring(start, end); // Сохраняем удаляемый текст
        }

        @Override
        public void execute() {
            usb.doDelete(this.start, this.end);
        }

        @Override
        public void undo() {
            usb.undoDelete(this.deletedText, this.start);
        }
    }

    public static void main(String[] args){
        UndoStringBuilder usb = new UndoStringBuilder();

        usb.append("РТУ");
        System.out.println("Добавили: " + usb);
        usb.append(" МИРЭА");
        System.out.println("Второй раз добавили: " + usb);
        usb.delete(2, 9);
        System.out.println("Удалили 2->9 символы: " + usb);
        usb.undo();
        System.out.println("Первый undo: " + usb);
        usb.undo();
        System.out.println("Второй undo: " + usb);
    }
}
