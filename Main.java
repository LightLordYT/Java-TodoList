import java.util.Scanner;
import java.util.ArrayList;

//TODO[0] save data to file

class Main {
    static ArrayList<String> todos = new ArrayList<String>();

    static boolean isString(String str){
	if(str instanceof String) return true;
	return false;
    }
    
    //i don't know java killing my brain
    static ArrayList<String> getTodos(){
	return todos;
    }

    static void menu(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Menu: ");
	System.out.println("Remove Todo(r), Add Todo(y), See Todos(s), Quit(q)");
	System.out.println("Operation: ");
	String operation = scanner.nextLine();
	if(isString(operation)){
	    switch(operation){
	    case "y":
		addTodo();
		break;
	    case "r":
		removeTodo();
		break;
	    case "s":
		System.out.println(getTodos());
		menu();
		break;
	    case "q":
		System.exit(0);
	    }
	}
	else{
	    System.out.println("invalid input");
	    menu();
	}
    }
    
    static void removeTodo(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Remove Todo: ");
	String output = scanner.nextLine();
	if(isString(output)) {
	    todos.remove(todos.indexOf(output));
	    System.out.println("Todo Successfully Removed");
	    menu();
	}else{
	    System.out.println("invalid input");
	    removeTodo();
	}
    }

    static void addTodo(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("New Todo: ");
	String output = scanner.nextLine();
	if(isString(output)) {
	    todos.add(output);
	    System.out.println("Todo Successfully Added.");
	    menu();
	}else{
	    System.out.println("invalid input");
	    addTodo();
	}
    }

    static void ask(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Add a todo(y), Remove a todo(r), Quit(q)?");
	String output = scanner.nextLine();
	switch (output){
	case "y":
	    addTodo();
	    break;
	case "q":
	    System.exit(0);
	case "r":
	    removeTodo();
	}
    }
    
    public static void main(String[] args){
	//todolist	
	System.out.println("Todolist");
	ask();
    }
}
