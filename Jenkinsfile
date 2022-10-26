pipeline {
     agent any

 

    stages {
        stage('github') {
            steps {
                echo "github" ;
                git branch: 'seyf',
                git 'https://github.com/5se4-G1/DevOPs.git';
            }
            
        }
             stage('cleaning java Project'){
             steps{
                 sh 'mvn clean'

             }
         }
           stage('compiling java Project'){
             steps{
                 sh 'mvn compile'

             }
         }
          
         
         stage("build & SonarQube analysis") {
            steps {
                sh  'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=esprit'
            }
          }
           stage('package artifact'){
              steps{
                  sh 'mvn package'
              }
          }
    
    stage('deploy jar to nexus'){
              steps{
                  sh 'mvn deploy:deploy-file -DgroupId=tn.esprit.rh \
                        -DartifactId=achat \
                        -Dversion=1.0 \
                        -Dpackaging=jar \
                        -Dfile=./target/achat-1.0.jar \
                        -DrepositoryId=Pipline-independant \
                        -Durl=http://192.168.56.3:8081/repository/Pipline-independant/'
              }
          }
      }}
