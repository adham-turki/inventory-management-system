# inventory-management-system
- the 4 core resourses is : item, customer, order, company
- My project is about selling different items for the customers
- We have orders that contains the items that have been sold
- Every item made in a certain company
- we will design rest api to make the operation on the core resourses
- every core resourse can be updated, add a new one from it and also delete it

Here is the ER Diagram for the database:
![ER-Diagram](https://github.com/adham-turki/inventory-management-system/assets/140730348/98d6bc03-9671-475e-8125-a64f0ebe5c3f)


Items:
GET /api/items: Get a list of all Items.
GET /api/items/{itemID}: Get details of a specific item.
POST /api/items: Create a new item.
PUT /api/items/{itemID}: Update details of a specific item.
DELETE /api/items/{itemID}: Delete a specific item.

Orders:
GET /api/orders: Get a list of all orders.
GET /api/orders/{orderID}: Get details of a specific order.
POST /api/orders: Place a new order.
PUT /api/orders/{orderID}: Update details of a specific order.
DELETE /api/orders/{orderID}: Cancel a specific order.

Customers:
GET /api/customers: Get a list of all customers.
GET /api/customers/{customerID}: Get details of a specific customer.
POST /api/customers: Create a new customer.
PUT /api/customers/{customerID}: Update details of a specific customer.
DELETE /api/customers/{customerID}: Delete a specific customer.

companies:
GET /api/companies: Get a list of all companies.
GET /api/companies/{companiesID}: Get details of a specific company.
POST /api/companies: Create a new company.
PUT /api/companies/{companiesID}: Update details of a specific company.
DELETE /api/companies/{companiesID}: Delete a specific company.

Order Items:
GET /api/orders/{orderID}/items: Get a list of all items in a specific order.
GET /api/orders/{orderID}/items/{ItemID}: Get details of a specific item in an order.
POST /api/orders/{orderID}/items: Add a new item to an order.
PUT /api/orders/{orderID}/items/{ItemID}: Update details of a specific item in an order.
DELETE /api/orders/{orderID}/items/{ItemID}: Remove a specific item from an order.
