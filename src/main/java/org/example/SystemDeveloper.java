package org.example;

import java.time.LocalDate;
import java.util.Arrays;

    public class SystemDeveloper extends Employee {
        private String[] certificates ;
        private String[] languages;

        public SystemDeveloper(int id, String name, double salary, String[] certificates, String[] languages) {
            super(id, name, salary);
            this.certificates = certificates;
            this.languages = languages;
        }

        public String[] getCertificates() {
            return certificates;
        }

        public void setCertificates(String[] certificates) {
            this.certificates = certificates;
        }

        public String[] getLanguages() {
            return languages;
        }

        public void setLanguages(String[] languages) {
            this.languages = languages;
        }

       @Override
        public void calculateSalary(){
            System.out.println("Acquire IT certifications");
        }





        @Override
        public String toString() {
            return "SystemDeveloper{" +
                    "certificates='" + certificates + '\'' +
                    ", languages='" + languages + '\'' +
                    '}';
        }
    }


