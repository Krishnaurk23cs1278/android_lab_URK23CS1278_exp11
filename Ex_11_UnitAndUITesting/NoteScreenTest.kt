package com.example.testingapp

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

@Composable
fun NoteScreen() {
    Column {
        Button(onClick = {}) {
            Text("Add Note")
        }
    }
}

class NoteScreenTest {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun addNoteButtonIsDisplayed() {
        composeRule.setContent { NoteScreen() }
        composeRule.onNodeWithText("Add Note").assertIsDisplayed()
    }
}
