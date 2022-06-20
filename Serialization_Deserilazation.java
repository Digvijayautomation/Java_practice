package Java_practice;
import java.io.*;
public class Serialization_Deserilazation implements  java.io.Serializable{

    // Java code for serialization and deserialization
      // of a Java object

        public int a;
        public String b;

        // Default constructor
        public Serialization_Deserilazation(int a, String b)
        {
            this.a = a;
            this.b = b;
        }

    }

    class Test
    {
        public static void main(String[] args)
        {
            // Constructor
            Serialization_Deserilazation object = new Serialization_Deserilazation(1, "geeksforgeeks");
            String filename = "file.ser";

            // Serialization
            try
            {
                //Saving of object in a file
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);

                // Method for serialization of object
                out.writeObject(object);
                out.close();
                file.close();

                System.out.println("Object has been serialized");

            }

            catch(IOException ex)
            {
                System.out.println("IOException is caught");
            }


            Serialization_Deserilazation object1 = null;

            // Deserialization
            try
            {
                // Reading the object from a file
                FileInputStream file = new FileInputStream(filename);
                ObjectInputStream in = new ObjectInputStream(file);

                // Method for deserialization of object
                object1 = (Serialization_Deserilazation)in.readObject();

                in.close();
                file.close();

                System.out.println("Object has been deserialized ");
                System.out.println("a = " + object1.a);
                System.out.println("b = " + object1.b);
            }

            catch(IOException ex)
            {
                System.out.println("IOException is caught");
            }

            catch(ClassNotFoundException ex)
            {
                System.out.println("ClassNotFoundException is caught");
            }

        }
    }

