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
(java -cp $MYCP -Xdock:name="Visual File Compare" io.johnvincent.diff.file.AppGUI > /dev/null 2>&1) &
#

