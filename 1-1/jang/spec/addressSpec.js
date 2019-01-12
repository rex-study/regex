let addressSpec = require('../2주차/app/address');

console.log(addressSpec());
describe('주소', () => {
    it('TESt', () => {
        addressSpec().forEach(e => {
            expect(e).toBe(true);
        });
    })
})