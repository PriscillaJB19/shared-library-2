def build(Map params){
    powershell "docker build -f ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerArgs} ${params.DockerContext}"
}

def push(Map params){
    powershell "docker push ${params.DockerImage}"
}

def promoter(Map params){
    powershell "docker pull ${params.DockerImage}"
    powershell "docker tag ${params.DockerImage} ${params.DockerNewImage}"
    powershell "docker push ${params.DockerNewImage}"
}

