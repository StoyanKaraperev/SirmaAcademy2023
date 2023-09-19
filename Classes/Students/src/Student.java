public class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student(String fistName, String lastName, int age, String homeTown){
            this.firstName = fistName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName(){
            return this.firstName;
        }

        public String getLastName(){
            return this.lastName;
        }

        public int getAge(){
            return this.age;
        }

        public String getHomeTown(){
            return this.homeTown;
        }

}
