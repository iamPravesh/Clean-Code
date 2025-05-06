<h1>Boundaries</h1>

<h3>Using Third-Party Code</h3>
<p>
    There is a natural tension between the provider of an interface and user of an interface. Providers of third-party packages and frameworks strive for broad applicability so they can work in many environments and appeal to a wide audience. Users, on the other hand, want an interface that is focused on their particular needs. This tension can cause problems at the boundaries of our system.
</p>

<h3>Exploring and Learning Boundaries</h3>
<p>
    <strong>Learning Tests</strong><br/>
    In learning tests we call the third-party API, as we expect to use it in our application. We're essentially doing controlled experiments that check our understanding of that API. The tests focus on what we want out of the API.
</p>
<h3>Learning Tests Are Better Than Free</h3>
<p>
    The learning tests end up consting nothing. We had to learn the API anyway, and writing those tests was an easy and isolated way to get that knowledge. The learning tests were precise experiments that helped increase our understanding.
</p>

<h3>Using Code That Does Not Yet Exist</h3>
<p>
    There is another kind of boundary, one that seperates the known from the unknown. There are often places in the code where out knowledge seems to drop off the edge.
</p>

<h3>Clean Boundaries</h3>
<p>
    Interesting things happen at boundaries. Changes is one of those things. Good Software desings accommodate change without huge investments and rework.When we use code that is out of our control, special care must be taken to protect our investment and make sure future change is not too costly.

    Code at boundaries needs clear separation and tests that define expectations. We should avoid letting too much of our code know about the third-party particulars. It's better to depend on something you can control than on something you don't control, lest it end up controlling you.

    We manage third-party boundaries by having very few places in the code that refer to them.
</p>