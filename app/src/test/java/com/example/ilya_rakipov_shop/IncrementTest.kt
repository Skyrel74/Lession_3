package com.example.ilya_rakipov_shop

import org.junit.Assert.assertEquals
import org.junit.Test

class IncrementTest {

    @Test
    fun incrementTest() {
        var i = 1
        i++
        assertEquals(2, i)
    }
}