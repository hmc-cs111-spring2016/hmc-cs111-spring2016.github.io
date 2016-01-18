---
layout: syllabus
title:  Syllabus
date:   2016-01-12 01:49:16
categories: jekyll update
---

[Piazza]: http://piazza.com/hmc/spring2016/cs111
[Syllabus]: syllabus.html
[Repo]: https://github.com/hmc-cs111-spring2016
[Wiki]: https://github.com/hmc-cs111-spring2016/hmc-cs111-spring2016.github.io/wiki
[honor code]: https://www.hmc.edu/student-life/student-handbook/standards-of-student-conduct-honor-code/
[Scala]: http://www.scala-lang.org
[Scala doc]: http://www.scala-lang.org/documentation/
[SftI]: http://www.horstmann.com/scala/index.html
[LIP]: https://pragprog.com/book/tpdsl/language-implementation-patterns

# About This Course

## Description

This course explores how to design a new programming language. In particular, we’ll focus on "Domain-Specific Languages"—languages designed for people who want to use a computer to perform a specialized task (e.g., to compose music or query a database or make games). Through readings, discussions, and programming, we'll investigate why and how you would create a domain-specific language. The course also features a project that asks you to propose, design, and implement your own domain-specific language.

We'll also investigate questions about how Computer Science and programming languages relate to society, including:

   - What counts as programming?
   - What counts as a programming language?
   - Who gets to call themselves a programmer?
   - How (much) does language influence thought?
   - How do we make software that other people will find useful?

CS 111 follows a "studio model", where all work-in-progress is made public, and we rely on each other's critiques to improve our work. Sample solutions are published at the beginning of the assignment, you'll often work in teams, you'll have access to everyone else's work throughout the assignment, and every assignment has a peer-review component. 

## Learning Objectives

This course has two broad aims, each with specific objectives:

**Aim 1:** To familiarize you with the purpose, design, implementation,
specification, and evaluation of domain-specific languages.

*Objectives:*

-   Compare and contrast the benefits and drawbacks of a domain-specific
    language versus a general-purpose language.
-   Analyze a domain and identify its semantic model(s) and linguistic
    abstractions.
-   Design language-based user interfaces.
-   Evaluate language design choices.

**Aim 2:** To give you the opportunity to explore a wide variety of
high-level language-implementation techniques.

*Objectives:*

-   Identify the properties of a general-purpose host language that make
    it (un)suitable for implementing a domain specific language.
-   Explore, compare, and contrast techniques for implementing an
    *internal* versus an *external* DSL.
-   Construct artifacts to support DSL users, including error-handling
    and semantic tools.
-   Learn to program in Scala.

Because DSLs are a powerful and flexible programming tool, we will
explore the topic systematically and thoroughly, building up concepts
and code that should be useful to you in your end-of-semester project
and in your future studies and careers.

# Style and Approach
One of the things I want to explore this 
semester is design and the design process: how do we make something that other 
people find useful? To answer this question for a programming language, we'll 
take a studio design approach. 

