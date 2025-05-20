package CommandPattern;

import java.util.ArrayDeque;
import java.util.Deque;

interface Command{
    void execute();
    void undo();
}

class AddCommand implements Command{

    private Calculator calculator;
    private int value;

    public AddCommand(Calculator calculator,int value){
        this.calculator=calculator;
        this.value=value;
    }

    @Override
    public void execute(){
        calculator.add(value);
    }

    @Override
    public void undo(){
calculator.subtract(value);
    }
}

class SubtractCommand implements  Command{

    private Calculator calculator;
    private int value;

    public SubtractCommand(Calculator calculator,int value){
        this.calculator=calculator;
        this.value=value;
    }

    @Override
    public void execute(){
calculator.subtract(value);
    }

    @Override
    public void undo(){
        calculator.add(value);
    }
}

class Calculator{
    private int total;

    public void add(int value){
        total=total+value;
        System.out.println(total);
    }

    public void subtract(int value){
        total=total-value;
        System.out.println(total);
    }

    public int getTotal(){
        return total;
    }
}

class CalculatorManager{

    private final Deque<Command> undoStack= new ArrayDeque<>();
    private final Deque<Command> redoStack=new ArrayDeque<>();

    public void run(Command command){
        command.execute();
        undoStack.push(command);
        redoStack.clear();
    }

    public void undo(){
        if(undoStack.isEmpty()){
            System.out.println("Nothing to undo");
        }
        Command command=undoStack.pop();
        command.undo();
        redoStack.push(command);
    }

    public void redo(){
        if(redoStack.isEmpty()){
            System.out.println("Nothing to redo");
        }
        Command command=redoStack.pop();
        command.execute();
        undoStack.push(command);
    }

}


public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        CalculatorManager mgr = new CalculatorManager();

        mgr.run(new AddCommand(calc, 5));       // Total is now: 5
        mgr.run(new SubtractCommand(calc, 3));  // Total is now: 2

        mgr.undo();   // undo subtract → Total is now: 5
        mgr.undo();   // undo add      → Total is now: 0

        mgr.redo();   // redo add      → Total is now: 5
        mgr.redo();   // redo subtract → Total is now: 2
    }
}
