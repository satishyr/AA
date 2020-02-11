 class StringDuplicates {

    public static void main(String[] args) {

        String s1 = new String("abbcccddaskkef");
        String s2 = new String("");
        
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) != s2.charAt(j)) {
                    s2 = s2 + s1.charAt(i);
                       
                }
            }
        }System.out.println(s2); 
         

    }

}