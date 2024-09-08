import java.util.Deque;
import java.util.LinkedList;

public class TextEditor {
  // Word: append(), undo(), redo()
  private String text;
  private Deque<String> undoStack;
  private Deque<String> redoStack;

  public TextEditor(){
    this.text = "";
    this.undoStack = new LinkedList<String>();
    this.redoStack = new LinkedList<String>();
  }

  public void append(String newText){
    this.undoStack.push(this.text);
    this.text += newText;

  }

  public void undo(){
    if (!this.undoStack.isEmpty()){

      this.redoStack.push(this.text);

      this.text = undoStack.pop();
    } else {
      System.out.println("Nothing to undo");
    }
    
  }

  public void redo(){
    this.undoStack.push(this.text);
    this.text = redoStack.pop();
  }

  public String toString(){
    return this.text;
  }

  public static void main(String[] args) {
    TextEditor editor = new TextEditor();
    editor.append("Hello "); // undoStack: "", this.text: "Hello"
    //System.out.println("undoStack: " + editor.undoStack);
    System.out.println("1: " + editor);
    
    editor.append("World "); // undoStack: "Hello", this.text: "Hello World"
    //editor.append("!!!!!"); // undoStack: "Hello World", "Hello", this.text: "Hello World!!!!!"
    
    System.out.println("2: " + editor);// Hello World
    
    System.out.println("text: " + editor.text);
    System.out.println("undoStack: " + editor.undoStack);
    System.out.println("redoStack: " + editor.redoStack);
    editor.undo();
    // System.out.println("undoStack: " + editor.undoStack);
    System.out.println("3: " + editor);
    editor.redo();
    System.out.println("4: " + editor);
    editor.undo();
    System.out.println("5: " + editor);
    editor.redo();
    System.out.println("6: " + editor);
    editor.undo();
    editor.undo();
    System.out.println("7: " + editor);
    editor.redo();
    editor.redo();
    System.out.println("8: " + editor);
    
  }
}
//!!!!!!!!!!! NOTE !!!!!!!!!!!!!!!
// Deque => focus in adding and removing first element of the queue
// Usually work with isEmpty()
