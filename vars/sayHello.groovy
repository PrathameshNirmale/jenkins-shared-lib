import org.example.Helper

def call(String name = 'there') {
    def upper = Helper.toUpper(name)
    echo "Hello ${upper}!" 
}
