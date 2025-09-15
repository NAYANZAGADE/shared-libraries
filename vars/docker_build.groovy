def call(ProjectName, String ImageTag, String DockerHubUser) {
    def imageName = "${DockerHubUser.toLowerCase()}/${ProjectName.toLowerCase()}:${ImageTag}"
    sh "docker build -t ${imageName} ."
}
