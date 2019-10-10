# Exercises

Some suggested exercises. The purpose is to learn mocking. If you come with your own,
pursue them!

## Preparation
If you have a database running as instructed in the readme, it should be possible
to get the micro service started. The main class is `ThebandApplication`. 
Test http://localhost:5705/albums to see it return an empty list.

## The exercises
1. Controller - Service interaction

    The controller returns an empty list. Using TDD, drive forward
    an implementation that calls the service. Hint: use `Mockito.verify`.

    The service has no method yet, let the test tell you what it should be like.

1. Service implementation
    
    Switch to the service. Still no implementation of the method called by the
    controller, you should have a stub by now. Use TDD to create an implementation
    where you handle the cases, nothing in the database, something in the database
    and broken database. Hint: `Mockito.when` with `thenReturn` and with `thenThrow`.
    
    There is some test code already. Use it for inspiration.
    
        Sidenote: Exception handling in a micro service is a bit different. You generally have
        an exception mapper that returns standard Http status codes, such as 404
        for something not found. Therefore, checked exceptions are not used.
        
        See the class ExceptionHandling for more on this. 

1. Capture the call
    
    Create a Post method in the controller that creates a new album. Hint: use
    `@PostMapping` annotation and define a class for the body, perhaps `CreateAlbumRequest`?
    
    The controller should get help from a service method in the same pattern as
    above.
    
    The AlbumEntity should have a UUID as primary key and we will let the application,
    not the database, generate it (`UUID.randomUUID().toString()`). Verify that
    the service calls `save` on the repository with a new UUID.
    
    Hint: use `ArgumentCaptor`, see the README.