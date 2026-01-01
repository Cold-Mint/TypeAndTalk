package com.coldmint.typeandtalk

import com.intellij.openapi.Disposable
import com.intellij.openapi.components.Service
import com.intellij.openapi.editor.EditorFactory
import com.intellij.openapi.project.Project

@Service(Service.Level.PROJECT)
class TypeAndTalkService(project: Project) : Disposable {
    private val listener = TypeAndTalkDocumentListener(project)

    init {
        println("Initialization TypeAndTalkService service")
        EditorFactory.getInstance().eventMulticaster.addDocumentListener(
            listener,
            this
        )
    }

    override fun dispose() {
        println("dispose TypeAndTalkService service")
    }
}