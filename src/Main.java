import parser.*;

import org.antlr.v4.runtime.*;

public class Main {
	
	public static void main(String... args) throws Exception {

		var file = "C:\\Users\\hoooc\\IdeaProjects\\lab4_syntax_recognition\\input.txt";
		   		 			
		 // create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(file);
		CmmLexer lexer = new CmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		CmmParser parser = new CmmParser(tokens);	
		parser.program();		
	}
	

}
