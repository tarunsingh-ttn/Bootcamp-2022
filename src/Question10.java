//Demonstrate the use of repeat, strip, isBlank, indent, transform, stripIndent, translateEscapes, formatted String methods.
public class Question10 {
    public static void main(String[] args) {
        String str="Hi i am a repeat String ";
        System.out.println(str.repeat(4));
        String stripString="  helll o     ";
        System.out.println(stripString.strip());
        String isBlankString=" ";
        System.out.println(isBlankString.isBlank());
        String indentString="Dummy text";
        System.out.println(indentString.indent(5));
        String transformString="hello world";
        System.out.println();
    }
}
