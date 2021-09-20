## BINARY SEARCH
Given a sorted array of integers, write a program that allows to search for a given integer X inside this array.


NB: It is possible that the element doesn't exist in the array, in this case, return -1; 


The idea of BINARY SEARCH algorithm is to first split the array into two parts, if the X we're looking for is bigger than the middle element of the array,
then we take the right part of the arrau and abandon the right part, and vice versa. and we keep doing the same task recursively, until we find the element, 
or we reach the limits of the table( which is the case of not existence of X in array).


Here are the steps :

1- seach for the middle index

2- if middle element equals x , return middle

3- if tab[midle]  > x ==> take  left half of   array
 
4- else if tab[mid] <x ==> take  right half of array

