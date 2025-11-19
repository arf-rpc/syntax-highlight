package io.vito.arf.arfintellij

import com.intellij.psi.tree.IElementType

class ArfTokenType(debugName: String) : IElementType(debugName, ArfLanguage) {
    override fun toString(): String = "ArfTokenType." + super.toString()
}