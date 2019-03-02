lazy val root = project
  .in(file("."))
  .settings(
    name := projectName,
    organization := "com.simianquant.spireissues",
    version := Settings.versions.project,
    scalaVersion := Settings.versions.scala,
    scalacOptions ++= List(
      ("-Xlint:adapted-args,nullary-unit,inaccessible,nullary-override,infer-any,doc-detached,private-shadow," +
        "type-parameter-shadow,poly-implicit-overload,option-implicit,delayedinit-select,by-name-right-associative," +
        "package-object-classes,unsound-match,stars-align,constant"),
      "-Ywarn-unused:imports,patvars,privates,locals",
      "-opt:l:method",
      "-Ywarn-unused-import",
      "-deprecation",
      "-unchecked",
      "-explaintypes",
      "-encoding",
      "UTF-8",
      "-feature",
      "-Xlog-reflective-calls",
      "-Ywarn-inaccessible",
      "-Ywarn-infer-any",
      "-Ywarn-nullary-override",
      "-Ywarn-nullary-unit",
      "-Xfuture",
      "-Ywarn-dead-code",
      "-Ywarn-value-discard",
      "-Ywarn-unused-import"
    )
  )
