def build(Map params){
    dockerfile {
    sh "docker build -f ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerArgs} ${params.DockerContext}"
    echo "Entro"
    }
}

def push(Map params){
    dockerfile {
    sh "docker push ${params.DockerImage}"
    }
}

def promoter(Map params){
    dockerfile {
    sh "docker pull ${params.DockerImage}"
    sh "docker tag ${params.DockerImage} ${params.DockerNewImage}"
    sh "docker push ${params.DockerNewImage}"
    }
}

