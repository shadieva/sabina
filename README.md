# project description
GET ALL
url/api/main

GET BY ID
url/api/main/{id}

POST
url/api/main/create
in body 
{
     "fullname": "Aibek Aibekov",
    
     "faculty": "IB-19",

     "gender": "male",
    
     "credits": 40,
}

PUT
url/api/main/update/{id}
in body
{
     "fullname": "Aibek Aibekov",
    
     "faculty": "IB-19",

     "gender": "male",
    
     "credits": 27,
}

DELETE
url/api/main/delete/{id}
