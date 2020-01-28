
# Usage

Start the application `java-diff`

* Drag and drop file to the second entry

or

* Enter filename in first entry

or

* Copy and paste file contents to the content pane.

Do this for two files and then select Compare.

# Diff

At Github, create repository `java-diff`

repo: https://github.com/johnvincentio/java-diff

```
cd /Users/jv/Desktop/MyDevelopment/github/java/Utilities
create-repo java-diff
```

Remove non-relevant files.

## Add `README.md`

```
cd java-diff
```

Create `README.md`

```
For details, see Diff/README.md
```

## Start Eclipse

in Finder

* select `/Users/jv/Desktop/MyDevelopment/github/java/Utilities/java-diff`
* Right click, Services
  * eclipse-jee

## Create Java Project

* File, New, Project
* Java Project

Settings

* Project Name: Diff
* Use default location
* JRE; Use an execution environment JRE: JavaSE-1.8
* Create separate folders for sources and class files

* Default output folder: `Diff/classes`

## Package

Select `src`

* Right click, New, Package
* `io.johnvincent`

Copy code to this package and change package names.

## Script file

`/Users/jv/Desktop/MyDevelopment/github/java/Utilities/java-diff/Diff/diff.command`

## Create Symbolic Link

```
ln -s /Users/jv/Desktop/MyDevelopment/github/java/Utilities/java-diff/Diff/diff.command /Users/jv/Desktop/MyDevelopment/github/repo_shell_scripts/mac/unix-scripts/bin/java-diff
```

## Save java-diff as a Mac App

Execute from Finder

* Go, Applications
* Execute: Automator (or Automator.app)

Select

* Quick Action, or
* Application

and then select `Choose`

From the middle pane, double click Run Shell Script

Shell: /bin/bash
Pass input: as arguments

```
/Users/jv/Desktop/MyDevelopment/github/repo_shell_scripts/mac/unix-scripts/bin/java-diff
```

To save: 

* File, Save:
* Save as: java-diff
* Where: Applications

saves java-diff.app in Applications.
