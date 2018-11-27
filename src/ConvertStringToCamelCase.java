import java.lang.StringBuilder;
class ConvertStringToCamelCase{

    static String toCamelCase(String s){

        char[] charArray = s.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if (charArray[i]== '-' ||charArray[i]=='_') {
                charArray[i+1] = Character.toUpperCase(charArray[i+1]);
            }
        }

        String camelCaseString = new String(charArray);
                String answer = camelCaseString.replaceAll("[-\\_]","");
        return answer;
    }

    public static void main(String[] args){
        System.out.println(toCamelCase("the-camel"));
    }
}
