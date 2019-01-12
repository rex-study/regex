'use strict';

module.exports = () => {
    let regex = /https?:\/\/www\.\w+\.([a-zA-Z]{2}\.)?[a-zA-Z]{2,3}(\/\w+)*((\?\w+\=\w{1,2047})*\=$)?/gi;
    let result = [];

    //올바른 URL
    const correctURL = [
        'http://www.naver.co.kr',
        'https://www.google.com/profile',
        'http://www.jang6.co.kr/userEdit2_3',
        'http://www.wwww.net/sub=',
        'http://www.wwww.net/sub/bus/apple?id=23f23ff23ff2=',
        'http://www.wwww.net/sub?use_2r=asdfasldkflaskdf=',
        'http://www.1111.net?id=jang?playerId=jgkj49jkslfks0328fjdkjsj=',
        'http://www.cyworld.com/profile?usrName=jang='
    ]

    //틀린 URL
    const incorrectURL = [
        'ws://www.naver.com',
        'http://www.google.com.net.kr.co.kr',
        'http:www.google.com',
        'http://wWW.@daum..net',
        'https://www.yahoo.coo.krr',
        'http://www.naver.com?id=',
        'http://www.333333.com?1.1.1.',
        'http://www.24323fsadfasdf.net?id=asdfasdf233244?product=fkafj230fkslkasdf30fksdfj=====',
        'http://www.11asdfasdfasdfas11.net?user=fsdf23f3?product=fkafj230fkslk+df230fksdfj='
    ]

    incorrectURL.map(x => {
        result.push({
            'regex' : regex.test(x),
            'url' : x.match(regex)
        });
    });

    return result;
}
