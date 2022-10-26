#!/bin/bash
whatsDue=('Lab1' 'Lab2' 'Lab3' 'Lab4' 'Quiz1' 'Quiz2' 'Quiz3' 'Quiz4' 'Quiz5') 
whensDue=('09-27-2022' '10-26-2022' '11-23-2022' '12-07-2022' '09-09-2022' '09-28-2022' '10-26-2022' '11-11-2022' '12-07-2022')
echo "${whatsDue[@]}"
echo "${whensDue[@]}"
userDate="05-19-2001"
function printDueDates()
{
for ((i=1; i<${#whensDue[@]}; i++));
do
    if [[ i -le 4 ]]; then
    echo "$i. ${whatsDue[$i-1]} is Due ${whensDue[$i-1]} "
    else
    echo "$i. ${whatsDue[i-1]} is Due  ${whensDue[$i-1]}"
    fi
done
}
function printMenu()
{
  echo "Choice Menu"
  echo "1. View Saved Dates?"
  echo "2. Create your own date?"
  echo "3. Compare your date to a Saved Date?"
  echo "4. Compare your date to another Date?"
  echo "Enter your choice"
  read -r choice 
  theResponse "$choice"
}
function compareDates()
{
    d1=$(date -d "$2" +%s)
    echo "$d1"
    d2=$(date -d "$1" +%s)
    echo "$d2"
    echo $(( (d1 - d2) / 86400 )) days
}

function theResponse()
{
  case $1 in
        1)
        echo "You chose to view saved dates"
        printDueDates
        printMenu
        ;;
        2)
        echo "Input your date in the format MM-DD-YYYY"
        read -r userDate
        echo "Your date is $userDate"
        printMenu
        ;;
        3)
        printDueDates
        echo "Pick a number corresponding to the date you want to select from above^"
        read -r selectedDate
        echo "You selected ${whatsDue[($selectedDate-1)]} due ${whensDue[($selectedDate-1)]}"
        eval compareDates "$userDate" "${whensDue[($selectedDate-1)]}"
        ;;
        esac
}
printMenu
