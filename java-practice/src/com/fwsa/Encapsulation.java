package com.fwsa;

    class StudentDetails {
        private int phone_number;
        private String password;

        public int getPhone_number() {
            return phone_number;
        }

        public void setPhone_number(int phone_number) {
            this.phone_number = phone_number;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
     public class Encapsulation {
        public static void main(String[] args) {
            StudentDetails objName = new StudentDetails();
            objName.setPhone_number(9876543);
            objName.setPassword("Sangee");
            System.out.println(objName.getPhone_number() + " " + objName.getPassword());
        }

}
