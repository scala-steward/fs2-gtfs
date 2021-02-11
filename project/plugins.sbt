// strict compiler flags
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.16")
// source code formatting
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.2")
// coverage
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.8.2")
// check dependencies against OWASP vulnerabilities
addSbtPlugin("net.vonbuchholtz" % "sbt-dependency-check" % "3.1.0")
// check and add missing license headers
addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.6.0")
// manage github actions from build definition
addSbtPlugin("com.codecommit" % "sbt-github-actions" % "0.10.1")
