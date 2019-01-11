'use strict';

const scheduleGood = [
    '1,2,23,24',
    '5,17,19,21'
]

const scheduleWrongCommon = [
    '1,8,3,24,',
    '1,4,6,11',
    '2,3,4,23,',
    '7,21 15 24',
    '3,22,20,19',
    '1,4,15,22,'
]

scheduleWrongCommon.map(el => {
    console.log(el);
    //console.log(e.match(/\d+(?=,)/g));
    // el.sort((x, y) => {
    //     console.log(`x : ${x}  , y : ${y}`);
    //     const arr = x < y ? -1 : x > y ? 1 : 0;
    // })
});