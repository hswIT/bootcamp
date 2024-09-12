## Exception

### What is unchecked exception
  - you don't have to handle the exception by "try catch" or "re-throw"
  - you can ignore the potential exception scenario (refer to ExceptionChainExample1.java)
  - You can recover as well

### What is checked exception
  - Create custom class (extends Exception.class) 
  - you have to handle the exception by 2 ways
    - "Try catch"
    - Re-throw by method signature

### Unchecked Exception (Runtime Exception)
  - /by zero, NPE, IAE, IndexOutOfBounds, etc.....(Likely Memory Limitation)

### Checked Exception (Compile Time Exception)
  - IOException (DB login, Server service unavailable, File access, File not found)
  - Custom Exception 

### Why do we need Exception?
  - The world without Exception, you can only use "return" for method communication
    - return -> Happy Path
  - The world with Exception, you can both use "return" and "throw"