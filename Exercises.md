# Exercises

Some suggested exercises. The purpose is to learn mocking. If you come with your own,
pursue them!

1. Controller - Service interaction

    The controller returns an empty list. Using TDD, drive forward
    an implementation that calls the service. Hint: use Mockito.verify.

    The service has no method yet, let the test tell you what it should be like.

1. Service implementation
    
    Switch to the service. Still no implementation of the method called by the
    controller, you should have a stub by now. Use TDD to create an implementation
    where you handle the cases, nothing in the database, something in the database
    and broken database. Hint: Mockito.when with thenReturn and with thenThrow.
    
    There is some test code already. Use it for inspiration.
    
    Exception handling in a micro service is a bit different. You generally have
    an exception mapper that returns standard Http status codes, such as 404
    for something not found. Therefore, checked exceptions are not used.