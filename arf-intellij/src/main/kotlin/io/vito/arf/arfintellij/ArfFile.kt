package io.vito.arf.arfintellij

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider

class ArfFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, ArfLanguage) {
    override fun getFileType() = ArfFileType
    override fun toString(): String = "ARF File"
}