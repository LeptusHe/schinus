import static org.junit.Assert.*;

import frontend.clang.ClangScanner;
import org.junit.Test;

import frontend.Source;
import frontend.Scanner;

import java.io.BufferedReader;
import java.io.StringReader;

/**
 * <h1>ClangStringTest</h1>
 *
 * <p>Test for string literal</p>
 */
public class ClangStringTokenTest {
  String testString = "\'test\'";
  Source source;
  Scanner scanner;

  @Test
  public void testExtract() throws Exception {
    source = new Source(new BufferedReader(new StringReader(testString)));
    scanner = new ClangScanner(source);

    assertEquals(testString, scanner.nextToken().getText());
  }
}