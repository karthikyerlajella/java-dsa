package FindDuplicate;

public class FindDuplicate{
    public static void FindDuplicate(String s){
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;i++){
            int count =1;
            if (chars[i] == '0') continue;
            for (int j=i+1;j<chars.length;j++){
                if (chars[i] == chars[j]){
                    count++;
                    chars[j] = '0';
                }
            }
            if (count > 1){
                System.out.println(chars[i] + "->" + count);
            }
        }
    }
    public static void main(String[] args){
        FindDuplicate("programming");
    }
}