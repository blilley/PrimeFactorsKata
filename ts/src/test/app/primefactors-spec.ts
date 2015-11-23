///<reference path='jasmine.d.ts'/>
import PrimeFactors from '../../main/app/primefactors';
describe('Prime Factors', () => {
    describe('primeFactors of 1', () => {
        it('should return empty array', () => {
            expect(PrimeFactors.generate(1)).toEqual([]);
        });
    });

    describe('primeFactors of 2', () =>{
       it('should return array with 2', () => {
           expect(PrimeFactors.generate(2)).toEqual([2]);
       });
    });
});