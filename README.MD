Work in progress.

#Use Following curl instance;

curl -i -X POST http://localhost:8080/pieces \
-H "Content-Type: application/json" \
-d '{
"color": "Red",
"type": {
"name": "Brick 2x5",
"shape": "RECTANGULAR",
"length": 5,
"width": 2
}
}'