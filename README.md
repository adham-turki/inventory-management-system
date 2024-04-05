# inventory-management-system
- the 4 core resourses is : item, customer, order, company
- My project is about selling different items for the customers
- We have orders that contains the items that have been sold
- Every item made in a certain company
- We will design rest api to make the operation on the core resourses
- Every core resourse can be updated, add a new one from it and also delete it

Here is the ER Diagram for the database:
![ER-Diagram](https://github.com/adham-turki/inventory-management-system/assets/140730348/98d6bc03-9671-475e-8125-a64f0ebe5c3f)

- HTTP requests (methods URI):
  
- Orders:
- GET /orders :
- Operation : Read
- Description : Get a list of all orders.
- HTTP status codes :   200 (OK) : Indicates that the request has succeeded./
                        204 (No Content): The server has fulfilled the request but does not need to return a response body./
                        306 (Unused) : It is a reserved status code and is not used anymore./
                        401 (Unauthorized) : Indicates that the request requires user authentication information./
                        404 (Not Found) : The server can not find the requested resource./
                        501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
- Request Sample : no request Body for this endpoint
- Response Sample : {
  "orders": [
    {
      "orderID": "123456",
      "customerID": "789",
      "items": ["item1", "item2"],
      "total": 100.50
    },
    {
      "orderID": "789012",
      "customerID": "456",
      "items": ["item3"],
      "total": 50.25
    }
  ]
} 
  
- GET /orders/{orderID} :
- Operation : Read order info
- Description : Get a specific order..
- HTTP status codes :   200 (OK) : Indicates that the request has succeeded./
204 (No Content): The server has fulfilled the request but does not need to return a response body./
306 (Unused) : It is a reserved status code and is not used anymore./
401 (Unauthorized) : Indicates that the request requires user authentication information./
404 (Not Found) : The server can not find the requested resource./
501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
  
- POST /orders :
- Operation : create
- Description : Create a new order.
- HTTP status codes :  201 (Created) : Indicates that the request has succeeded and a new order has been created as a result./
400 (Bad Request) : The request could not be understood by the server due to incorrect syntax./
403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
(503 Service Unavailable) : The server is not ready to handle the request./

- PUT /orders/{orderID}  :
- Operation : Update/Replace
- Description :Update the items in a specific order.
- HTTP status codes :  403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./

- DELETE /orders/{orderID}  :
- Operation : Delete
- Description :Cancel a specific order.
- HTTP status codes : 403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./

- PATCH /orders/{orderID}  :
- Operation : Partial Update/Modify
- Description :Modify details of a specific order.
- HTTP status codes :403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
206 (Partial Content): It is used when the Range header is sent from the client to request only part of the order./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./

  
- Customers:
- GET /customers :
- Operation : Read
- Description : Get a list of all customers.
- HTTP status codes :   200 (OK) : Indicates that the request has succeeded./
                        204 (No Content): The server has fulfilled the request but does not need to return a response body./
                        306 (Unused) : It is a reserved status code and is not used anymore./
                        401 (Unauthorized) : Indicates that the request requires user authentication information./
                        404 (Not Found) : The server can not find the requested resource./
                        501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
  
- GET /customers/{customerID} :
- Operation : Read customer info
- Description : Get a specific customer.
- HTTP status codes :   200 (OK) : Indicates that the request has succeeded./
204 (No Content): The server has fulfilled the request but does not need to return a response body./
306 (Unused) : It is a reserved status code and is not used anymore./
401 (Unauthorized) : Indicates that the request requires user authentication information./
404 (Not Found) : The server can not find the requested resource./
501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
  
- POST /customers :
- Operation : create
- Description : Create a new customer.
- HTTP status codes :  201 (Created) : Indicates that the request has succeeded and a new customer has been created as a result./
400 (Bad Request) : The request could not be understood by the server due to incorrect syntax./
403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
(503 Service Unavailable) : The server is not ready to handle the request./

- PUT /customers/{ customerID }  :
- Operation : Update/Replace
- Description :Update the items in a specific customer.
- HTTP status codes :  403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./

- DELETE /customers/{ customerID }  :
- Operation : Delete
- Description :Cancel a specific customer.
- HTTP status codes : 403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./

- PATCH /customers/{ customerID }  :
- Operation : Partial Update/Modify
- Description :Modify details of a specific customer.
- HTTP status codes :403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
206 (Partial Content): It is used when the Range header is sent from the client to request only part of the resourse./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./

- Companies:
- GET / companies :
- Operation : Read
- Description : Get a list of all company.
- HTTP status codes :   200 (OK) : Indicates that the request has succeeded./
                        204 (No Content): The server has fulfilled the request but does not need to return a response body./
                        306 (Unused) : It is a reserved status code and is not used anymore./
                        401 (Unauthorized) : Indicates that the request requires user authentication information./
                        404 (Not Found) : The server can not find the requested resource./
                        501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
  
- GET / companies/{ companyID} :
- Operation : Read company info
- Description : Get a specific company.
- HTTP status codes :   200 (OK) : Indicates that the request has succeeded./
204 (No Content): The server has fulfilled the request but does not need to return a response body./
306 (Unused) : It is a reserved status code and is not used anymore./
401 (Unauthorized) : Indicates that the request requires user authentication information./
404 (Not Found) : The server can not find the requested resource./
501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
  
- POST / companies :
- Operation : create
- Description : Create a new companies.
- HTTP status codes :  201 (Created) : Indicates that the request has succeeded and a new company has been created as a result./
400 (Bad Request) : The request could not be understood by the server due to incorrect syntax./
403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
(503 Service Unavailable) : The server is not ready to handle the request./

- PUT / companies/{ companyID }  :
- Operation : Update/Replace
- Description :Update the items in a specific company.
- HTTP status codes :  403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./

- DELETE / companies/{ companyID } :
- Operation : Delete
- Description :Cancel a specific company.
- HTTP status codes : 403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./

- PATCH / companies/{ companyID }  :
- Operation : Partial Update/Modify
- Description :Modify details of a specific company.
- HTTP status codes :403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
206 (Partial Content): It is used when the Range header is sent from the client to request only part of the resourse./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./

- Items:
- GET / items :
- Operation : Read
- Description : Get a list of all items.
- HTTP status codes :   200 (OK) : Indicates that the request has succeeded./
                        204 (No Content): The server has fulfilled the request but does not need to return a response body./
                        306 (Unused) : It is a reserved status code and is not used anymore./
                        401 (Unauthorized) : Indicates that the request requires user authentication information./
                        404 (Not Found) : The server can not find the requested resource./
                        501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
  
- GET / items/{ itemID} :
- Operation : Read item info
- Description : Get a specific item.
- HTTP status codes :   200 (OK) : Indicates that the request has succeeded./
204 (No Content): The server has fulfilled the request but does not need to return a response body./
306 (Unused) : It is a reserved status code and is not used anymore./
401 (Unauthorized) : Indicates that the request requires user authentication information./
404 (Not Found) : The server can not find the requested resource./
501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
  
- POST / items :
- Operation : create
- Description : Create a new item.
- HTTP status codes :  201 (Created) : Indicates that the request has succeeded and a new item has been created as a result./
400 (Bad Request) : The request could not be understood by the server due to incorrect syntax./
403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
(503 Service Unavailable) : The server is not ready to handle the request./

- PUT / items/{ itemID }  :
- Operation : Update/Replace
- Description :Update the items in a specific item.
- HTTP status codes :  403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./

- DELETE / items/{ itemID } :
- Operation : Delete
- Description :Cancel a specific item.
- HTTP status codes : 403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./

- PATCH / items/{ itemID }  :
- Operation : Partial Update/Modify
- Description :Modify details of a specific item.
- HTTP status codes :403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
206 (Partial Content): It is used when the Range header is sent from the client to request only part of the resourse./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./






 
    

