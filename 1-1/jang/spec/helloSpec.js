let fromData = require('../app/app');

describe('id인 경우,', () => {
    it('영문숫자 포함 10개 이상', () => {
        expect(fromData().id).toBe(true);
    });
});


describe('password인 경우,', () => {
    it('영어, 숫자, 특수문자를 포함 10개 이상', () => {
        expect(fromData().pass).toBe(true);
    });
});


describe('email인 경우,', () => {
    it('영어,숫자@영어,숫자.영어', () => {
        expect(fromData().email).toBe(true);
    });
})


describe('Phone인 경우,', () => {
    it('숫자(3)-숫자(3~4)-숫자(3~4)', () => {
        expect(fromData().phone).toBe(true);
    });
})