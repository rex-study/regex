'use strict';

let regex = /^(((1?[0-9]?)|(2[0-4]?))(?:,))*(([0-9])|(1[0-9]?|2[0-4]?))$/g;
let result = [];

const scheduleGood = [
    '1,24,23,2',
    '5,17,19,21',
    '7,21,15,16',
    '23,6,17,11',
]

const scheduleWrongCommon = [
    '1,22,24,3!',
    '11,12 ,24,19',
    '24,3,4,23,',
    '7,21 15 24',
    '3,22,20,233',
    '1,15,26,20',
    '11,',
    '8 '
]

scheduleWrongCommon.map(el => {
    result.push({
        'regex' : regex.test(el),
        'url' : el.match(regex)
    });
});
 
console.log(result);