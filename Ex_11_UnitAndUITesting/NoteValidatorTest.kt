package com.example.testingapp

import org.junit.Assert.*
import org.junit.Test

class NoteValidatorTest {
    @Test
    fun validNoteReturnsTrue() {
        assertTrue(isValidNote("Complete lab record"))
    }

    @Test
    fun emptyNoteReturnsFalse() {
        assertFalse(isValidNote(""))
    }

    @Test
    fun blankNoteReturnsFalse() {
        assertFalse(isValidNote("   "))
    }
}
