export default class PrimeFactors{
    public static generate(value:number): number[] {
        var primes: number[] = [];
        for(var candidate:number = 2; value > 1; candidate++) {
            for(;value % candidate === 0; value /= candidate) {
                primes.push(candidate);
            }
        }
        return primes;
    }
};