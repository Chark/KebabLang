/*
 * generated by Xtext 2.9.2
 */
package io.chark.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class Kebab_LangAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("io/chark/parser/antlr/internal/InternalKebab_Lang.tokens");
	}
}
