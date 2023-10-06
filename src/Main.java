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
		for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
			System.out.println(token);
		}
		tokens.reset(); // Reset the token stream.

		CmmParser parser = new CmmParser(tokens);
		CmmParser.ProgramContext tree = parser.program();


		System.out.println(tree.toStringTree(parser));
	}
}
