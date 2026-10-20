import java.util.Scanner;
import java.util.ArrayList;

public class san {
    public static void main(String[] args) {
	File input_file = new File(args[0]);
	Scanner program_file = new Scanner(input_file);
	ArrayList<int> stack = new ArrayList<int>;
	ArrayList<String> program = new ArrayList<String>;

	int linesReached = 0;
	int currentLine = 0;
	while (program_file.hasNextLine()) {
	    String line = "";
	    if (currentLine > linesReached || currentLine == 0) {
		line = program_file.nextLine();
	    }
	    
    }
}
