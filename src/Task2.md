In what order will the nodes of the graph above be visited using a  
Breadth First Search considering the source node is A?  
Provide the detailed trace of the breadth-first search using.  
(Refer to the book by Sedgewick and Wayne, Algorithms 4th edition, page 539).  
A: C B D  
B: A C E G  
C: A B D  
D: C A  
E: G F B  
F: G E  
G: F B  
The order of nodes visited using Breadth First Search (BFS) starting from node A is as follows:
Queue = [A]
1. Start at A
2. Dequeue A and enqueue its neighbors: C, B, D. Queue = [C, B, D]
2. Visit C from A
3. Dequeue C and enqueue its neighbors: A (already visited), B (already visited), D (already visited). Queue = [B, D]
4. Visit B from A
5. Dequeue B and enqueue its neighbors: A (already visited), C (already visited), E, G. Queue = [D, E, G]
6. Visit D from A
7. Dequeue D and enqueue its neighbors: C (already visited), A (already visited). Queue = [E, G]
8. Visit E from B
9. Dequeue E and enqueue its neighbors: G (already visited), F, B (already visited). Queue = [G, F]
10. Visit G from B
11. Dequeue G and enqueue its neighbors: F (already visited), B (already visited). Queue = [F]
12. Visit F from E
13. Dequeue F and enqueue its neighbors: G (already visited), E (already visited). Queue = []
Order of nodes visited: A, C, B, D, E, G, F