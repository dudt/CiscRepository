#!/bin/bash

source ./ build.sh
echo "Running build.sh which runs the java version of the date calcualtor"
compileRun

echo "Running of the java version of data calculator now for the bash version of date calculator"
 sh ./TimeAway.sh
