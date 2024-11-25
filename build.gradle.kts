plugins {
    id("eu.rehost.jasperreports") version "0.14"
}

repositories {
    mavenCentral()
    maven("https://jaspersoft.jfrog.io/jaspersoft/third-party-ce-artifacts")
}

dependencies {
    compileReports("net.sf.jasperreports:jasperreports:6.5.1")
    compileReports("org.codehaus.groovy:groovy-all:2.4.5")
}