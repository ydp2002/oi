package practice;

public class GreekAlphabet2 {
    public static void main (String args[]) {
        int startPosition=1,endPosition=100;
        System.out.println("前100字符在unicode表中的位置：");
        for(int i=startPosition;i<=endPosition;i++) {
            char c='\0';
            c=(char)i;
            System.out.print(" "+c);
            if((i-startPosition+1)%10==0)
                System.out.println(" ");
        }
    }
}

