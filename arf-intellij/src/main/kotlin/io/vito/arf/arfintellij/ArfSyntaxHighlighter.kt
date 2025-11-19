package io.vito.arf.arfintellij

import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class ArfSyntaxHighlighter : SyntaxHighlighter {

    override fun getHighlightingLexer(): Lexer =
        FlexAdapter(ArfLexer(null))

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> =
        when (tokenType) {
            ArfTypes.LINE_COMMENT ->
                pack(COMMENT)

            ArfTypes.STRING ->
                pack(STRING)

            ArfTypes.NUMBER ->
                pack(NUMBER)

            ArfTypes.ANNOTATION ->
                pack(ANNOTATION)

            ArfTypes.KW_PACKAGE,
            ArfTypes.KW_IMPORT,
            ArfTypes.KW_IMPORT_AS,
            ArfTypes.KW_STRUCT,
            ArfTypes.KW_ENUM,
            ArfTypes.KW_SERVICE,
            ArfTypes.KW_STREAM,
            ArfTypes.KW_OPTIONAL,
            ArfTypes.KW_ARRAY,
            ArfTypes.KW_MAP,
            ArfTypes.KW_BOOL,
            ArfTypes.KW_INT8, ArfTypes.KW_INT16, ArfTypes.KW_INT32, ArfTypes.KW_INT64,
            ArfTypes.KW_UINT8, ArfTypes.KW_UINT16, ArfTypes.KW_UINT32, ArfTypes.KW_UINT64,
            ArfTypes.KW_FLOAT32, ArfTypes.KW_FLOAT64,
            ArfTypes.KW_STRING, ArfTypes.KW_BYTES ->
                pack(KEYWORD)

            TokenType.BAD_CHARACTER ->
                pack(BAD_CHAR)

            else ->
                emptyArray()
        }

    companion object {
        val KEYWORD: TextAttributesKey =
            createTextAttributesKey("ARF_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)

        val STRING: TextAttributesKey =
            createTextAttributesKey("ARF_STRING", DefaultLanguageHighlighterColors.STRING)

        val NUMBER: TextAttributesKey =
            createTextAttributesKey("ARF_NUMBER", DefaultLanguageHighlighterColors.NUMBER)

        val COMMENT: TextAttributesKey =
            createTextAttributesKey("ARF_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)

        val ANNOTATION: TextAttributesKey =
            createTextAttributesKey("ARF_ANNOTATION", DefaultLanguageHighlighterColors.METADATA)

        val BAD_CHAR: TextAttributesKey =
            createTextAttributesKey("ARF_BAD_CHAR", DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE)

        private fun pack(vararg keys: TextAttributesKey): Array<TextAttributesKey> = arrayOf(*keys)
    }
}