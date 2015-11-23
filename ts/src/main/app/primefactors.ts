export default class PrimeFactors{
    public static generate(value:number): any {
        var primes = [];
        if(value > 1){
            primes.push(2);
        }
        return primes;
    }
};