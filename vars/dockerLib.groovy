def build(Map params){
    pwsh "docker build -f ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerArgs} ${params.DockerContext}"
}

def push(Map params){
    pwsh "docker push ${params.DockerImage}"
}

def promoter(Map params){
    pwsh "docker pull ${params.DockerImage}"
    pwsh "docker tag ${params.DockerImage} ${params.DockerNewImage}"
    pwsh "docker push ${params.DockerNewImage}"
}

