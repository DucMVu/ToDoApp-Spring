A simple to do app built on Java to create, update, delete task.

## Dependencies
There are a number of third-party dependencies used in this project. See pom.xml file for more details.

## Requirements

* JDK 8 or higher
* Maven 3.1.0 or higher
* MySQL

## List of available http requests
* Get all tasks (api/v1/tasks/all) `[{"id": 1, "task": "eat"}, {"id": 2, "task": "play games"}]`
* Post new task (api/v1/tasks/) `{"task": "run"}`
* Update task (api/v1/tasks/:id) `{"task": "run 10km"}`
* Delete task (api/v1/tasks/:id)
* Delete all tasks (api/v1/tasks/all)
* Search (api/v1/tasks/search)