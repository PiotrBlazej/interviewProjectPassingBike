Algorithm:
1) Get an array
2) Start tracking how many bike going east (goEast counter) 
3) Iterate through the array and get  element
4) If found a bike going east increase goEast counter
5) If found a bike going west we know that it passing every bike before going east so
 add to pair counter goEast counter
6) Check if pair counter < 1e9, if true then repeate steps unitl 
table end else return -1
7) Return pair counter
