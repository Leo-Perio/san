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
