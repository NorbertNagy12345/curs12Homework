package Exercise1;

public class BirthYearCalculator {
    public  int  birthYearCalculator(int age) throws InvalidAgeException {
        if(age < 0 || age > 123){
            throw new InvalidAgeException("Invalid age "+ age +". Please provide valid age.");
        }
        int yearNow = java.time.LocalDate.now().getYear();
        return yearNow -age;
    }
}