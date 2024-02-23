ThisBuild / version := "0.1.0-SNAPSHOT"
lazy val root = (project in file("."))
  .settings(
    name := "java-sbt-example",
    libraryDependencies ++= Seq(
        "net.aichler" % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
        "io.cucumber" % "cucumber-java" % "6.1.1" % Test,
        "io.cucumber" %% "cucumber-scala" % "8.14.1" % Test)
)

enablePlugins(CucumberPlugin)

// package names on which to run cucumber tests
CucumberPlugin.glues := List("calculator")
