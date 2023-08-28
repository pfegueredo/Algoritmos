const { Client } = require('pg')
const client = new Client({
    user: 'postgres',
    host: '127.0.0.1',
    database: 'postgres',
    password: 'paulo83',
    port: 5432
})

client.connect(function(err) {
    if(err)
})
console.log(typeof(Client))

