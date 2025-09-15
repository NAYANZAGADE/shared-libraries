// def call(ProjectName, String ImageTag, String DockerHubUser) {
//     def imageName = "${DockerHubUser}/${ProjectName}:${ImageTag}"
//     sh "docker build -t ${imageName} ."
// }
def call(ProjectName, String ImageTag, String DockerHubUser) {
    def userLower = DockerHubUser.toLowerCase()
    def projectLower = ProjectName.toLowerCase()
    def cleanTag = ImageTag.replaceAll("[^a-zA-Z0-9_.-]", "-").toLowerCase()

    def imageName = "${userLower}/${projectLower}:${cleanTag}"
    sh "docker build -t ${imageName} ."
}
