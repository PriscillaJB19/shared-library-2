def call  (Map params = [:]){
    sh "docker build -t ${params.DockerImage}"
}


def call (Map params){
    sh "docker push ${params.DockerImage}"
}

def call (Map params){
    sh "docker pull ${params.DockerImage}"
    sh "docker tag ${params.DockerImage} ${params.DockerNewImage}"
    sh "docker push ${params.DockerNewImage}"
}

