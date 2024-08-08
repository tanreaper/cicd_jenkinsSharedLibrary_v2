def call(Map repoDetails) {
    echo "creating repo"
    repoDetails.each {
        key, value ->
            println "${key} : ${value}"
    }
    echo " private : ${repoDetails.private}"
    sh """
        curl -H "Authorization: token ${TOKEN}" \
        -H "Content-Type: application/json" \
        -d '{
        "name": "${repoDetails.name}",
        "description": "${repoDetails.description}",
        "private": "${repoDetails.private}",
        "owner": "${repoDetails.owner}"
        }' \
        "${globalVars.GITHUB_BASE_URL}/user/repos"
    """

    // use https request plugin
    // https://plugins.jenkins.io/http_request/
    
}

def createRepowithHttp(repoDetails) {
    // use https request plugin
    // https://plugins.jenkins.io/http_request/
}
def deleteRepo(repoDetails) {
    //deleting the Repo
}