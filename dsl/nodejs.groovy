job('NodeJS example') {
    scm {
        git('https://github.com/nerusnayleinad/nodejs-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('nerusnayleinad')
            node / gitConfigEmail('danielyansuren@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}