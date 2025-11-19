package io.vito.arf.arfintellij

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class ArfColorSettingsPage : ColorSettingsPage {

    override fun getDisplayName(): String = "ARF"

    override fun getIcon(): Icon? = null

    override fun getHighlighter(): SyntaxHighlighter = ArfSyntaxHighlighter()

    override fun getDemoText(): String = """
        # Demo ARF

        package v1beta1.demo;

        import "../common/v1beta1/common";

        struct Example {
            id uint32;
            name string;
            flag bool;
        }

        service DemoService {
            Ping(i Example) -> Example;
        }
    """.trimIndent()

    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String, TextAttributesKey>? =
        null

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> =
        arrayOf(
            AttributesDescriptor("Keyword", ArfSyntaxHighlighter.KEYWORD),
            AttributesDescriptor("String", ArfSyntaxHighlighter.STRING),
            AttributesDescriptor("Number", ArfSyntaxHighlighter.NUMBER),
            AttributesDescriptor("Comment", ArfSyntaxHighlighter.COMMENT),
            AttributesDescriptor("Annotation", ArfSyntaxHighlighter.ANNOTATION),
            AttributesDescriptor("Bad character", ArfSyntaxHighlighter.BAD_CHAR),
        )

    override fun getColorDescriptors(): Array<ColorDescriptor> = emptyArray()
}