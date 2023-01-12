var express = require('express');
var router = express.Router();
var detail = require('../detail.json')

router.get('/', function (req, res, next) {
  res.send(detail)
});

module.exports = router;