#!/bin/bash

touch rand.txt
for ((i=0; i<10; i++))
do
  echo $(( $RANDOM % 100)) >> rand.txt
done 
awk '{s+=$1}END{print s}' rand.txt > expected.txt
