/*
    Main file for the san programming language.
    Copyright (C) 2026 Leo Perio

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class san {
    public static String[][] parseFile(String fileName) throws FileNotFoundException {
	File file = new File(fileName);

	int count = 0;
        try (Scanner linecount = new Scanner(file)) {
	    while (linecount.hasNextLine()) {
		linecount.nextLine();
		count++;
	    }
	}
        String[][] tokenized = new String[count][];
        try (Scanner program = new Scanner(file)) {
	    for (int i = 0; i < count; i++) {
		String newLine = program.nextLine();

		if (newLine.length() < 2) {
		    System.out.printf("Error! Line %d doesn't have enough characters!", count);
		    System.exit(1);
		}

		newLine = newLine.substring(1, newLine.length()-1);
		tokenized[i] = newLine.split(" ");
	    }
	}
	return tokenized;
    }
    
    public static int executor(String[][] program) {
	
    }

    public static void main(String[] args) throws FileNotFoundException {
	String[][] program = parseFile(args[0]);
	ArrayList<Integer> stack = new ArrayList<Integer>();

	System.exit(executor(program));
    }
}
