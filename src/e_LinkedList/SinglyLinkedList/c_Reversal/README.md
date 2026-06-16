# Linked List Reversal Pattern

The Linked List Reversal Pattern is used to reverse the direction of links between nodes.

This pattern is one of the most important Linked List techniques and appears frequently in coding interviews.

---

## Core Idea

Use three pointers:

```java id="u6mbps"
prev = null;
curr = head;
next = null;
```

At each step:

1. Store next node
2. Reverse current link
3. Move pointers forward

---

## Generic Template

```java id="vcrqlz"
Node prev = null;
Node curr = head;

while(curr != null){

    Node next = curr.next;

    curr.next = prev;

    prev = curr;
    curr = next;
}

return prev;
```

---

## Recognition Clues

Look for:

* Reverse Linked List
* Reverse Between Positions
* Reverse in Groups
* Reverse Alternate Nodes
* Palindrome Linked List
* Reorder List

---

## Time Complexity

| Operation | Complexity |
| --------- | ---------- |
| Reversal  | O(n)       |

---

## Space Complexity

| Approach  | Complexity |
| --------- | ---------- |
| Iterative | O(1)       |
| Recursive | O(n)       |

---

## Common Problems

### Easy

* Reverse Linked List (LC 206)

### Medium

* Reverse Linked List II (LC 92)
* Reorder List (LC 143)
* Swap Nodes in Pairs (LC 24)

### Hard

* Reverse Nodes in k-Group (LC 25)

---

## Key Idea

Always save the next node before changing links.

```java id="hb15jy"
Node next = curr.next;
```

Otherwise, the remaining part of the Linked List will be lost.

The reversal pattern is the foundation for many advanced Linked List interview problems.
