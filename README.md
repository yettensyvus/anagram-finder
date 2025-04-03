## Anagram Finder
--- 
### How to Run the Program

#### Prerequisites

- `Java JDK` (version 8 or higher recommended)
- `Git`
- `IntelliJ IDEA` or another `IDE`
--- 
### Using Git and IntelliJ IDEA

**1. Clone the repository**
```bash
git clone https://github.com/yettensyvus/anagram-finder.git
cd cd .\anagram-finder\
```

**2. Open the project in `IntelliJ IDEA`:**

- Launch `IntelliJ IDEA`
- Select "`Open`" and navigate to the project folder
- Click "`OK`" to open the project

**3. Set up the input file:**

- Create a file named `sample.txt` in the project root directory

- Add words (one per line) that you want to check for anagrams

  - Example content (`sample.txt`):
    ```text
    act
    cat
    tree
    race
    care
    acre
    bee
    ```

**4. Run the program:**

- In `IntelliJ`, open the `Main.java` file
- Right-click in the editor and select `"Run 'Main.main()'"`
- Or use the green run button in the gutter next to the main method

**5. Check the output:**

- The program will create an `output.txt` file in the project root directory
- Each line will contain a group of anagrams separated by spaces
    - Example content (`output.txt`):
      ```text
      race care acre
      act cat
      bee
      tree
      ```
--- 
### Running from Command Line

#### If you prefer to run the program without IntelliJ IDEA:

**1. Compile the program:**

```bash
javac Main.java
```
**2. Run the program:**

```bash
java Main
```
**3. Verify the output:**
- Check the `output.txt` file for the results