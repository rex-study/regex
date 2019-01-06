'use strict';
let dataImport = require('./userData');

module.exports = () => {

    // Class
    function JoinFormat () {}
    let userInfo = new JoinFormat();

    dataImport.dummy.forEach(e => {
        userInfo.id = regexId(e.id);
        userInfo.pass = regexPassword(e.pass);
        userInfo.email = regexEmail(e.email);
        userInfo.phone = regexPhone(e.phone);
    });

    //id
    function regexId(id) {
        return /^[a-z][0-9a-zA-Z]{9,}$/g.test(id);
    }

    //password
    function regexPassword(pass) {
        return /^[0-9a-zA-Z!@#$]{10,}$/g.test(pass);
    }

    //email
    function regexEmail(email) {
        return /^[0-9a-zA-Z]+@[0-9a-zA-Z]+\.[a-zA-Z]+$/g.test(email);
    }

    //phone
    function regexPhone(phone) {
        return /^\d{3}\-\d{3,4}\-\d{3,4}$/g.test(phone);
    }

    return userInfo;
}