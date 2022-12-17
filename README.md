Project 1
Technologies: java 11, Spring boot, spring data, Lombok, Spring security. Postgress, Mysql, Sql Server, or mongoDB
structure:
 

Where the controller receives the request, in the facade layer we can do many validations prior to the service layer, and the mapper what it does is transform objects and thus not show the structure of our entities. Then we call the services and after that the implementation of this service, in the service we get the courses by calling the repository using JPA.
to keep a clean and tidy code we will use Lombok which saves us the work of having the getter and setter visible.
we will also use the pattern builder to obtain customized objects. and this will be used a lot in the mapper package.
regarding the communication with other microservices we can use Feign for its easy implementation and high concurrency, besides controlling exceptions is very well suited with the proposed structure where we will use exceptionHandler and have coded and customized error messages which allows us to have a better traceability in the logs. in interceptor we could implement custom user validation
FOR THE PROJECT WE COULD IMPLEMENT MANY ENDPOINTS
among them:
GET: course.                    -> to obtain all courses available for the current user 
GET: course/${courseId}.        -> to obtain details about the selectec course 
PATCH: course/${courseId}.      -> in this endpoint we can update diferente parameters about the course.

progress could be updated as each module of each course is completed.

CONTROLLER:@Slf4j
@RestController
@RequestMapping("/v1/course")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CourseController {

private CourseFacade courseFacade

@GetMapping
@ResponseStatus(HttpStatus.OK)
public GenericResponse<ProcessItemResponseDTO> getAllCourses(@RequestAttribute UuserSession userSession) {
log.info("[CourseController:getAllCourses]");
var response = new GenericResponse<CoursesResponseDTO>();
response.setData(courseFacade.getAllCourser(userSession));
response.setSuccess(true);
return response;
}

}
REPOSITORY
@Query(nativeQuery = true, value = "select c from course c inner join student_enrolled s where s.id_student = :studentId")
List<Course> findAllByUser(User user);

@Query(nativeQuery = true, value = "select c from course c inner join location l where l.available_location = :studentLocation")
List<Course> findAllAvailableCourse(Location userLocation);



FLOW:  

Sequence diagram:

Data base 




