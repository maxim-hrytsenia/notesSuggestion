package com.example.notessuggestor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotesSuggestorApplication

fun main(args: Array<String>) {
    runApplication<NotesSuggestorApplication>(*args)
}
