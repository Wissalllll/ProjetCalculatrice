pipeline {
    agent any

    environment {
        // Spécifiez la version de Java à utiliser
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-17'
        MAVEN_HOME = 'C:\\apache-maven-3.8.1'
        // Fusionner les deux modifications de PATH
        PATH = "${JAVA_HOME}\\bin;${MAVEN_HOME}\\bin;${env.PATH}"
    }

    stages {
        stage('Clone Repository') {
            steps {
                // Cloner le dépôt Git contenant le projet
                git branch: 'main', url: 'https://github.com/Wissalllll/ProjetCalculatrice.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Exécuter Maven pour construire le projet
                    bat 'mvn clean install'
                }
            }
        }

        stage('Run Unit Tests') {
            steps {
                script {
                    // Exécuter les tests unitaires avec Maven
                    bat 'mvn test'
                }
            }
        }

        stage('Publish Test Results') {
            steps {
                // Publier les résultats des tests
                junit '**/target/test-*.xml'
            }
        }
    }

    post {
        success {
            echo 'Le pipeline a réussi!'
        }
        failure {
            echo 'Le pipeline a échoué.'
        }
    }
}
