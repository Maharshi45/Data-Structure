# Data-Structure
## Arrays
* Contiguous block in memory
* Every element occupies the same amount of space in memory
* if an array starts at memory address x, and the size of each element in array is y, we can calculate the memory address of ith element by using following expression: x + i * y
* if we know the index of an element, the time to retrieve the element will be the same, no matter where it is in the array

| Operations                                       | Time Complexity    |
|--------------------------------------------------|--------------------|
| Retrieve with index                              | O(1)-Constant time |
| Retrieve without index                           | O(n)-Linear time   |
| Add an element to a full array                   | O(n)               |
| Add an element to the end of an array(has space) | O(1)               |
| Insert or update an element at a specific index  | O(1)               |
| Delete an element by setting it null             | O(1)               |
| Delete an element by shifting elements           | O(n)               |

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
* Splitting is logical. We don't create new arrays
* O(nlogn) - base 2. We are repeatedly dividing the array in half during the splitting phase
* Stable algorithm
* Not in-place algorithm. Uses temporary arrays

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

## Quick sort
* Divide and conquer algorithm
* Recursive algorithm
* Uses a pivot element to partition the array into two parts
* Elements < pivot to its left, elements > pivot to its right
* Pivot will then be in its correct sorted position
* Process is now repeated for the left array and right array
* Eventually, every element has been the pivot, so every element will be in its correct sorted position
* As with merge sort, we'll end up partitioning the array into a series of 1-element arrays
* Does this in-place(unlike merge sort)
* In-place algorithm
* O(nlogn) - base 2. We're repeatedly partitioning the array into 2 halves
* Unstable algorithm

## Counting sort
* Makes assumptions about the data
* Doesn't use comparisons
* Counts the number of occurrences of each value
* Only works with non-negative discrete values(cant work with floats, strings)
* Values must be within a specific range
* Not an in-place algorithm
* O(n) - can achieve this because we're making assumption about the data
* If we want the sort to be stable, we have to do some extra steps

## Radix sort
* Makes assumptions about the data
* Data must have same radix and width
* Because of this, data must be integers or strings
* Sort based on each individual digit or letter position
* Start at the rightmost position
* Must use a stable sort algorithm at each stage
* Counting sort is often used as the sort algorithm for radix sort - must be stable counting sort
* O(n) can achieve this because we are making assumption about the data we are sorting
* Even so, it often runs slower than O(nlogn) because of the overhead involved
* In-place depends upon which sort algorithm you use
* Stable algorithm

## Stacks
* Abstract Data Type
* LIFO - last in first out
* Push - adds an item as the top on the stack
* Pop - removes the top item on the stack
* Peek - gets the top item on the stack without popping it
* Ideal backing data structure - linked list

## Queues
* Abstract Data Type
* FIFO - first in, first out
* add - also called as enqueue, add an item to the end of the queue
* remove - also called as deque, remove an item at the front of the queue
* peek - get the item at the front of the queue, but dont remove it