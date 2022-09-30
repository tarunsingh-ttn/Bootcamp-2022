/*
Q1) Write the following a functional interface and implement it using lambda:

    First number is greater than second number or not Parameter (int ,int ) Return boolean
    Increment the number by 1 and return incremented value Parameter (int) Return int
    Concatination of 2 string Parameter (String , String ) Return (String)
    Convert a string to uppercase and return . Parameter (String) Return (String)

 */


@FunctionalInterface
interface greaterNumberInterface{
    Boolean greaterNumber(int first,int second);
}

@FunctionalInterface
interface increaseNumberInterface{
    int increaseNumber(int num);
}

@FunctionalInterface
interface concatStringInterface{
    String concatString(String first , String second);
}

@FunctionalInterface
interface toUpperCaseInterface{
    String toUpperCaseInterface(String str);
}

public class Q1 {
    public static void main(String[] args) {
            greaterNumberInterface greaterNumberInterfaceReference=(int first, int second)-> {return first>second;};
            increaseNumberInterface increaseNumberInterfaceRef=(int num)->{return num++;};
            concatStringInterface concatStringInterfaceRef=(String first , String second)->{return first+second;};
            toUpperCaseInterface toUpperCaseInterfaceRef=(String str)->{return str.toUpperCase();};
        System.out.println(greaterNumberInterfaceReference.greaterNumber(5,4));
        System.out.println(increaseNumberInterfaceRef.increaseNumber(5));
        System.out.println(concatStringInterfaceRef.concatString("Hello","TTN"));
        System.out.println(toUpperCaseInterfaceRef.toUpperCaseInterface("hello world!!"));
    }

}
