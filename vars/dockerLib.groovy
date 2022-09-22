def build(Map params){
    any{
        sh "docker build -f ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerArgs} ${params.DockerContext}"
    }
    
}

def push(Map params){
    any{
    sh "docker push ${params.DockerImage}"
    }
}

def promoter(Map params){
    any{
    sh "docker pull ${params.DockerImage}"
    sh "docker tag ${params.DockerImage} ${params.DockerNewImage}"
    sh "docker push ${params.DockerNewImage}"
    }
 
}

