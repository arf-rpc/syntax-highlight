package io.vito.arf.arfintellij

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object ArfFileType : LanguageFileType(ArfLanguage) {
    override fun getName(): String = "ARF"

    override fun getDescription(): String = "arf IDL file"

    override fun getDefaultExtension(): String = "arf"

    override fun getIcon(): Icon? = null
}