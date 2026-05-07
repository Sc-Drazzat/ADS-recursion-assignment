Task 1
Consider the following graph with vertices and their adjacency lists.\
In what order will the nodes be visited using a Depth First Search considering the source node is A?\
Provide the detailed trace of the depth-first search \
(Refer to the book by Sedgewick and Wayne, Algorithms 4th edition, page 537).\
A: C B D  
B: A C E G  
C: A B D  
D: C A  
E: G F B  
F: G E  
G: F B  
The order of nodes visited using Depth First Search (DFS) starting from node A is as follows:
1. Start at A
2. Visit C from A
3. Visit B from C
4. Visit E from B
5. Visit G from E
6. Visit F from G
7. Backtrack to G
8. Backtrack to E
9. Backtrack to B
10. Backtrack to C
11. Visit D from C
12. Backtrack to C
13. Backtrack to A

Order of nodes visited: A, C, B, E, G, F, D

