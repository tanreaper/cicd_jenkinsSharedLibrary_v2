def call(Map repoDetails) {
    echo "creating repo"
    repoDetails.each {
        key, value ->
            println "${key} : ${value}"
    }
}