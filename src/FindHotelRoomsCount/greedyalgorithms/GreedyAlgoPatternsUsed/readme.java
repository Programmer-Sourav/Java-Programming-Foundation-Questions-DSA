package FindHotelRoomsCount.greedyalgorithms.GreedyAlgoPatternsUsed;

//| Problem             | Strategy                   | Key Operation                    |
//        | ------------------- | -------------------------- | -------------------------------- |
//        | Fractional Knapsack | Max value/weight ratio     | Greedy pick                      |
//        | Activity Selection  | Earliest finish time       | Sort by end time                 |
//        | Train Platforms     | Simulate with 2 pointers   | Sort arrivals & departures       |
//        | Job Sequencing      | Max profit before deadline | Latest free slot before deadline |
//        | Huffman Coding      | Combine min frequencies    | Priority queue (min heap)        |



//💡 Key Operations in Greedy Strategy:
//Selection based on Ratio (e.g. value/weight)
//
//Earliest Finish Time First (e.g. activity selection)
//
//Minimum Cost at Each Step (e.g. Huffman coding, Kruskal’s MST)
//
//Maximize Number of Items (e.g. coin change, max meetings)
//
//Greedy by Sorting (e.g. interval scheduling, min platforms)


//Key Operation	Use Case Examples
//Sorting	Activity Selection, Job Scheduling, Knapsack
//Greedy Choice Property	Always choose local optimum (e.g., value)
//Priority Queue	Huffman Coding, Dijkstra, Prim
//Two Pointers	Train Platforms, Merging Intervals
//Allocation	Job Assignment, Task Scheduling
//Construction	Huffman Tree, MST
//Early Stopping	Knapsack full, Jobs exhausted
//Sliding Window	Subarrays with constraints


//
//| **Operation**      | **Example Problem**                 | **Suggested Problem**                           |
//        | ------------------ | ----------------------------------- | ----------------------------------------------- |
//        | **Sorting**        | Interval Scheduling                 | **Minimum Number of Arrows to Burst Balloons**  |
//        | **Greedy Choice**  | Largest Number                      | **Form the Largest Number from Digits**         |
//        | **Priority Queue** | Merge K Sorted Lists (Heap usage)   | **Minimum Cost to Connect Ropes**               |
//        | **Two Pointers**   | Maximize Number of Content Children | **Assign Cookies to Children**                  |
//        | **Allocation**     | Task Scheduling with Cooling        | **Rearrange Characters to Avoid Adjacent Same** |
//        | **Construction**   | Kruskal's MST                       | **Reconstruct Itinerary (Lex Order)**           |
//        | **Early Stopping** | Gas Station Problem                 | **Can Complete Circuit**                        |
//        | **Sliding Window** | Longest Subarray with Sum ≤ K       | **Maximum Sum Subarray of Size K**              |



//| Problem                       | Pattern                      |
//        | ----------------------------- | ---------------------------- |
//        | Burst Balloons                | Greedy + Sorting             |
//        | Largest Number                | Greedy Choice + Sorting      |
//        | Minimum Cost to Connect Ropes | Greedy + Priority Queue      |
//        | Assign Cookies                | Greedy + Two Pointers        |
//        | Rearrange Characters          | Greedy + Heap (Max Freq)     |
//        | Reconstruct Itinerary         | Greedy + DFS + Lexical Order |
//        | Can Complete Circuit          | Greedy + Early Stopping      |
//        | Max Sum Subarray of Size K    | Greedy + Sliding Window      |
