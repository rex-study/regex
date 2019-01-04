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
        return /^[a-z]\w{9,}/g.test(id);
    }

    //password
    function regexPassword(pass) {
        return pass.match(/([0-9a-zA-Z]){10,}/g);
    }

    //email
    function regexEmail(email) {
        return /\D/g.test(email);
    }

    //phone
    function regexPhone(phone) {
        return /\D/g.test(phone);
    }

    return userInfo;
}