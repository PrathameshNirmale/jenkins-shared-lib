package org.example

class Helper {
    static String toUpper(String name) {
        def n = name ?: 'there'
        return n.toUpperCase()
    }

    // Pass 'steps' or 'script' as an argument
    static String readGreeting(def steps) {
        return steps.libraryResource('org/example/greeting.txt').trim()
    }
}
