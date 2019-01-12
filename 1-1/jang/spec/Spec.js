let addressSpec = require('../2주차/app/address');
let scheduleSpec = require('../2주차/app/schedule');
let URLSpec = require('../2주차/app/url');

describe('스케줄', () => {
    it('스케줄!!', () => {
        scheduleSpec().forEach(e => {
            expect(e).toBe(true);
        });
    })
})

describe('주소', () => {
    it('TESt', () => {
        addressSpec().forEach(e => {
            expect(e.regex).toBe(true);
        });
    })
})

describe('URL', () => {
    it('URL TEST', () => {
        URLSpec().forEach(e => {
            expect(e.regex).toBe(true);
        });
    });
});
