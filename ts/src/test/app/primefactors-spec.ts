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

    describe('primeFactors of 3', () =>{
        it('should return array with 3', () => {
            expect(PrimeFactors.generate(3)).toEqual([3]);
        });
    });

    describe('primeFactors of 4', () =>{
        it('should return array with 2, 2', () => {
            expect(PrimeFactors.generate(4)).toEqual([2, 2]);
        });
    });

    describe('primeFactors of 6', () =>{
        it('should return array with 2, 3', () => {
            expect(PrimeFactors.generate(6)).toEqual([2, 3]);
        });
    });

    describe('primeFactors of 8', () =>{
        it('should return array with 2, 2, 2', () => {
            expect(PrimeFactors.generate(8)).toEqual([2, 2, 2]);
        });
    });

    describe('primeFactors of 9', () =>{
        it('should return array with 3, 3', () => {
            expect(PrimeFactors.generate(9)).toEqual([3, 3]);
        });
    });
});