'use strict';

let regex = /^[ㄱ-ㅎㄱ-힣^ㅏ-ㅣ]+[^ㅏ-ㅣ]+$/gi;

const lang = [
    '안녕하세요',
    '44df@#f',
    'ㅏㅏㅏㅏㅏㅏ',
    'ㅠㅠㅠㅠㅠㅠㅠㅠ',
    '!!!!!!!',
    'jsh365656',
    '하이',
    'ㅜㅜㅜㅜㅜ안녕',
    '안녕ㅠㅠㅠㅠㅠ',
    '?하이',
    '하이?'
]

lang.map(e => {
    console.log(e.match(regex));
});

