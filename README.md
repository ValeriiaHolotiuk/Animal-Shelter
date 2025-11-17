Animal Shelter – Data Structures & Algorithms Assignment

This project implements an Animal Shelter system that supports adoption operations for dogs and cats using a FIFO (first in, first out) structure.  
People can adopt:
- the oldest animal overall (`dequeueAny`), or  
- the oldest dog (`dequeueDog`), or  
- the oldest cat (`dequeueCat`).


The shelter is implemented using two queues:
- One queue for **dogs**
- One queue for **cats**

Every animal receives an increasing order number when it is added.  
This allows the shelter to:
- compare which animal arrived first  
- adopt the correct one efficiently  

All operations run in O(1) time.

---

-Classes Overview
- Animal` 
- Base class for dogs and cats  
- Stores: name, order number  
- Method `isOlderThan()` compares arrival time  

-Dog and Cat
- Extend `Animal`  
- Add no new fields (for this assignment)

-AnimalShelter
Implements the main logic:
- `enqueue(Animal)`
- `dequeueAny()`
- `dequeueDog()`
- `dequeueCat()`

 -Main
Simple tester class that:
- Inserts several dogs and cats
- Demonstrates all adoption operations

--Example Output

![alt text](<Screenshot 2025-11-17 at 6.38.19 PM.png>)