In our studio, **_all work in progress is made public_** 
[[John Seely Brown](http://www.fastcodesign.com/1665654/4-lessons-the-classroom-can-learn-from-the-design-studio)].
Assignments, critiques, grading, and projects will be viewable by everyone in 
the class, all the time. Much of our work will be to comment on, critique,
improve upon, and be improved by one another.

# Coursework and Grading

Your grade in this course will be a combination of:

-   **Assignments (40%).** There will be roughly one assignment per week for at least
the first six weeks (after that, you'll be working on your projects). The 
assignments will be reading+writing or programming. Some assignments you will 
complete on your own; some you may do in a team.
_Every_ assignment will have a "critique" component, where you help evaluate
someone else's work. Assignments will typically be given out on Wednesday, with
the submission due the subsequent Sunday and the critque due on Tuesday.
-   **Project (40%).** You will complete one large project that asks you
    to design, implement, and evaluate your own domain-specific
    language. Though the project is due at the end of the semester, I
    will provide milestones and guidelines throughout the semester, to
    help you stay on track. I'll be handing out *lots* more details —
    including expectations, grading criteria, and project suggestions —
    when the time comes, about three weeks into the semester.
-   **Participation (20%).** A course like this one benefits from lively
    debate and from our diversity of experience and interests. There
    often is no right answer to a problem, so I expect that you will
    contribute your opinions and reasoning both in and out of class, especially
    through critiques. I
    also expect that you will share your interests: Do you know of an
    interesting domain or found a cool DSL? Let us know! During class, I
    will set aside times for us to discuss these things. You can also
    post them on Piazza. Participation is a naturally
    subjective quality, though it can be measured. I will measure your
    participation in part by assigning small thinking/writing exercises
    during class, asking for feedback on assignments, and observing your
    interactions with classmates. Half-way through the semester, I will
    ask you to assess your level of participation. I will compare my
    assessment to yours, and if there is a discrepancy, we will work it
    out. Rest assured, I want you to succeed. If you are concerned about
    your level of participation or how I might perceive it, please
    e-mail or visit with me.

# Resources

**Scala:** During the first half of the semester, we'll be programming in [Scala]. 
    Scala is installed on `knuth`, but you'll probably want to install Scala on 
    your own machine. I'll provide some extra information on the Scala tools we'll
    use during the third week of class. There are lots of good online resources
    for [learning Scala][Scala doc].

**Books:** There are two recommended books for the course. You don't *need* to buy either of them; but I recommend them because the each give the most bang for the buck in this class.

   - _[Scala for the Impatient][SftI]_ by Cay Horstmann. This book is a good reference for the Scala programming language, which we'll be using a lot during the first half of the course. I'll point out parts of the book that might be useful for particular assignments.
   - _[Language Implementation Patterns][LIP]_ by
    Terence Parr. This book is a great, general resource for implementing programming languages. It will be most useful to you during the second half of the course, as you work on your project. I won't give any assigned readings, but I might point you to parts of the book that I think will help with your project.

**Piazza:** A [discussion forum][Piazza] where I'll post announcements and we can ask questions about the course. You're required to keep up with announcements on Piazza.

**GitHub repository:** All the assignments and course notes will live on [GitHub][Repo], where we'll also comment on and critique each other's work.

# Feedback

Feedback is an important part of any learning. During this course I will
be asking you to give me feedback on your learning in implicit ways
(e.g., exercises and assignments) as well as explicit ways (e.g., "How's
the class going for you?"). This is *your* class, and I want to make
sure you get the most out of it. Please let me know right away when
something we discuss is not clear. If you don't understand something,
chances are that several other students feel the same way. You are
always free to interrupt me — don't let me get away with glossing over
any topic. I also welcome any feedback about the structure, tone, and
nature of this course. I ask that you give me this kind of feedback
outside of class — either in office hours or via email. If you would
like to give me anonymous feedback, you can send [anonymous
email](http://email.about.com/od/anonymousemail/qt/%0AHow_to_Send_an_Anonymous_Email.htm).


# Collaboration and the Honor Code

This course is highly collaborative. There will also be a few times when
you should complete work on your own. You should conduct yourself in accordance 
with the [Harvey Mudd Honor Code][honor code]
and with the Computer Science Department's [academic
honesty](https://www.cs.hmc.edu/honesty.pdf) policy. If you have any
questions, please ask me.

Even though everyone else's work (and often, the solution) will be available at
all times, you _must_ do your own work. You can be inspired by others, but you
should look at someone else's work only after doing your own work. If you are
inspired by someone else's solution, you can _incorporate_ into your own, with
attribution. Use your good judgement here. If you have
any questions about what's acceptable, it is your
responsibility to come see me before you engage in this behavior. I am
more than happy to answer any questions you may have.

# Notices

### Writing Center

The [Writing Center](http://www.hmc.edu/writingcenter) provides a welcoming 
space for writers to get feedback on
their composition projects, whether written, spoken or visual pieces. Writing
Center Consultants are prepared to assist students in any discipline with any
stage of the writing process, from developing an idea to polishing a final
draft. Even the most accomplished writers benefit from seeking feedback at the
writing center. The center is open Sunday through Thursday evenings from 7-11
and Saturday and Sunday afternoons from 3-5.  It is located in Shanahan 1470,
just up the walkway from the cafe.  You may schedule an appointment through
their [website](http://www.hmc.edu/writingcenter), or you may simply drop in 
during normal
hours.  If you'd like an appointment outside of normal hours, you may email
[writing_center@hmc.edu](mailto:writing_center@hmc.edu) with your request.  
**You will likely find your writing
center visit more valuable if you go earlier than the night before your final
draft is due.**

### Accommodations

To request academic accommodations due to a disability, HMC students should
contact <a href="mailto:hbird@hmc.edu">Heidi Bird</a> our Coordinator of Student
Support. For students from the other Claremont Colleges, please contact your
home college’s disability officer:

   - CMC:  <a href="mailto:julia.easley@cmc.edu">Julia Easley </a>
   - CGU: <a href="mailto:chris.bass@cgu.edu">Chris Bass </a>
   - Pitzer:  <a href="mailto:jill_hawthorne@pitzer.edu">Jill Hawthorne </a>
   - Pomona:  <a href="mailto:jan.collins-eaglin@pomona.edu">Jan Collins-Eaglin </a>
   - Scripps:  <a href="mailto:sdelator@scrippscollege.edu">Sonia De La Torre-Iniguez </a>
