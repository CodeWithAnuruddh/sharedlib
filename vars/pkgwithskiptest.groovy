def call(){
  // Define the maven command to be executed
  def mavencommand = "mvn package -DskipTests=true"
  //run maven command in the shell
  sh script: mavencommand , returnStatus: true
}
