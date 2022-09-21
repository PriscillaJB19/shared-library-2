def build(Map params){
    bat "docker build -f ${params.DockerfilePath} ${params.DockerArgs} ${params.DockerContext}"
}

