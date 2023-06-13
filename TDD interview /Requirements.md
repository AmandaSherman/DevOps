# Requirements

## Goal 4+ function calculator that takes a string as an input and outputs a string with the answer...

Step 1:
	"{anything}" -> "0"

Step 2:
	"{any number}" -> "{the same number}"
    
Step 3:
	"{any non-recognized input}" -> "Error - Input includes unrecognized character(s)"

Step 4: handle + operator
	Step 4.1:
		recognize + operator if between two numbers...	
	Step 4.2:
		"{number}+{number}" -> "{sum}"
	Step 4.3:
		"+{number}" -> "{number}"
	Step 4.4:
		"{number}++{number}" -> "Error - Invalid syntax"
