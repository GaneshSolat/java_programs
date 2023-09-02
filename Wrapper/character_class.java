public class character_class {
        public static void main(String[] args) {
            String s1="Hello Wor2ld123";
            char [] arr= s1.toCharArray();
            int noc=0, nos=0, nod=0;
            for(char c : arr){
                if (Character.isLowerCase(c)){
                    nos ++;
                } else if(Character.isUpperCase(c)){
                    noc ++;
                } else if(Character.isDigit(c)){
                    nod++;
                }
            }
            System.out.println("no of capital letters \n"+noc);
            System.out.println("no of small letters \n"+nos);
            System.out.println("no of digit \n"+nod);
        }
    
}
