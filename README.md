Build the application. In this demo we are going to read JSON data from a file data.json
and use that data to populate an H2 database. 

##requirements -

Apache Maven 3.5.3

Java version: 1.8

##Build App -

mvn clean install -X - in debug mode

##To start the application(Spring boot application)

To start the application we need to run to services
`Run as spring boot application. Server runs on port 9009` - after this command wait for the server to up completely


##Create smsData, return created Object


`http://localhost:9009/api/services/smsData`

`Method: POST`

Request Payload
`
{
"city"	:"Neftegorsk",
"start_date"	:"04/13/2013",
"end_date":	"05/18/2013",
"price"	:"55.82",
"status":	"Seldom",
"color"	:"#fd4e19"
}
`

Response 
`{
  "id": 1001,
  "city": "Neftegorsk",
  "start_date": "04/13/2013",
  "end_date": "05/18/2013",
  "price": "55.82",
  "status": "Seldom",
  "color": "#fd4e19"
}`



##Get return list of data


`http://localhost:9009/api/services/list`

`Method: GET`


Response 
`
[
  {
    "id": 1,
    "city": "Neftegorsk",
    "start_date": "04/13/2013",
    "end_date": "05/18/2013",
    "price": "55.82",
    "status": "Seldom",
    "color": "#fd4e19"
  },
  {
    "id": 2,
    "city": "Lancai",
    "start_date": "05/19/2012",
    "end_date": "11/29/2014",
    "price": "22.49",
    "status": "Yearly",
    "color": "#ff5055"
  },
  ......................
  ]


`

##Update Object, return updated Object


`http://localhost:9009/api/services/smsData`

`Method: PUT`

Request Payload
`
{
  "id": 1001,
  "city": "Neftmmmmmmegorsk",
  "start_date": "04/13/2013",
  "end_date": "05/18/2013",
  "price": "55.82",
  "status": "Seldom",
  "color": "#fd4e19"
}
`

Response 
`
{
  "id": 1001,
  "city": "Neftmmmmmmegorsk",
  "start_date": "04/13/2013",
  "end_date": "05/18/2013",
  "price": "55.82",
  "status": "Seldom",
  "color": "#fd4e19"
}

`

##Delete Data

`http://localhost:9009/api/services/smsData`

`Method: Delete`

Request Payload
`
{
	"id"	:1,
"city"	:"Neftegorsk",
"start_date"	:"04/13/2013",
"end_date":	"05/18/2013",
"price"	:"55.82",
"status":	"Seldom",
"color"	:"#fd4e19"
}
`
