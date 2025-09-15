def call(ProjectName, String ImageTag, String DockerHubUser) {
    def imageName = "${DockerHubUser}/${ProjectName}:${ImageTag}"
    sh "docker build -t ${imageName} ."
}
