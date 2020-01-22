
# Usage

Log files will be written to files in the directory `/tmp/explorer`. Ensure this directory exists. 

Decompiler files will be written to files in the directory `/tmp/jdec`. Ensure this directory exists.


# Explorer

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

`/Users/jv/Desktop/MyDevelopment/github/java/Utilities/java-explorer/Explorer/diff.command`


## Create Alias

In Finder

* select `diff.command`
* right click, Make Alias
* rename to `diff.command`
* move alias to `/Users/jv/Desktop/MyDevelopment/github/repo_shell_scripts/mac/JVTools/`

# END
