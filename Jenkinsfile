pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Commande pour compiler le projet
                    bat 'mvn clean install'
                }
            }
        }
        
        stage('Unit Tests') {
            steps {
                script {
                    // Commande pour exécuter les tests unitaires
                    bat 'mvn test'
                }
            }
        }
    }
}
