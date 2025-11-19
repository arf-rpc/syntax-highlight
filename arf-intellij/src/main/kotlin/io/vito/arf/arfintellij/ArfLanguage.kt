package io.vito.arf.arfintellij

import com.intellij.lang.Language

object ArfLanguage : Language("ARF") {
    override fun getDisplayName(): String = "arf"
}