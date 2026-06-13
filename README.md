## Source : [Striver's A2Z Sheet - Learn DSA from A to Z](https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z)

# src/

Source code for DSA problems in Java.

## Structure

```
src/
├── a_Foundations/      # Math basics (GCD, Prime, Fibonacci)
├── b_Sorting-techniques/  # Sorting (Bubble, Merge, Quick)
```

## How to Compile & Run

### Single file:
```
cd src
javac 01_foundations/CountDigits.java
java 02_Foundations.CountDigits
```

### Using IDE (VS Code / IntelliJ):
1. Open the folder in your IDE
2. Open any `.java` file
3. Click Run (or press Ctrl+Shift+F10 in IntelliJ)

## File Naming

- `ProblemName.java` — One problem per file
- Example: `TwoSum.java`, `MergeSort.java`, `LongestSubstring.java`

## Code Style

- Clean, readable code
- No verbose comments
- Time & Space complexity in class header (optional)

Example:
```java
// Two Sum | O(n) time, O(n) space
class TwoSum {
    public int[] solve(int[] nums, int target) {
        // implementation
    }
}
```
