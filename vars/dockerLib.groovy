def build(Map params){
    bash 'docker build -f ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerArgs} ${params.DockerContext}'
}

def push(Map params){
    bash 'docker push ${params.DockerImage}'
}

def promoter(Map params){
    bash 'docker pull ${params.DockerImage}'
    bash 'docker tag ${params.DockerImage} ${params.DockerNewImage}'
    bash 'docker push ${params.DockerNewImage}'
}

