def build(Map params){
    sh "donet build -f ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerContext}"
}

def push(Map params){
    sh "docker push ${params.DockerImage}"
}

def promoter(Map params){
    sh "docker pull ${params.DockerImage}"
    sh "docker tag ${params.DockerImage} ${params.DockerNewImage}"
    sh "docker push ${params.DockerNewImage}"
}

