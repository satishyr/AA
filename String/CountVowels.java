class CountVowels{
 public static void main(String []args){
  String str="hi iam durgaprasad in bvrm ";
  int vowel=0;
  char ch;
  for(int i=0;i<str.length();i++){
  ch=str.charAt(i);;
  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
    vowel++;
}
} System.out.println("Vowels :" + vowel);
}
}