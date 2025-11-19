package io.vito.arf.arfintellij

import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

object ArfTypes {
    @JvmField val IDENTIFIER: IElementType = ArfTokenType("IDENTIFIER")
    @JvmField val NUMBER: IElementType = ArfTokenType("NUMBER")
    @JvmField val STRING: IElementType = ArfTokenType("STRING")
    @JvmField val LINE_COMMENT: IElementType = ArfTokenType("LINE_COMMENT")
    @JvmField val ANNOTATION: IElementType = ArfTokenType("ANNOTATION")

    // Keywords
    @JvmField val KW_PACKAGE: IElementType = ArfTokenType("KW_PACKAGE")
    @JvmField val KW_IMPORT: IElementType = ArfTokenType("KW_IMPORT")
    @JvmField val KW_IMPORT_AS: IElementType = ArfTokenType("KW_IMPORT_AS")
    @JvmField val KW_STRUCT: IElementType = ArfTokenType("KW_STRUCT")
    @JvmField val KW_ENUM: IElementType = ArfTokenType("KW_ENUM")
    @JvmField val KW_SERVICE: IElementType = ArfTokenType("KW_SERVICE")
    @JvmField val KW_STREAM: IElementType = ArfTokenType("KW_STREAM")
    @JvmField val KW_OPTIONAL: IElementType = ArfTokenType("KW_OPTIONAL")
    @JvmField val KW_ARRAY: IElementType = ArfTokenType("KW_ARRAY")
    @JvmField val KW_MAP: IElementType = ArfTokenType("KW_MAP")

    // Builtin types (you can expand)
    @JvmField val KW_BOOL: IElementType = ArfTokenType("KW_BOOL")
    @JvmField val KW_INT8: IElementType = ArfTokenType("KW_INT8")
    @JvmField val KW_INT16: IElementType = ArfTokenType("KW_INT16")
    @JvmField val KW_INT32: IElementType = ArfTokenType("KW_INT32")
    @JvmField val KW_INT64: IElementType = ArfTokenType("KW_INT64")
    @JvmField val KW_UINT8: IElementType = ArfTokenType("KW_UINT8")
    @JvmField val KW_UINT16: IElementType = ArfTokenType("KW_UINT16")
    @JvmField val KW_UINT32: IElementType = ArfTokenType("KW_UINT32")
    @JvmField val KW_UINT64: IElementType = ArfTokenType("KW_UINT64")
    @JvmField val KW_FLOAT32: IElementType = ArfTokenType("KW_FLOAT32")
    @JvmField val KW_FLOAT64: IElementType = ArfTokenType("KW_FLOAT64")
    @JvmField val KW_STRING: IElementType = ArfTokenType("KW_STRING_T")
    @JvmField val KW_BYTES: IElementType = ArfTokenType("KW_BYTES_T")

    // punctuation
    @JvmField val LBRACE: IElementType = ArfTokenType("LBRACE")
    @JvmField val RBRACE: IElementType = ArfTokenType("RBRACE")
    @JvmField val LPAREN: IElementType = ArfTokenType("LPAREN")
    @JvmField val RPAREN: IElementType = ArfTokenType("RPAREN")
    @JvmField val LT: IElementType = ArfTokenType("LT")
    @JvmField val GT: IElementType = ArfTokenType("GT")
    @JvmField val COMMA: IElementType = ArfTokenType("COMMA")
    @JvmField val DOT: IElementType = ArfTokenType("DOT")
    @JvmField val EQ: IElementType = ArfTokenType("EQ")
    @JvmField val ARROW: IElementType = ArfTokenType("ARROW")
    @JvmField val SEMI: IElementType = ArfTokenType("SEMI")
    @JvmField val ATSIGN: IElementType = ArfTokenType("ATSIGN")
}