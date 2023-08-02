package com.github.libmonsoondev.ifer.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys

class PasteAction: AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        val editor = event.getRequiredData(PlatformDataKeys.EDITOR)
//        editor.selectionModel.
        TODO("Not yet implemented")
    }
}