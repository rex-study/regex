'use strict';

const correctURL = [
    'http://www.naver.co.kr.nry.ent.net',
    'https://www.google.com/profile!!!!',
    'http://www.3jang6.co.kr/userEdit',
    'http://www.wwww.net?',
    'http://www.1111.net?i3d=12312?product=fkafj230fkslkdf230fksdfj=='
]


correctURL.map(e => {
    console.log(e.match(/https?:\/\/www\.\w+\.(\w+\.?\w+)(\/\w*|(\?\w+=.{1,2047}=$)*)/gi));
})

