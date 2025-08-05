def call() {
    node {
        sh '''
            mvn -version
            java -version
        '''
    }
}