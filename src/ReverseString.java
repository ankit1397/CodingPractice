public class ReverseString {
    static void reverseString(char[] s) {
        int len = s.length, mid=len/2, l=len, fwd=0;
        char temp='\0';
        while( l>mid ){
            if( fwd!=(l-1) ){
                temp=s[l-1];
                s[l-1]=s[fwd];
                s[fwd]=temp;
                System.out.println(s[l-1]);
                System.out.println(s[fwd]);
            }
            fwd++;
            l--;
        }


        for(char c : s){
            System.out.print(c);
            System.out.print(' ');
        }
    }

    // Driver code
    public static void main(String args[])
    {
        char[] a = { 'G', 'E', 'E', 'K', 'S', 'A'};
        reverseString(a);
    }
}
