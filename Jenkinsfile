pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        bat 'mvn package'
      }
    }

    stage('checkout') {
      steps {
        git(url: 'https://github.com/sasiVarun/SpringBootWebMVCDummy.git', branch: 'main')
      }
    }

  }
}