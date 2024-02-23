ThisBuild / version := "0.1.0-SNAPSHOT"
lazy val root = (project in file("."))
  .settings(
    name := "java-sbt-example",
    libraryDependencies ++= Seq(
        "net.aichler" % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
        "io.cucumber" % "cucumber-java" % "6.1.1" % Test)
)

enablePlugins(CucumberPlugin)

// package names on which to run cucumber tests
CucumberPlugin.glues := List("calculator")

// Any environment properties you want to override/set.
CucumberPlugin.envProperties := Map("K"->"2049")
