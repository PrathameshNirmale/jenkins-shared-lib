import org.example.Helper

def call(String name = 'there') {
    // Pass 'this' so the helper can access Jenkins DSL steps
    def greeting = Helper.readGreeting(this) 
    def upperName = Helper.toUpper(name)
    echo "${greeting} ${upperName}!"
}
