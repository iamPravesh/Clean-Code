<h1>Classes</h1>

<h3>Class Organization</h3>
<p>
    Following the standard Java convention, a class should begin with a list of variables. Public static constants, if any, should come first. Then private static variables, followed by private instance variables. There is seldom a good reason to have a public variable.
</p>

<h3>Encapsulation</h3>
<p>
    We like to keep our variables and utility functions private, but we're not fanatic about it.
    Loosening encapsulation is always a last resort.
</p>

<h3>Classes Should be Small!</h3>
<p>
    Small as in responsibilities.
</p>

<h3>The Single Responsibility Principle</h3>
<p>
    The Single Responsibility Principle (SRP) states that a class or module should have one, and only one, reason to change. This principle gives us both a definition of responsibility, and a guidelines for class size. Classes should have one responsibility-one reason to change.
    <br/>
    SRP is one of the more important concept in OO design. It's also one of the simpler concepts to understand and adhere to. Yet oddly, SRP is often the most abused class design principle. We regularly encounter classes that do far too many things. Why?<br/>
    Getting software to work and making software clean are two very different activities. Most of us have limited room in our heads, so we focus on getting our code to work more than organization and cleanliness. This is wholly appropriate. Maintaining a separation of concerns is just as important in our programming activites as it is in our program.
</p>

<h3>Cohesion</h3>
<p>
    Classes should have a small number of instance variables. Each of the methods of a class should manipulate one or more of those variables. In general the more variables a method manipulates the more cohesive that method is to its class. A class in which each variable is used by each method is maximally cohesive.<br/>
    The strategy of keeping functions small and keeping parameter lists short can sometimes lead to a proliferation of instance variables that are used by a subset of methods. When this happens, it almost always means that there is at least one other class trying to get out of the larger class. You should try to seperate the variables and methods into two or more classes such that the new classes are more cohesive.
</p>

<h3>Maintaining Cohesion Results in Many Small Classes</h3>

<h3>Isolating from Change</h3>
<p>
    Needs will change, therefore code will change. We learned in OO 101 that there is concrete classes, which contain implementation details (code), and abstract classes, which represent concepts only. A client class depending upon concrete details is at risk when those details change. We can introduce interfaces and abstract classes to help isolate the impact of those details.
</p>