# inventory-management-system
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
