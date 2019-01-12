let URLSpec = require('../2주차/app/url.js');

console.log(URLSpec());
describe('URL', () => {
    it('URL TEST', () => {
        URLSpec().forEach(e => {
            expect(e.regex).toBe(true);
        });
    });
});
