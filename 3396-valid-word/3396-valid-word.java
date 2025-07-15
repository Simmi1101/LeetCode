class Solution {
    public boolean isMin(String word){
      return word.length()>=3;
    }
    public boolean charac(String word){
        for(char ch:word.toCharArray()){
            if(!Character.isLetterOrDigit(ch))
            return false;
        }
        return true;
    }
    public boolean isVowel(String word){
        for(char ch:word.toLowerCase().toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                return true;
            }
        }
        return false;
    }

    public boolean isConsonant(String word){
        for(char ch: word.toLowerCase().toCharArray()){
            if(Character.isLetter(ch)&& "aeiou".indexOf(ch)==-1){
                return true;
            }
        }
        return false;
    }
    public boolean isValid(String word) {
        return isMin(word) && charac(word) && isVowel(word)&& isConsonant(word);

    }
}