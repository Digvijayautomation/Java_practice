package Java_practice;

class this_and_super {

   String s="Parent Class";
}

class  Child extends this_and_super
        {
            String s="Child Class";



            public void method1()
            {
                System.out.println(s);
                System.out.println(this.s); // this used to call from child class
                System.out.println(super.s); // super used to call from parent class
            }
        }

        class digvijay
        {
            public static void main(String[] args) {
                Child c_obj=new Child();
                c_obj.method1();

            }
        }




