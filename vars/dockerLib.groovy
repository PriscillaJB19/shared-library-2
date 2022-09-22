def build(Map params){
    docker{
        sh "docker build -f ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerArgs} ${params.DockerContext}"
    }
    
}

def push(Map params){
    docker{
    sh "docker push ${params.DockerImage}"
    }
}

def promoter(Map params){
    docker{
    sh "docker pull ${params.DockerImage}"
    sh "docker tag ${params.DockerImage} ${params.DockerNewImage}"
    sh "docker push ${params.DockerNewImage}"
    }
 
}

