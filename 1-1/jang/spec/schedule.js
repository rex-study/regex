let scheduleSpec = require('../2주차/app/schedule');

console.log(scheduleSpec());
describe('스케줄', () => {
    it('스케줄!!', () => {
        scheduleSpec().forEach(e => {
            expect(e).toBe(true);
        });
    })
})