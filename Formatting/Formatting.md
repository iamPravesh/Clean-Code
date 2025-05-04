<h1>Formatting</h1>

<h3>Virtical Formatting</h3>

<h3>The Newspaper Metaphor</h3>
<p>We would like a source file to be like a newspaper article. The name should be simple but explanatory. The name, by itself, should be sufficient tot tell us whether we are in the right module or not. The topmost parts of the source file should provide the high-level concepts and algorithms. Detail should increase as we move downward, until at the end we find the lowest level functions and details in the source file.</p>

<h3>Virtical Openness Between Concepts</h3>

<h3>Dependent Functions</h3>
<p>If one function calls another, they should be vertically close, and the caller should be above the callee, if at all possible.</p>

<h3>Conceptual Affinity</h3>
<p>Certain bits of code want to be near other bits. They have a certain conceptual affinity. The stronger that affinity, the less vertical distance there should be between them.</p>

<h3>Vertical Ordering</h3>
<p>
    In general, we want function call dependencies to point in the downward direction. That is, a function that is called should be below a function that does the calling. This creates a nice flow down the source cide module from high level to low level. 
</p>

<h3>Horizontal Formatting</h3>

<h3>Horizontal Openness and Density</h3>

<h3>Horizontal Alignment</h3>

<h3>Indentation</h3>

<h3>Team Rule</h3>
<p>
    A team of developers should agree upon a single formatting style, and then every member of that team should use that style.
    <strong>A good software system is composed of a set of documents that read nicely.</strong>
</p>