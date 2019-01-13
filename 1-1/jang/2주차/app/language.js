'use strict';

let regex = /[ㄱ-ㅎㄱ-힣]+[^ㅏ-ㅣ]+/gi;

const lang = [
    '안녕하세요',
    '44df@#f',
    'ㅏㅏㅏㅏㅏㅏ',
    'ㅠㅠㅠㅠㅠㅠㅠㅠ',
    '!!!!!!!',
    'jsh365656',
    '하ㅏ이'
]

lang.map(e => {
    console.log(e.match(regex));
});