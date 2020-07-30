const path = require('path')

const express = require('express')
const bodyParser = require('body-parser')
const PORT = 3000

const app = express()


const adminRoutes = require('./routes/btc')

app.use(bodyParser.urlencoded({ extended: false }))

app.use('/api/v1', adminRoutes)


app.listen(PORT, () => {
    console.log('Service is running ' +  PORT)
})
