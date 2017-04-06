
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.objectweb.asm.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    private static final DecimalFormat _format = new DecimalFormat();

    static {
        DecimalFormatSymbols _symbols = new DecimalFormatSymbols();
        _symbols.setDecimalSeparator('.');
        _symbols.setGroupingSeparator(Character.MIN_VALUE);
        _format.setDecimalFormatSymbols(_symbols);
    }

    public static double parse(String text) throws ParseException {
        return _format.parse(text).doubleValue();
    }

    public static void main(String[] args) {
        String input;
        out.println("Key in the input string:");
        try (Scanner reader = new Scanner(System.in)) {
            input = reader.nextLine();
        }

        CharStream charStream = new ANTLRInputStream(input);
        DataOperationLexer lexer = new DataOperationLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        DataOperationParser parser = new DataOperationParser(tokenStream);
        //parser.removeErrorListeners();
        parser.setBuildParseTree(true);
        ParseTree tree = parser.expressionRoot();
        int errors = parser.getNumberOfSyntaxErrors();

        out.println("Number of syntax errors: " + errors);
        out.println(tree.toStringTree(parser));
        List<String> roleNames = new LinkedList<>();
        for (String rolename:parser.getRuleNames()
             ) {roleNames.add(rolename);

        }
        TreeViewer treeViewer = new TreeViewer(roleNames,tree);
        treeViewer.open();
//
//        if (0 == errors) {
//            TreeEvaluationVisitor visitor = new TreeEvaluationVisitor();
//            double result = visitor.visit(tree);
//            out.println("Result = " + result);
//
//            // Synteza
//            if (args.length > 0)
//                compile(tree, args[0]);
//            else
//                compile(tree);
//        }
    }

//    private static void compile(ParseTree tree) {
//        compile(tree, "Grammar/out/CompilationClass.class");
//    }
//
//    private static void compile(ParseTree tree, String classPath) {
//        if (null == tree)
//            throw new NullPointerException("parse tree cannot be null.");
//
//        try {
//            Path path = Paths.get(classPath);
//            byte[] bytes = Files.readAllBytes(path);
//            ClassReader cr = new ClassReader(bytes);
//            //ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_MAXS); // no need to calculate visitMaxs(int maxStack, int maxLocals) arguments
//            ClassWriter cw = new ClassWriter(cr, 0);
//            cr.accept(new CompilationClassVisitor(cw, tree), 0);
//            bytes = cw.toByteArray();
//            Files.write(path, bytes);
//        } catch (IOException e) {
//            out.println("CompilationClass.class not found.");
//        }
//    }
}
