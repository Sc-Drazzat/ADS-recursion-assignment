Consider the Scottish road network shown below.  
Use the shortest-path algorithm to determine the shortest path from Edinburgh to Dundee.  
Graph 
Nodes:  
1. Edinburgh  
2. Stirling
3. Perth
4. Dundee
5. Glasgow

Edges:
1. Edinburgh–Stirling = 50
2. Edinburgh-Glasgow = 70
3. Edinburgh–Perth = 100
4. Stirling-Glasgow = 50 
5. Stirling–Perth = 40 
6. Perth–Dundee = 60  

To determine the shortest path from Edinburgh to Dundee we can follow these steps:
1. Start at Edinburgh distance = 0
2. Update distances to neighbors:
   - Stirling: 50 (from Edinburgh)
   - Glasgow: 70 (from Edinburgh)
   - Perth: 100 (from Edinburgh)
   - Dundee: infinity
3. Choose the unvisited node with the smallest distance Stirling and mark it as visited
4. Update distances to neighbors of Stirling:
   - Stirling: 50 (already visited)
   - Glasgow: 70 (from Stirling) from Edinburgh-Stirling is 50 + 50 = 100 but from Edinburgh is 70, so we keep it at 70
   - Perth: 90 (from Stirling) from Edinburgh is 100 but from Stirling is 50+40=90, so we update it to 90
   - Edinburgh: 50 (already visited)
   - Dundee: infinity
5. Choose the unvisited node with the smallest distance Glasgow and mark it as visited
6. Update distances to neighbors of Glasgow:
   - Stirling: 50 (already visited)
   - Edinburgh: 70 (already visited)
   - Perth: 90 (from Stirling), from Glasgow there no path to Perth, so we keep it at 90
   - Dundee: infinity
7. Choose the unvisited node with the smallest distance Perth and mark it as visited
8. Update distances to neighbors of Perth:
   - Stirling: 40 (already visited)
   - Edinburgh: 100 (already visited)
   - Dundee: 150 (from Perth) from Perth is 90+60=150, so we update it to 150

Shortest path from Edinburgh to Dundee is: Edinburgh - Stirling - Perth - Dundee with distance of 150