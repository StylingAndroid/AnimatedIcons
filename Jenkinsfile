node {
  stage('Checkout') {
        checkout scm
  }

  stage('Build') {
        sh "./gradlew clean assemble"
  }

  stage('Check') {
        sh "./gradlew detekt check ktlintCheck"
  }

  stage('Report') {
        recordIssues tool: androidLintParser(pattern: '**/reports/**/lint-results.xml', reportEncoding: 'UTF-8')
        recordIssues tool: detekt(pattern: '**/reports/**/detekt.xml', reportEncoding: 'UTF-8')
        recordIssues tool: ktLint(pattern: '**/reports/**/ktlint*.xml', reportEncoding: 'UTF-8')
  }
}
