def call(String SonarQubeAPI, String Projectname, String ProjectKey){
  withSonarQubeEnv("${SonarQubeAPI}"){
    sh "$SONAR_HOME/bin/sonar-scanner-Dsonar.projectname=${Projectname} -Dsonar.projectkey=${ProjectKey} -X"
  }
  
}