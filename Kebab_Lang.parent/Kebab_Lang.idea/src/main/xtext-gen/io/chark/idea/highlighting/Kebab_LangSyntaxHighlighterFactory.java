/*
 * generated by Xtext 2.9.2
 */
package io.chark.idea.highlighting;

import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import io.chark.idea.lang.Kebab_LangLanguage;
import org.jetbrains.annotations.NotNull;

public class Kebab_LangSyntaxHighlighterFactory extends SingleLazyInstanceSyntaxHighlighterFactory {
	
	@Override
    @NotNull
    protected SyntaxHighlighter createHighlighter() {
        return Kebab_LangLanguage.INSTANCE.getInstance(SyntaxHighlighter.class);
    }
}
