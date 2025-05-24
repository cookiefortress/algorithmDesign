# algorithmDesign
Assignment 2 for CSCI-C343 - designing two algorithms, maintaining an optimal time complexity for both

<h2>Algorithm 1, Inclusive Summation</h2>
The time complexity of this algorithm is simply O(1). Using the formula <code>(b*(b+1)/2) - (a*(a-1)/2)</code>,
I reduced the time complexity down from O(n), where I was iterating over each value and adding it to the sum.

<br>To compile, navigate to where you downloaded this repo and type <code>java summationAlgorithm.java</code> in the terminal. To
test different values, open the same file and add more instances of the method or change the values found in the main method.

<h2>Algorithm 2, Array Deduplication</h2>
The time complexity of this algorithm is O(n^2). This is due to the search mechanism taking O(n) time on each iteration, meaning in the worst
case scenario we can end up with O(n^2) time complexity.

<br>Identically to the first algorithm, navigate to this repo in your file system and type <code>java arrayDeduplication.java</code> to compile and run.