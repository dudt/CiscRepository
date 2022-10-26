#!/bin/bash

compile() #compiles  java program
{
        javac TimeAway.class
}

runJava()
{
        java TimeAway.class < input.txt > shellOutput.txt  #redirects user input into  java class and output to the shell
}

function compileRun() #compile and runs  java
{
        compile
        runJava
}

filename="TimeAway.java" #creates a variable with the file name

m1="$(md5sum "$filename")" # Calculates and verifies the 128bit hash value

while true; do #constantly

  sleep 10 #md5sum is processor expensive so it takes some time

  m2=$(md5sum "$filename") #Calculates the 128 bit has value AFTER 10 seconds

   if [[ "$m1" != "$m2" ]]; then #Evaluates whether or not the 128 bit hash value has changed in the last 10 seconds
    compile #recompiles the code  if it has been modified 
   fi
done

