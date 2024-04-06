<h2>Functions</h2>
<br /> <br />

<h4>Small</h4>
<p>The first rule of functions is that they should be small. The second rule of functions is that they should be smaller than that.</p><br />

<h4>Blocks and Indenting</h4>
<p>This implies that the blocks within if statements, else statements, while statements, and so on should be one line long. Probably that line should be a function call. <br />
The functions should not be large enough to hold nested structures. Therefore, the indent level of a function should not be greater than one or two. This, of course, makes the functions easier to read and understand.</p><br />

<h4>Do One Thing</h4>
<p>
    <strong>Functions should do one thing. They should do it well. They should do it only.</strong>
    <ul>
        <li>One Level of Abstraction per Function</li>
    </ul>
    <h5>Reading Code from Top to Bottom</h5>
    We want the code to read like a top-down narrative. We want every function to be followed by those at the next level of abstraction so that we can read the program, descending one level of abstraction at a time as we read down the list of functions. 
</p><br />

<h4>Switch Statements</h4>
<P>
    We can make sure that the each SWITCH STATEMENTS is buried in a low-level class and is never repeated.
</P>

<h4>Use Descriptive Names</h4>
<p>
    Choose good names for small functions that do one thing.
</p>

<h4>Function Arguments</h4>
<p>
    The ideal number of arguments for a function is zero(niladic) then next comes one(monadic) then two (dyadic) and then (triadic), More than three requires very special justification.

    Output arguments are harder to understand than input arguments. When we read a function, we are used to the idea of information going in to the function through arguments and out through the return value. We don't usually expect information to be going out through the arguments. So ooutput arguments often cause us to do a double-task.

    Types of function arguments:
    <ul>
        <li>Niladic (0 arguments)</li>
        <li>Monadic (1 argument)</li>
        <li>Dyadic (2 arguments)</li>
        <li>Triads (3 arguments)</li>
        <li>polyadic (more than 3 arguments)</li>
    </ul>
</p>

<h4>Flag Arguments</h4>
<p>
    Flag arguments are ugly. Passing a boolean into a function is a truly terrible practice. It immediately compicates the signature of the method, loudly proclaiming that this function does more than one thing. It does one thing if flag is true and another if the flag is false.
</p>

<h4>Argument Objects</h4>
<p>
    When a function seems to need more than two or three arguments, it is likely that some of those arguments ought to be wrapped into a class of their own.
</p>

<h4>Verbs and Keywords</h4>
<p>
    Choosing good names for a function can go along way toward explaining the intent of the function and the order and intent of the arguments.
</p>

<h4>Have NO Side Effects</h4>
<p>
    Side Effects are lies. Your function promises to do one thing but it also does other hidden things. Sometimes it will make unexpected changes to the variables of its own class. Sometimes it will make them to the parameters passed into the function or to sustem globasls. In either case, they are devious and damaging mistruths that often result in strange temproral coupling and order dependencies.
</p>

<h4>Command Query Separation</h4>
<p>
    Functions should either do something or answer something, but not both. Either your function should change the state of an object, or it should return some information about that object. Doing both often leads to confusion.
</p>

<h4>Prefer Exceptions to Returning Error Codes</h4>
<p>
    Returning error codes from command functions is a subtle violation of command query separation. It promotes commands being used as expressions in the predicates of if statements.

    If you use exceptions instead of returned error codes, then the error processing code can be separated from the happy path code and can be simplified.
</p>

<h4>Don't Repeat Yourself</h4>

<h4>Structured Programming</h4>
<p>
    Dijkstra said that every function, and every block within a function, should have one entry and one exit. Following these rules means that there should only be one return statement in a function, no break or continue statements in a loop, and never, ever, any goto statements.
</p>


<h3>Conclusion</h3>
<p>
    Every system is build from a domain specific language designed by the programmers to describe that system. Functions are the verbs of that language, and classes are the nouns.
</p>