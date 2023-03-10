# todo_api
Simple todo API made in ktor (kotlin)

#### End-Points
| Method | End-Point | Description |
| --- | --- | --- |
| `GET` | `/todos` | List all *todos* |
| `GET` | `/todo/:id` |  Get specific *todo* |
| `POST` | `/addtodo` | Create a new *todo* |
| `DELETE` | `/removetodo/:id` | Delete existing *todo* |


## Json

### Get 
#### Request Body
`N/A`

#### Response Body

``` javascript
[
    {
        "id": "007",
        "todoName": "James Bond",
        "description": "Mission: goto internet and learn some ktor development. Tatakai!! Tatakai!!!!!"
    }
]

```
### Post
#### Request Body
``` javascript
{
"id":"003",
"todoName":"Itachi Uchiha",
"description":"You Foolish little brother. Mangekyo Sharingan, Kotor Kotlin Development "
}
```
#### Response Body (Text)
``` 
Todo added Successfully!..
```

### Delete
#### Request Body
`N/A`
#### Response Body (Text)
`N/A`


Haven't added database yet, stores todos on variable list but you can modify and update.

Thanks 👽.
