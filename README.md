# inventory-management-system
- the 4 core resourses is : item, customer, order, company
- My project is about selling different items for the customers
- We have orders that contains the items that have been sold
- Every item made in a certain company
- We will design rest api to make the operation on the core resourses
- Every core resourse can be updated, add a new one from it and also delete it

Here is the ER Diagram for the database:
![ER-Diagram](https://github.com/adham-turki/inventory-management-system/assets/140730348/98d6bc03-9671-475e-8125-a64f0ebe5c3f)

HTTP request (method URI):
Orders:
  GET /orders :
    Operation : Read
    Description : Get a list of all orders.
    HTTP status codes : 200 (OK) : Indicates that the request has succeeded.
                        204 (No Content): The server has fulfilled the request but does not need to return a response body.
                        306 (Unused) : It is a reserved status code and is not used anymore.
                        401 (Unauthorized) : Indicates that the request requires user authentication information.
                        404 (Not Found) : The server can not find the requested resource.
                        501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled.

