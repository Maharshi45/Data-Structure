# Data-Structure
## Arrays
* Contiguous block in memory
* Every element occupies the same amount of space in memory
* if an array starts at memory address x, and the size of each element in array is y, we can calculate the memory address of ith element by using following expression: x + i * y
* if we know the index of an element, the time to retrieve the element will be the same, no matter where it is in the array

|Operations|Time Complexity|
|----------|---------------|
|Retrieve with index|O(1)-Constant time|
|Retrieve without index|O(n)-Linear time|
|Add an element to a full array|O(n)|
|Add an element to the end of an array(has space)|O(1)|
|Insert or update an element at a specific index|O(1)|
|Delete an element by setting it null|O(1)|
|Delete an element by shifting elements|O(n)|

## Bubble sort
* In-place algorithm
* O(n<sup>2</sup>) time complexity
* 100 steps for 10 items, 10000 steps for 100 items, 1000000 steps for 1000 items
* Algorithm degrades quickly

## Selection sort
* In-place algorithm
* O(n<sup>2</sup>) time complexity
* Doesn't require as much swapping as bubble sort
* Unstable algorithm

## Insertion sort
* In-place algorithm
* O(n<sup>2</sup>) time complexity
* Stable algorithm

## Shell sort
* Variation of Insertion sort
* Insertion sort chooses which element to insert using a gap of 1
* Shell sort starts out using a larger gap value
* As the algorithm runs, the gap is reduced
* Goal is to reduce the amount of shifting required
* The last gap value is always 1
* A gap value of 1 is equivalent to insertion sort
* So, the algorithm does some preliminary work(using gap value greater than 1), and then becomes insertion sort
* By the time we get to insertion sort, the array has been partially sorted, so there is less shifting required
* In-place algorithm
* O(n<sup>2</sup>) time complexity
* Does not require as much shifting as insertion sort, so usually performs better
* Unstable algorithm(Unlike insertion sort)

## Merge sort
* Divide and conquer algorithm
* Recursive algorithm
* Two phases: splitting and Merging
* Splitting phase leads to faster merging during the merging phase
* Splitting is logical. We dont create new arrays
* O(nlogn) - base 2. We are repeatedly dividing the array in half during the splitting phase
* Stable algorithm

### 1. Splitting phase
  * Start with an unsorted array
  * Divide the array into two arrays, which are unsorted. The first array is the left array and the second array is the right array.
  * Split the right and left array into two arrays each
  * Keep splitting until all the arrays has only one element each - these arrays are sorted

### 2. Merging phase
  * Merge every left/right pair of sibling arrays into a sorted array
  * After the first merge, we will have bunch of 2-element sorted arrays
  * Then merge those sorted arrays(left/right siblings) to end up with a bunch of 4-element sorted arrays
  * Repeat until you have a single sorted array
  * Not in-place algorithm. Uses temporary arrays
