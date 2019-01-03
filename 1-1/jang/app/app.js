'use strict';

module.exports = () => {

    // Class
    function JoinFormat () {}

    let userInfo = new JoinFormat();

    userInfo.id = regexId('abcdd_23efghijk424f24f$0si#$');
    userInfo.pass = regexPassword('vjadA56788990');
    userInfo.email = regexEmail('jang1234@netmarble.net');
    userInfo.phone = regexPhone('010-1234-1245');
    userInfo.schedule = regexSchedule('1,23,55,7,153,09');


    //id
    function regexId(id) {
        return /^[a-z]\w{9,}/g.test(id);
    }

    //password
    function regexPassword(pass) {
        return /[0-9a-zA-Z]{10,}/g.test(pass);
    }

    //email
    function regexEmail(email) {
        return /\D/g.test(email);
    }

    //phone
    function regexPhone(phone) {
        return /\D/g.test(phone);
    }

    //schedule
    function regexSchedule(schedule) {
        return schedule.match(/\d+(?=\,)|\d$/g);
    }

    return userInfo;
}