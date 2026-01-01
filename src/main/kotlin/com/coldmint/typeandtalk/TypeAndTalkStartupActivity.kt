package com.coldmint.typeandtalk

import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

class TypeAndTalkStartupActivity : ProjectActivity {
    override suspend fun execute(project: Project) {
        project.getService(TypeAndTalkService::class.java)
    }
}