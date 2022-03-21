package March_18;

import java.util.Arrays;

public class Comparison {
    public static void main(String[] args) {

        Friend[] friends = new Friend[5];
        friends[0] = new Friend("Sidorov", "Ivan", "1", "12/04/05");
        friends[1] = new Friend("Sidorov", "Petr", "5", "23/09/04");
        friends[2] = new Friend("Sergeev", "Olga", "3", "14/08/06");
        friends[3] = new Friend("Gukov","Ilya", "2", "05/07/05");
        friends[4] = new Friend("Ivanov", "Alex", "9", "17/11/08");

        Arrays.sort(friends);
        System.out.println(Arrays.toString(friends));
    }
}

class Friend implements Comparable<Friend> {
        public String lastName;
        public String firstName;
        public String phoneNumber;
        public String birthDate;

        public Friend(String lastName, String firstName, String phoneNumber, String birthDate) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.phoneNumber = phoneNumber;
            this.birthDate = birthDate;
        }

        @Override
        public String toString(){
            System.out.println("Last Name - '" + lastName + '\'' + ", First Name - '" + firstName + '\'' + ", Phone Number - '" + phoneNumber + '\'' + ", Birth Date - " + birthDate);
            return "call";
        }

        @Override
        public int compareTo(Friend o){
            if(!this.lastName.equals(o.lastName)) {
                return this.lastName.compareTo(o.lastName);
            } else {
                return this.firstName.compareTo(o.firstName);
        }
    }
}