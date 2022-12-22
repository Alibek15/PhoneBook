package company;

import modules.PhoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



      /*1.4
        int a=5;
        int b=9;
        int sum = a+b;
        System.out.println(sum);*/
        /*
        1.5double x = 7.5;
        double a = 2*x;
        double b = 3*x;
        System.out.println(a);
        System.out.println(b);*/
        Scanner scanner = new Scanner(System.in);

        List<PhoneBook> studs = new ArrayList<PhoneBook>();



        Boolean cycle = true;

        while(cycle){
            System.out.println("""
                1) ADD STUDENT
                2) SEARCH STUDENT BY NAME
                3) DELETE STUDENT BY ID
                4) SHOW ALL STUDENTS
                5) QUIT
                """);
            System.out.println("Enter command: ");
            var num = scanner.nextInt();
            if(num == 1){
                System.out.println("Insert name: ");
                String name = scanner.next();

                System.out.println("Insert age: ");
                Integer age = scanner.nextInt();

                System.out.println("Insert phone-number: ");
                String phone = scanner.next();

                System.out.println("");

                studs.add(new PhoneBook(studs.size()+1,name,age, phone ));

            }
            else if(num == 4){
                for(PhoneBook st:studs){
                    System.out.println(st.toString());
                }
            }
            else if(num == 3){
                System.out.println("Enter ID: ");
                var studId = scanner.nextInt();
                for(PhoneBook st:studs){
                    if(st.getId().equals(studId+1)){
                        studs.remove(studId+1);
                    }
                }
            }
            else if(num == 2){
                System.out.println("Enter Students name");
                var studName = scanner.next();
                for(PhoneBook st : studs){
                    if(st.getName().equals(studName)){
                        System.out.println(st);
                    }
                }

            }
            else{
                break;
            }



        }




    }
}
/*
* 1.3
* int x = 16;
*int x,t;
* x=-2;
* double t=5.5;
* double f = 10*t;
* */