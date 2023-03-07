package Homework22;

public class Cat extends Pet {    
    protected Boolean balding;
    
    public Cat(Double growth, Double weight, String eyeColor, String nicknamePet, String breed, String vaccinations,
            String coatColor, String birthdate, Boolean balding) {
        super(growth, weight, eyeColor, nicknamePet, breed, vaccinations, coatColor, birthdate);
        this.balding = balding;
    }
    

    public void voice() {
        System.out.println("Мряяяу!");;
    }

    @Override
    public String toString() {
        if (balding){
            return "Кошка. " + super.toString() + ", без шерсти";
        } else {
            return "Кошка: " + super.toString() + ", с шерстью";
        }
    }
}
