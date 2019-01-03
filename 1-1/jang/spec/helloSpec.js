let fromData = require('../app/app');

describe('Test Case', () => {

    it('userID : 영문숫자 포함 10개 이상', () => {
        expect(fromData().id).toBe(true);
    });

    it('userPassword : 영어, 숫자, 특수문자를 포함 10개 이상', () => {
        expect(fromData().pass).toBe(true);
    });

    it('userEmail : 영어,숫자@영어,숫자.영어', () => {
        expect(fromData().email).toBe(true);
    });

    it('userPhone : 숫자(3)-숫자(3~4)-숫자(3~4)', () => {
        expect(fromData().phone).toBe(true);
    });

});