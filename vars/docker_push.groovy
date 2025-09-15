def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'nayanzagade7', passwordVariable: 'nayanzagade7pass', usernameVariable: 'dockerhubuser')]) {
      sh "docker login -u ${dockerhubuser} -p ${nayanzagade7pass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
