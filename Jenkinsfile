pipeline {
    agent any

    stages {
        // Étape de Build
        stage('Build') {
            steps {
                echo 'Starting Build Stage'
                sh 'mvn clean package' // Compile et package le projet
            }
        }

        // Étape de Test Unitaire
        stage('Unit Tests') {
            steps {
                echo 'Running Unit Tests'
                sh 'mvn test' // Exécute les tests unitaires
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution completed.'
        }
        success {
            echo 'Pipeline executed successfully.'
        }
        failure {
            echo 'Pipeline failed. Check the logs for details.'
        }
    }
}
