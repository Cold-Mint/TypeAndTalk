package com.coldmint.typeandtalk

import com.intellij.openapi.editor.event.DocumentEvent
import com.intellij.openapi.editor.event.DocumentListener
import com.intellij.openapi.project.Project

class TypeAndTalkDocumentListener(
    private val project: Project
) : DocumentListener {
    companion object {
        const val IDEA_RULE = "IntellijIdeaRulezzz"
    }

    override fun documentChanged(event: DocumentEvent) {
        val newText = event.newFragment.toString()
        if (newText.isBlank()) {
            return
        }
        if (newText == IDEA_RULE) {
            return
        }

        // todo:通过tts朗读出文本。
//        println("${event.newFragment.javaClass}: $newText")

    }

}
