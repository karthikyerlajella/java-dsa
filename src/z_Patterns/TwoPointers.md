# Two Pointers

## Definition

Two Pointers is a technique where two indices traverse a data structure (usually an array or string) to reduce unnecessary iterations and improve efficiency.

Typically used to convert **O(n²)** solutions into **O(n)**.

---

## Types

### 1. Opposite Direction

One pointer starts from the beginning and another from the end.

```java
left = 0;
right = n - 1;
```

Used for:

* Two Sum II
* Container With Most Water
* Valid Palindrome
* 3 Sum

---

### 2. Same Direction

Both pointers move forward.

```java
slow = 0;
fast = 0;
```

Used for:

* Remove Duplicates from Sorted Array
* Move Zeroes
* Remove Element

---

## Recognition Clues

Look for:

* Sorted Array
* Pair Problems
* Find Target Sum
* Palindrome Checks
* In-place Modifications
* Need Better Than O(n²)

---

## Generic Template

### Opposite Direction

```java
while(left < right){

    if(condition){
        left++;
    }
    else{
        right--;
    }
}
```

### Same Direction

```java
while(fast < n){

    if(condition){
        slow++;
    }

    fast++;
}
```

---

## Time Complexity

* O(n)

## Space Complexity

* O(1)

---

## Common Problems

### Easy

* Valid Palindrome
* Remove Duplicates from Sorted Array
* Move Zeroes

### Medium

* Two Sum II
* Container With Most Water
* 3 Sum

### Hard

* Trapping Rain Water
* 4 Sum

---

## Key Idea

Instead of checking every pair using nested loops, intelligently move pointers based on the current situation to eliminate unnecessary work.
