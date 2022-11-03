pipeline {

agent any

stages {


stage('Build Artifact - Maven') {
steps {
sh "mvn clean package -Dmaven.test.skip=true"
archive 'target/*.jar'
}
}
	stage("build & SonarQube analysis") {
            steps {
                sh 'mvn sonar:sonar -Dsonar.host.url=http://192.168.1.7:9000 -Dsonar.login=admin -Dsonar.password=sonar'
            }
	
  stage('Nexus Stage') {
steps {
	
	
sh 'mvn clean deploy -DskipTests'
sh'mvn clean deploy -Dmaven.test.skip=true -Dresume=false'
	
	
}
}  
}
}
