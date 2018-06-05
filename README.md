# spring-hibernate-NtoN

This is the spring hibernate application demonstrating many to many mapping of hibernate.

STUDENT and COURSE have many to many relation, one student can do many courses and and one course can have many students associated.

Here we are creating STUDENT_COURSE table to store the mappings using hibernate, which is defined in Student class with @JoinTable annotation.

In Student.java entity we have defined @ManyToMany and @JoinTable annotation

In Course.java entity we have defined @ManyToMany along with mappedBy attribute, mappedBy points to courses object which is defined in Student.java entity

What does bi-directional nature of entities mean here?
Here we can access all courses of a perticular student using getCourses() method of Student class,
Also we can access the student related to the course using getStudents() method of Course class. 
