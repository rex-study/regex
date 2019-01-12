let URLSpec = require('../2주차/app/url.js');

describe('URL', () => {
    it('올바른 URL', () => {
        URLSpec().forEach(e => {
            console.log(e);
            expect(e.regex).toBe(true);
        });
    });
});
