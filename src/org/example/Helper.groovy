package org.example

class Helper {
    static String toUpper(String name) {
        def n = name ?: 'there'
        return n.toUpperCase()
    }

    // Accept 'steps' as a parameter to access Jenkins DSL
    static String readGreeting(def steps) {
        return steps.libraryResource('org/example/greeting.txt').trim()
    }
}
