# Project 1
Technologies: java 11, Spring boot, spring data, Lombok, Spring security. Postgress, Mysql, Sql Server, or mongoDB
structure:
 <img width="493" alt="image" src="https://user-images.githubusercontent.com/16999490/208264976-f3295364-bbb2-47e6-b002-a0628472e78b.png">


Where the controller receives the request, in the facade layer we can do many validations prior to the service layer, and the mapper what it does is transform objects and thus not show the structure of our entities. Then we call the services and after that the implementation of this service, in the service we get the courses by calling the repository using JPA.
to keep a clean and tidy code we will use Lombok which saves us the work of having the getter and setter visible.
we will also use the pattern builder to obtain customized objects. and this will be used a lot in the mapper package.
regarding the communication with other microservices we can use Feign for its easy implementation and high concurrency, besides controlling exceptions is very well suited with the proposed structure where we will use exceptionHandler and have coded and customized error messages which allows us to have a better traceability in the logs. in interceptor we could implement custom user validation.

for the project we could implement many endpoints among them:
|Path| Description|
|-----------|---------|
|GET: course. |                   to obtain all courses available for the current user. |
|GET: course/${courseId}.  |      to obtain details about the selectec course.|
|PATCH: course/${courseId}.  |    in this endpoint we can update diferente parameters about the course.|

progress could be updated as each module of each course is completed.

## CONTROLLER:

<img width="738" alt="image" src="https://user-images.githubusercontent.com/16999490/208264994-d8f8902a-71e4-4d8d-8c18-2d05f925ecd7.png">



## REPOSITORY

<img width="839" alt="image" src="https://user-images.githubusercontent.com/16999490/208265002-9365363e-8297-4789-b18a-467f03e63907.png">




## FLOW:  
<img width="1344" alt="image" src="https://user-images.githubusercontent.com/16999490/208265037-0ced1c9a-ec3d-4fec-b932-b730d027f3c4.png">

## Sequence diagram:
<img width="975" alt="image" src="https://user-images.githubusercontent.com/16999490/208265053-005b2996-51b9-4de8-8f99-2d394c203837.png">


## Data base 
<img width="973" alt="image" src="https://user-images.githubusercontent.com/16999490/208265043-38bfe3dc-057c-47c4-a217-6b6cb1e65523.png">


Additional Practical Interview Questions:

1.	How would you make an application testable, what do you do to ensure code quality?

First: work with guidelines or standards and good practices, because having a good code is easy to test.
second: make unit tests to the lines of code that require it and cover all the possible cases, also you should request a minimum of 85 to 90 % of test coverage, we could add automated tests.
Third: use some tool available to obtain reports, something like sonarCloud.
Finally add the test execution in the pipeline.

2.	From a software development perspective, what steps might you take, on an ongoing basis, to continually improve your skillset?

All developers must have a curious nature, always looking to learn something new, technology advances very fast and we must keep up with it. we could take courses on platforms such as Cloud Guru or Udemy

3.	Provide an example of a time when you just couldn't complete all of your work on time to meet a deadline. What did you do? What was the result?.

When the estimate was not very accurate, the first thing I did was to talk to my scrum master to arrange some support or a time extension. we should always seek help if we have any blockers.
