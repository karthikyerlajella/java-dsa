# Fast and Slow Pointer

## Definition

Fast and Slow Pointer (Floyd's Algorithm) uses two pointers moving at different speeds.

* Slow Pointer → moves 1 step at a time
* Fast Pointer → moves 2 steps at a time

Primarily used in Linked Lists.

---

## Working

```java id="o1m0lg"
slow = head;
fast = head;

while(fast != null && fast.next != null){
    slow = slow.next;
    fast = fast.next.next;
}
```

---

## Types

### 1. Find Middle Node

When fast reaches the end, slow will be at the middle.

Used for:

* Middle of Linked List
* Merge Sort on Linked List

---

### 2. Detect Cycle

If a cycle exists, fast and slow will eventually meet.

Used for:

* Linked List Cycle (LC 141)

---

### 3. Find Starting Node of Cycle

After detecting a cycle:

* Move one pointer to head
* Move both one step at a time
* Meeting point = start of cycle

Used for:

* Linked List Cycle II (LC 142)

---

## Recognition Clues

Look for:

* Linked Lists
* Cycle Detection
* Find Middle Element
* Circular Structure
* Need O(1) Space

---

## Generic Template

### Find Middle Node

```java id="o1h71d"
slow = head;
fast = head;

while(fast != null && fast.next != null){
    slow = slow.next;
    fast = fast.next.next;
}

return slow;
```

### Detect Cycle

```java id="cwbkyi"
slow = head;
fast = head;

while(fast != null && fast.next != null){

    slow = slow.next;
    fast = fast.next.next;

    if(slow == fast){
        return true;
    }
}

return false;
```

---

## Time Complexity

* O(n)

## Space Complexity

* O(1)

---

## Common Problems

### Easy

* Middle of the Linked List

### Medium

* Linked List Cycle
* Linked List Cycle II
* Happy Number

### Hard

* Find Duplicate Number

---

## Key Idea

Move one pointer faster than the other.

If they ever meet, there is a cycle.
If the fast pointer reaches the end, there is no cycle.

This allows cycle detection and middle-node finding in **O(n)** time using **O(1)** extra space.
