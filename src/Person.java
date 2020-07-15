public class Person {

    private String firstName;

    private String lastName;

    private int age;

    public String getFirstName (){
        return this.firstName;
    }

    public String getLastName (){
        return this.lastName;
    }

    public int getAge (){
        return this.age;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName.trim();
    }

    public void setLastName (String lastName){
        this.lastName = lastName.trim();
    }

    public void setAge (int age){
        if (age < 0 || age > 100)
            this.age = 0;
        else this.age = age;
    }

    public boolean isTeen (){
        return this.age < 20 && this.age > 12;
    }

    public String getFullName (){
        if (firstName.isEmpty() || lastName.isEmpty())
            return "";

            if (lastName.isEmpty())
                return firstName.trim();

            if (firstName.isEmpty())
                return lastName.trim();

         return firstName.trim() + " " + lastName.trim();

    }

}
