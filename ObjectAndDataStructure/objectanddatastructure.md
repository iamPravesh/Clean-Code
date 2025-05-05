<h2>Object And Data Structure</h2>

<h3>Data Abstraction</h3>
<p>
    Example: src.dataandobject.DataAbstration and src.dataandobject.Point
    <br/><br/>
    In the Point Interface, there is no wat you can tell wether the implementation is in rectangular or polar coordinates. It might be neither! and yet the interface still unmistakely represents a data structure.
</p>

<h3>Data/Object Anti-Symmetry</h3>
<p>Objects hide their data behind abstractions and expose functions that operateon that data</p>
<p>Data Structure expose their data and have no meaningful functions</p>
<p>Procedural code (code using data structures) makes it easy to add new functions without changing the existing data structures.</p>

<h3>The Law of Demeter</h3>
<p>
    Law of Demeter says that a module should not know about the innards of the objects it manipulates. An object should not expose its internal structure through accessors because to do so is to expose, rather than to hide, its internal structures
</p>

<h3>Train Wrecks</h3>
<p>
    final String outputDir = ctxt.getOptions().getScratchDir().getAbsolutePath();<br/>
    This kind of code is often called a <i>train wreck</i> because it look like a bunch of coupled train cars. Chains of calls like this are generally considered to be sloppy style and should be avoided. It is usually best to split them up.<br/>
</p>

<h3>Hybrids</h3>
<h3>Hiding Structure</h3>

<h3>Data Transfer Objects</h3>
<p>
    The quintessential form of a data structure is a class with public variables and no functions. This is sometimes called a data transfer object or DTO.
</p>
<h4>Active Record</h4>
<p>
    Active Records are special form of DTOs. They are data structures with public variables; but they typically have navigational methods like save and find. Typically these Active Records are direct translations from database tables, or other data sources.
</p>

<h3>Conclusion</h3>
<p>
    Objects expose behaviour and hide data. This makes it easy to add new kinds of objects without changing existing behaviours. It also makes it hard to add new behaviours to existing objects.<br/> 
    Data structures expose data and have no significant behaviour. This makes it easy to add new behaviours to existing data structures but make it hard to add new data structure to existing functions.
</p>