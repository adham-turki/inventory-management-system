# inventory-management-system
- API Project :
- the 4 core resourses is : item, customer, order, company
- My project is about selling different items for the customers
- We have orders that contains the items that have been sold
- Every item made in a certain company
- We will design rest api to make the operation on the core resourses
- Every core resourse can be updated, add a new one from it and also delete it

Here is the ER Diagram for the database:
![image](https://github.com/adham-turki/inventory-management-system/assets/140730348/dae0448d-7704-4801-b87c-b831068ac547)

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
- Request Sample : no request Body
- Response Sample : {
  "orders": [
    {
      "orderID": "143",
      "customerID": "789",
      "items": ["item1", "item2"],
      "total": 120.50
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
- request Sample : no Request Body just send the id
- Response Sample : {
  "orderID": "112312",
  "customerID": "17",
  "items": ["item1", "item2"],
  "total": 150.00
}
  
- POST /orders :
- Operation : create
- Description : Create a new order.
- HTTP status codes :  201 (Created) : Indicates that the request has succeeded and a new order has been created as a result./
400 (Bad Request) : The request could not be understood by the server due to incorrect syntax./
403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
(503 Service Unavailable) : The server is not ready to handle the request./
- Request Sample : {
  "customerID": "42",
  "items": ["item1", "item2"],
  "total": 520.50  

}
- Response Sample : {
  "orderID": "2",
  "customerID": "42",
  "items": ["item1", "item2"],
  "total": 520.50
}



- PUT /orders/{orderID}  :
- Operation : Update/Replace
- Description :Update the items in a specific order.
- HTTP status codes :  403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./
- Request Sample:{
  "customerID": "42",
  "items": ["item1", "item3"],
  "total": 150.75
}
- Response Sample:{
  "orderID": "2",
  "customerID": "42",
  "items": ["item1", "item3"],
  "total": 150.75
}

- DELETE /orders/{orderID}  :
- Operation : Delete
- Description :Cancel a specific order.
- HTTP status codes : 403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./
- Request Sample : no request body just send the id
- Response Sample : {
  "id": 0,
  "customer_id": 0,
  "items": [
    {
      "id": 0,
      "name": "string",
      "quantity": 0
    }
  ]
}

- PATCH /orders/{orderID}  :
- Operation : Partial Update/Modify
- Description :Modify details of a specific order.
- HTTP status codes :403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
206 (Partial Content): It is used when the Range header is sent from the client to request only part of the order./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
- Request Sample : {
  "items": [
    {
      "id": 0,
      "name": "string",
      "quantity": 0
    }
  ]
}
- Response Sample : 
 {
  "id": 0,
  "customer_id": 0,
  "items": [
    {
      "id": 0,
      "name": "string",
      "quantity": 0
    }
  ]
}

  
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

- Request Sample : no request body
- Response Sample : [
  {
    "id": 1,
    "name": "adham turki",
    "email": "adham@gmail..com",
    "address": "123 irsal St"
  }
]
  
- GET /customers/{customerID} :
- Operation : Read customer info
- Description : Get a specific customer.
- HTTP status codes :   200 (OK) : Indicates that the request has succeeded./
204 (No Content): The server has fulfilled the request but does not need to return a response body./
306 (Unused) : It is a reserved status code and is not used anymore./
401 (Unauthorized) : Indicates that the request requires user authentication information./
404 (Not Found) : The server can not find the requested resource./
501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
- Request Sample : no request body  just send the id
- Response Sample : {
  "id": 1,
  "name": "adham turki",
  "email": "adham@gmail..com",
  "address": "123 irsal St"
}
  
- POST /customers :
- Operation : create
- Description : Create a new customer.
- HTTP status codes :  201 (Created) : Indicates that the request has succeeded and a new customer has been created as a result./
400 (Bad Request) : The request could not be understood by the server due to incorrect syntax./
403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
(503 Service Unavailable) : The server is not ready to handle the request./
- Request Sample : {
  "name": "adham turki",
  "email": "adham@gmail..com",
  "address": "123 irsal St"
}
- Response Sample : {
  "id": 1,
  "name": "adham turki",
  "email": "adham@gmail..com",
  "address": "123 irsal St"
}

- PUT /customers/{ customerID }  :
- Operation : Update/Replace
- Description :Update the items in a specific customer.
- HTTP status codes :  403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./
- Request Sample : {
  "id": 1,
  "name": "adham turki",
  "email": "adham@gmail..com",
  "address": "123 irsal St"
}
- Response Sample : {
  "id": 1,
  "name": "adham turki",
  "email": "adham@gmail..com",
  "address": "123 irsal St"
}

- DELETE /customers/{ customerID }  :
- Operation : Delete
- Description :Cancel a specific customer.
- HTTP status codes : 403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./
- Request Sample : no request body just send the id
- Response Sample : {
  "id": 1,
  "name": "adham turki",
  "email": "adham@gmail..com",
  "address": "123 irsal St"
}

- PATCH /customers/{ customerID }  :
- Operation : Partial Update/Modify
- Description :Modify details of a specific customer.
- HTTP status codes :403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
206 (Partial Content): It is used when the Range header is sent from the client to request only part of the resourse./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
- Request Sample : {
  "name": "adham turki",
  "email": "adham@gmail.com"
}
- Response Sample : {
  "id": 1,
  "name": "adham turki",
  "email": "adham@gmail..com",
  "address": "123 irsal St"
}

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
- Request Sample : no request body
- Response Sample : [
  {
    "id": 1,
    "name": "Assal",
    "address": "123 Ramallah St"
  }
]
  
- GET / companies/{ companyID} :
- Operation : Read company info
- Description : Get a specific company.
- HTTP status codes :   200 (OK) : Indicates that the request has succeeded./
204 (No Content): The server has fulfilled the request but does not need to return a response body./
306 (Unused) : It is a reserved status code and is not used anymore./
401 (Unauthorized) : Indicates that the request requires user authentication information./
404 (Not Found) : The server can not find the requested resource./
501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
- Request Sample : no request body just send the id
- Response Sample : {
  "id": 1,
  "name": "Assal",
  "address": "123 Ramallah St"
}
  
- POST / companies :
- Operation : create
- Description : Create a new companies.
- HTTP status codes :  201 (Created) : Indicates that the request has succeeded and a new company has been created as a result./
400 (Bad Request) : The request could not be understood by the server due to incorrect syntax./
403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
(503 Service Unavailable) : The server is not ready to handle the request./
- Request Sample : {
  "name": "Assal",
  "address": "123 ramallah St"
}
- Response Sample : {
  "id": 1,
  "name": "Assal",
  "address": "123 Ramallah St"
}

- PUT / companies/{ companyID }  :
- Operation : Update/Replace
- Description :Update the items in a specific company.
- HTTP status codes :  403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./
- Request Sample : {
  "id": 1,
  "name": "Assal",
  "address": "123 Ramallah St"
}
- Response Sample : {
  "id": 1,
  "name": "Assal",
  "address": "123 Ramallah St"
}

- DELETE / companies/{ companyID } :
- Operation : Delete
- Description :Cancel a specific company.
- HTTP status codes : 403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./
- Request Sample : no request body just send the id
- Response Sample : {
  "id": 1,
  "name": "Assal",
  "address": "123 Ramallah St"
}

- PATCH / companies/{ companyID }  :
- Operation : Partial Update/Modify
- Description :Modify details of a specific company.
- HTTP status codes :403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
206 (Partial Content): It is used when the Range header is sent from the client to request only part of the resourse./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
- Request Sample : {
  "name": "Example Corp",
  "address": "123 Main St"
}
- Response Sample : {
  "id": 1,
  "name": "Assal",
  "address": "123 Ramallah St"
}

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

- Request Sample : no request body
- Response Sample : [
  {
    "id": 1,
    "name": "cleaner",
    "description": "Description of cleaner 1",
    "price": 10.99
  }
]
  
- GET / items/{ itemID} :
- Operation : Read item info
- Description : Get a specific item.
- HTTP status codes :   200 (OK) : Indicates that the request has succeeded./
204 (No Content): The server has fulfilled the request but does not need to return a response body./
306 (Unused) : It is a reserved status code and is not used anymore./
401 (Unauthorized) : Indicates that the request requires user authentication information./
404 (Not Found) : The server can not find the requested resource./
501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
- Request Sample : no request body  just send the id
- Response Sample : {
  "id": 1,
  "name": "Item 1",
  "description": "Description of Item 1",
  "price": 126.00
}
  
- POST / items :
- Operation : create
- Description : Create a new item.
- HTTP status codes :  201 (Created) : Indicates that the request has succeeded and a new item has been created as a result./
400 (Bad Request) : The request could not be understood by the server due to incorrect syntax./
403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
501 (Not Implemented) : The HTTP method is not supported by the server and cannot be handled./
(503 Service Unavailable) : The server is not ready to handle the request./
- Request Sample : {
  "name": "cleaner",
  "description": "cleaning",
  "price": 15.99
}
- Response Sample : {
  "id": 1,
  "name": "Item 1",
  "description": "Description of Item 1",
  "price": 65.00
}

- PUT / items/{ itemID }  :
- Operation : Update/Replace
- Description :Update the items in a specific item.
- HTTP status codes :  403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./

- Request Sample : {
  "id": 1,
  "name": "Item 1",
  "description": "Description of Item 1",
  "price": 10.99
}
- Response Sample : {
  "id": 1,
  "name": "Item 1",
  "description": "Description of Item 1",
  "price": 10.99
}

- DELETE / items/{ itemID } :
- Operation : Delete
- Description :Cancel a specific item.
- HTTP status codes : 403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
204 (No Content) : The server has fulfilled the request but does not need to return a response body. The server may return the updated meta information./

- Request Sample : no request body just send the id
- Response Sample : {
  "id": 1,
  "name": "Item 1",
  "description": "Description of Item 1",
  "price": 990.00
}

- PATCH / items/{ itemID }  :
- Operation : Partial Update/Modify
- Description :Modify details of a specific item.
- HTTP status codes :403 (Forbidden) : Unauthorized request. The client does not have access rights to the content./
405 (Method Not Allowed) : The request HTTP method is known by the server but has been disabled and cannot be used for that resource./
(503 Service Unavailable) : The server is not ready to handle the request./
206 (Partial Content): It is used when the Range header is sent from the client to request only part of the resourse./
202 (Accepted) : Indicates that the request has been received but not completed yet. It is typically used in log running requests and batch processing./
200 (OK) : Indicates that the request has succeeded./
- Request Sample : {
  "name": "New Item Name",
  "description": "Updated description"
}
- Response Sample : {
  "id": 1,
  "name": "Item 1",
  "description": "Description of Item 1",
  "price": 60.00

}
- the APIs design using OpenAPI specification 3.1.0 :
- The swaggerhub link : https://app.swaggerhub.com/apis/ADHAMTURKI321/Inventory-Management-system/1.0.0#/




 
    

