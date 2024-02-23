# Cucumber example

This is a simple example of how to use cucumber with an SBT plugin,
enabling to run the BDD/ATDD tests in CI

## Configuration
The used SBT plugin is [sbt-cucumber](https://github.com/sbt/sbt-cucumber), which requires a minimal conifguration in [build.sbt](build.sbt)

Note that the `CucumberPlugin.glues` is the list of packages where the step definitions are located.


## Run cucumber tests

```bash
sbt cucumber
```

