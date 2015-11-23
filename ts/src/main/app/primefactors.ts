export default class PrimeFactors{
    public static generate(value:number): number[] {
        var primes: number[] = [];
        var candidate : number = 2;
        while(value > 1) {
            while(value % candidate === 0){
                primes.push(candidate);
                value /= candidate;
            }
            candidate++;
        }
        return primes;
    }
};