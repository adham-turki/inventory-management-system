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

the APIs design using OpenAPI specification 3.1.0 :


openapi: 3.1.0
info:
  title: HTTP Requests API (Pet Store Style)
  description: API for managing orders, customers, companies, and items in a Pet Store style
  version: 1.0.0
tags:
  - name: Orders
    description: Endpoints for managing orders
  - name: Customers
    description: Endpoints for managing customers
  - name: Companies
    description: Endpoints for managing companies
  - name: Items
    description: Endpoints for managing items

paths:
  /orders:
    get:
      summary: Get a list of all orders
      operationId: getOrders
      tags:
        - Orders
      responses:
        '200':
          description: Successful operation
          content:
            application/json:
              schema:
                type: array
                items:
                  $ref: '#/components/schemas/Order'
        '204':
          description: No content
        '401':
          description: Unauthorized
        '404':
          description: Not found
        '501':
          description: Not implemented

    post:
      summary: Create a new order
      operationId: createOrder
      tags:
        - Orders
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/NewOrder'
      responses:
        '201':
          description: Created
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Order'
        '400':
          description: Bad request
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable

  /orders/{orderID}:
    get:
      summary: Get information about a specific order
      operationId: getOrderById
      tags:
        - Orders
      parameters:
        - name: orderID
          in: path
          description: ID of the order to retrieve
          required: true
          schema:
            type: integer
      responses:
        '200':
          description: Successful operation
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Order'
        '204':
          description: No content
        '401':
          description: Unauthorized
        '404':
          description: Not found
        '501':
          description: Not implemented

    put:
      summary: Update items in a specific order
      operationId: updateOrderById
      tags:
        - Orders
      parameters:
        - name: orderID
          in: path
          description: ID of the order to update
          required: true
          schema:
            type: integer
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Order'
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Order'
        '204':
          description: No content
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable

    delete:
      summary: Cancel a specific order
      operationId: deleteOrderById
      tags:
        - Orders
      parameters:
        - name: orderID
          in: path
          description: ID of the order to delete
          required: true
          schema:
            type: integer
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Order'
        '204':
          description: No content
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable

    patch:
      summary: Modify details of a specific order
      operationId: patchOrderById
      tags:
        - Orders
      parameters:
        - name: orderID
          in: path
          description: ID of the order to modify
          required: true
          schema:
            type: integer
      requestBody:
        required: true
        content:
          application/json:
            schema:
              type: object
              properties:
                items:
                  type: array
                  items:
                    $ref: '#/components/schemas/OrderItem'
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Order'
        '206':
          description: Partial content
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable

  /customers:
    get:
      summary: Get a list of all customers
      operationId: getCustomers
      tags:
        - Customers
      responses:
        '200':
          description: Successful operation
          content:
            application/json:
              schema:
                type: array
                items:
                  $ref: '#/components/schemas/Customer'
        '204':
          description: No content
        '401':
          description: Unauthorized
        '404':
          description: Not found
        '501':
          description: Not implemented

    post:
      summary: Create a new customer
      operationId: createCustomer
      tags:
        - Customers
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/NewCustomer'
      responses:
        '201':
          description: Created
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Customer'
        '400':
          description: Bad request
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable

  /customers/{customerID}:
    get:
      summary: Get information about a specific customer
      operationId: getCustomerById
      tags:
        - Customers
      parameters:
        - name: customerID
          in: path
          description: ID of the customer to retrieve
          required: true
          schema:
            type: integer
      responses:
        '200':
          description: Successful operation
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Customer'
        '204':
          description: No content
        '401':
          description: Unauthorized
        '404':
          description: Not found
        '501':
          description: Not implemented

    put:
      summary: Update information of a specific customer
      operationId: updateCustomerById
      tags:
        - Customers
      parameters:
        - name: customerID
          in: path
          description: ID of the customer to update
          required: true
          schema:
            type: integer
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Customer'
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Customer'
        '204':
          description: No content
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable

    delete:
      summary: Delete a specific customer
      operationId: deleteCustomerById
      tags:
        - Customers
      parameters:
        - name: customerID
          in: path
          description: ID of the customer to delete
          required: true
          schema:
            type: integer
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Customer'
        '204':
          description: No content
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable

    patch:
      summary: Modify details of a specific customer
      operationId: patchCustomerById
      tags:
        - Customers
      parameters:
        - name: customerID
          in: path
          description: ID of the customer to modify
          required: true
          schema:
            type: integer
      requestBody:
        required: true
        content:
          application/json:
            schema:
              type: object
              properties:
                name:
                  type: string
                email:
                  type: string
              example:
                name: adham turki
                email: adham@gmail.com
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Customer'
        '206':
          description: Partial content
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable

  /companies:
    get:
      summary: Get a list of all companies
      operationId: getCompanies
      tags:
        - Companies
      responses:
        '200':
          description: Successful operation
          content:
            application/json:
              schema:
                type: array
                items:
                  $ref: '#/components/schemas/Company'
        '204':
          description: No content
        '401':
          description: Unauthorized
        '404':
          description: Not found
        '501':
          description: Not implemented

    post:
      summary: Create a new company
      operationId: createCompany
      tags:
        - Companies
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/NewCompany'
      responses:
        '201':
          description: Created
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Company'
        '400':
          description: Bad request
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable

  /companies/{companyID}:
    get:
      summary: Get information about a specific company
      operationId: getCompanyById
      tags:
        - Companies
      parameters:
        - name: companyID
          in: path
          description: ID of the company to retrieve
          required: true
          schema:
            type: integer
      responses:
        '200':
          description: Successful operation
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Company'
        '204':
          description: No content
        '401':
          description: Unauthorized
        '404':
          description: Not found
        '501':
          description: Not implemented

    put:
      summary: Update information of a specific company
      operationId: updateCompanyById
      tags:
        - Companies
      parameters:
        - name: companyID
          in: path
          description: ID of the company to update
          required: true
          schema:
            type: integer
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Company'
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Company'
        '204':
          description: No content
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable

    delete:
      summary: Delete a specific company
      operationId: deleteCompanyById
      tags:
        - Companies
      parameters:
        - name: companyID
          in: path
          description: ID of the company to delete
          required: true
          schema:
            type: integer
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Company'
        '204':
          description: No content
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable

    patch:
      summary: Modify details of a specific company
      operationId: patchCompanyById
      tags:
        - Companies
      parameters:
        - name: companyID
          in: path
          description: ID of the company to modify
          required: true
          schema:
            type: integer
      requestBody:
        required: true
        content:
          application/json:
            schema:
              type: object
              properties:
                name:
                  type: string
                address:
                  type: string
              example:
                name: Example Corp
                address: 123 Main St
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Company'
        '206':
          description: Partial content
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable

  /items:
    get:
      summary: Get a list of all items
      operationId: getItems
      tags:
        - Items
      responses:
        '200':
          description: Successful operation
          content:
            application/json:
              schema:
                type: array
                items:
                  $ref: '#/components/schemas/Item'
        '204':
          description: No content
        '401':
          description: Unauthorized
        '404':
          description: Not found
        '501':
          description: Not implemented

    post:
      summary: Create a new item
      operationId: createItem
      tags:
        - Items
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/NewItem'
      responses:
        '201':
          description: Created
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Item'
        '400':
          description: Bad request
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable

  /items/{itemID}:
    get:
      summary: Get information about a specific item
      operationId: getItemById
      tags:
        - Items
      parameters:
        - name: itemID
          in: path
          description: ID of the item to retrieve
          required: true
          schema:
            type: integer
      responses:
        '200':
          description: Successful operation
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Item'
        '204':
          description: No content
        '401':
          description: Unauthorized
        '404':
          description: Not found
        '501':
          description: Not implemented

    put:
      summary: Update information of a specific item
      operationId: updateItemById
      tags:
        - Items
      parameters:
        - name: itemID
          in: path
          description: ID of the item to update
          required: true
          schema:
            type: integer
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Item'
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Item'
        '204':
          description: No content
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable

    delete:
      summary: Delete a specific item
      operationId: deleteItemById
      tags:
        - Items
      parameters:
        - name: itemID
          in: path
          description: ID of the item to delete
          required: true
          schema:
            type: integer
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Item'
        '204':
          description: No content
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable

    patch:
      summary: Modify details of a specific item
      operationId: patchItemById
      tags:
        - Items
      parameters:
        - name: itemID
          in: path
          description: ID of the item to modify
          required: true
          schema:
            type: integer
      requestBody:
        required: true
        content:
          application/json:
            schema:
              type: object
              properties:
                name:
                  type: string
                description:
                  type: string
              example:
                name: New Item Name
                description: Updated description
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Item'
        '206':
          description: Partial content
        '403':
          description: Forbidden
        '405':
          description: Method not allowed
        '503':
          description: Service unavailable
