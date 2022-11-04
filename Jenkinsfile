pipeline {

agent any
	 environment {
        registry = "fatmabe/projet"
        registryCredential = 'dockerHub'
        dockerImage = ''
    }

stages {


stage('Build Artifact - Maven') {
steps {
sh "mvn clean package -Dmaven.test.skip=true"
archive 'target/*.jar'
}
}
	stage("build & SonarQube analysis") {
            steps {
                sh 'mvn sonar:sonar -Dsonar.host.url=http://192.168.1.10:9000 -Dsonar.login=admin -Dsonar.password=sonar'
            }
	}
	
 
	  
          stage('deploy jar to nexus'){
              steps{
                  sh 'mvn deploy:deploy-file -DgroupId=com.tn.esprit.rh \
                        -DartifactId=achat \
                        -Dversion=1.1.0 \
                        -Dpackaging=jar \
                        -Dfile=./target/achat-1.1.0.jar \
                        -DrepositoryId=esprit-devops \
                        -Durl=http://
				192.168.1.10:8081/repository/esprit-devops/'
              }
          }
	  
 stage('Building our image') { 
            steps { 
                script { 
                    dockerImage = docker.build registry + ":$BUILD_NUMBER" 
                }
            } 
        }

        stage('Deploy our image') { 
            steps { 
                script { 
                    docker.withRegistry( '', registryCredential ) { 
                        dockerImage.push() 
                   }
                } 
            }
        }

        stage('Cleaning up') { 
            steps { 
               sh "docker rmi $registry:$BUILD_NUMBER" 
            }
        } 
     }
}
