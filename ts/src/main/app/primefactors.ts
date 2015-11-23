export default class PrimeFactors{
    public static generate(value:number): any {
        var primes = [];
        if(value > 1){
            while(value % 2 === 0){
                primes.push(2);
                value /= 2;
            }
            if(value > 1){
                primes.push(value);
            }
        }
        return primes;
    }
};