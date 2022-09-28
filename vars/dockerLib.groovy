def call  (Map params = [:]){
    sh "docker build -f ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerContext}"
}


def call (Map params){
    sh "docker push ${params.DockerImage}"
}

def call (Map params){
    sh "docker pull ${params.DockerImage}"
    sh "docker tag ${params.DockerImage} ${params.DockerNewImage}"
    sh "docker push ${params.DockerNewImage}"
}

