<h1>Error Handling</h1>

<h3>Use Exceptions Rather Than Return Codes</h3>

<h3>Write your Try-Catch-Finally Statement First</h3>
<p>
    In a way, try blocks are like transactions. Your catch has to leave your program in a consistent state, no matter what happens in the try.
    For this reason it is good practice to start with a try-catch-finally statement when you are writing code that could throw exception.
</p>

<h3>Use Unchecked Exceptions</h3>
<p>
    The price of checked exceptions is an Open/Closed Principle violation. If you throw a checked exception from a method in your code and the catch is three levels above, you must declare that exception in the signature of each method between you and the catch. This means that a change at a low level of the software can force signature changes on many higher levels. The changed modules must be rebuild and redeployed, even though nothing they care about changed.
    <br/>
    Checked exceptions can sometimes be useful if you are writing a critical library: You must catch them.
    But in general application development the dependency costs outweigh the benefits.
</p>

<h3>Provide Context with Exceptions</h3>
<p>
    Each exception that you throw should provide enough context to determine the source and location of an error. In Java, you can get a stack trace from any exception; however, a stack trace can't tell you the intent of the operation that failed.
    <br />
    Create informative error messages and pass them along with your exceptions. Mention the operation that failed and the type of failure. If you are logging in your application, pass along enough information to be able to log the error in your catch.
</p>

<h3>Define the Normal Flow</h3>

<h3>Don't Return Null</h3>

<h3>Don't Pass Null</h3>

<h3>Conclusion</h3>
<p>
    Clean code is readable, but it must also be robust. These are not conflicting goals. We can write robust clean code if we see error handling as a separate concern, something that is viewable independently of our main logic. To the degree that we are able to do that, we can reason about it independently, and we can make great strides in the maintainability of our code.
</p>