## Exercise 3: Reverse a Stack

### Reflection

#### 1. Challenges
The main challenge was reversing the stack without using an additional data structure. I learned how to use recursion to remove elements and insert them at the bottom of the stack.

#### 2. Efficiency
My solution has a time complexity of **O(n²)** because inserting each element at the bottom may require moving other elements. It uses **O(n)** extra space for recursive calls. A faster solution may be possible if additional data structures are allowed, but my solution follows the exercise requirements.

#### 3. Applications
Stacks can be used to check balanced brackets in expressions, reverse data, undo actions in applications, and manage function calls through recursion. This exercise helped me understand how stack operations and recursion work together to solve problems.