components:
  schemas:
    Order:
      type: object
      properties:
        id:
          type: integer
        customer_id:
          type: integer
        items:
          type: array
          items:
            $ref: '#/components/schemas/OrderItem'
      required:
        - id
        - customer_id
        - items
    OrderItem:
      type: object
      properties:
        id:
          type: integer
        name:
          type: string
        quantity:
          type: integer
      required:
        - id
        - name
        - quantity
    NewOrder:
      type: object
      properties:
        customer_id:
          type: integer
        items:
          type: array
          items:
            $ref: '#/components/schemas/NewOrderItem'
      required:
        - customer_id
        - items
    NewOrderItem:
      type: object
      properties:
        name:
          type: string
        quantity:
          type: integer
      required:
        - name
        - quantity
    Customer:
      type: object
      properties:
        id:
          type: integer
        name:
          type: string
        email:
          type: string
        address:
          type: string
      example:
        id: 1
        name: adham turki
        email: adham@gmail..com
        address: 123 irsal St

    NewCustomer:
      type: object
      properties:
        name:
          type: string
        email:
          type: string
        address:
          type: string
      required:
        - name
        - email
      example:
        name: adham turki
        email: adham@gmail..com
        address: 123 irsal St
    Company:
      type: object
      properties:
        id:
          type: integer
        name:
          type: string
        address:
          type: string
      example:
        id: 1
        name: Assal
        address: 123 Ramallah St

    NewCompany:
      type: object
      properties:
        name:
          type: string
        address:
          type: string
      required:
        - name
      example:
        name: Assal
        address: 123 ramallah St

    Item:
      type: object
      properties:
        id:
          type: integer
        name:
          type: string
        description:
          type: string
        price:
          type: number
      example:
        id: 1
        name: Item 1
        description: Description of Item 1
        price: 10.99

    NewItem:
      type: object
      properties:
        name:
          type: string
        description:
          type: string
        price:
          type: number
      required:
        - name
        - price
      example:
        name: New Item Name
        description: Description of New Item
        price: 15.99




 
    

