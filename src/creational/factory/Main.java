package creational.factory;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class Main {
    public static void main(String[] args) {
      DeveloperFactory developerFactory = createDeveloperBySpecialty("c++");
      Developer developer = developerFactory.createDeveloper();
      developer.writeCode();

    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty){
        if (specialty.equalsIgnoreCase("java")){
            return new JavaFactory();
        }else if (specialty.equalsIgnoreCase("php")){
            return new PhpFactory();
        }else if (specialty.equalsIgnoreCase("c++")){
            return new CppFactory();
        }else{
            throw new RuntimeException(specialty + " is unknown speciality.");
        }
    }

}
