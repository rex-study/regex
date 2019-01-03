'use strict';

module.exports = () => {

    // Class
    function JoinFormat (id, password, email, phone) {
        this.id = id;
        this.pass = password;
        this.email = email;
        this.phone = phone;
    }

    let userInfo = new JoinFormat();

    userInfo.id = regexId('skjflkjfo424f24f$0si#$');
    userInfo.pass = regexPassword('123456788990!!!!');
    userInfo.email = regexEmail('jang1234@netmarble.net');
    userInfo.phone = regexPhone('010-1234-1245');


    //id
    function regexId(id) {
        return /\D/gi.test(id);
    }

    //password
    function regexPassword(pass) {
        return /\D/gi.test(pass);
    }

    //email
    function regexEmail(email) {
        return /\D/gi.test(email);
    }

    //phone
    function regexPhone(phone) {
        return /\D/gi.test(phone);
    }

    return userInfo;
}