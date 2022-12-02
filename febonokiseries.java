public class febonokiseries {
    public static void main ( String args [])
    {
        int n1=0, n2=1, n3,count =5;
        System.out.println(n1+""+ n2);
        for (int i=2;i<count;++i)
        {
            System.out.println ( n3=n1+n2);
            n1=n2;
            n2=n3;
        }
    }
    
}
