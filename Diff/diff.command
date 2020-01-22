#!/bin/sh
#
# script to run java app Diff
#
DEV_HOME=/Users/jv/Desktop/MyDevelopment/github/java/Utilities/java-diff/Diff
#
cd $DEV_HOME
#
MYCP=$DEV_HOME/classes:$DEV_HOME/Jars/log4j-1.2.13.jar
#
java -cp $MYCP io.johnvincent.diff.file.AppGUI
