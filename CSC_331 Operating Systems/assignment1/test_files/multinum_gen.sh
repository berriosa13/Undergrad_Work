#!/bin/bash

rm -f multilines.txt expected.txt result.txt
touch multilines.txt
lines=$(( $RANDOM % 10 + 5))
unsorted=()
for ((i=0; i<$lines; i++))
do
  nums=$(( $RANDOM % 5 + 2))
  tmp=""
  for ((j=0; j<$nums; j++))
  do
    val=$(( $RANDOM % 100))
    unsorted+=($val)
    tmp="$tmp$val "
  done
  echo $(echo -e "${tmp}" | sed -e 's/[[:space:]]*$//')  >> multilines.txt
done

readarray -t sorted < <(for n in "${unsorted[@]}"; do echo "$n"; done | sort -n)
exp=""
for n in "${sorted[@]}"
do 
  exp="$exp$n "
done
echo $(echo -e "${exp}" | sed -e 's/[[:space:]]*$//')  >> expected.txt