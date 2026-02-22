public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String pureString = s.replaceAll("[^a-z0-9]","");
        int len = pureString.length();
        pureString = pureString.toLowerCase();
        for(int i = 0; i < pureString.length(); i++) {
            if(pureString.charAt(i)!= pureString.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }

}
