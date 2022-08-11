# Data-Structure #
## Arrays ##
* Contiguous block in memory<br/>
* Every element occupies the same amount of space in memory<br/>
* if an array starts at memory address x, and the size of each element in array is y, we can calculate the memory address of ith element by using following expression: x + i * y<br/>
* if we know the index of an element, the time to retrieve the element will be the same, no matter where it is in the array<br/>

|Operations|Time Complexity|
|----------|---------------|
|Retrieve with index|O(1)-Constant time|
|Retrieve without index|O(n)-Linear time|
|Add an element to a full array|O(n)|
|Add an element to the end of an array(has space)|O(1)|
|Insert or update an element at a specific index|O(1)|
|Delete an element by setting it null|O(1)|
|Delete an element by shifting elements|O(n)|

## Bubble sort ##
* In-place algorithm
* O(n^2) time complexity
* 100 steps for 10 items, 10000 steps for 100 items, 1000000 steps for 1000 items
* Algorithm degrades quickly
