public class Person {
    private String firstName;
    private String lastName;
    private int meetings;

    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        meetings = 0;
    }

    public int getMeetings () {
        return meetings;
    }
    public void setMeetings (int newvalue) {
        meetings = newvalue;
    }
    public String getFirstName () {
        return firstName;
    }
    public void meet (Person otherPerson) {
        System.out.println("Hello, my name is " + firstName);
        System.out.println("Hi, my name is " + otherPerson.getFirstName());
        meetings+= 1;
        otherPerson.setMeetings(otherPerson.getMeetings()+1);
    }
}
