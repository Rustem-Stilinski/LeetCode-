class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long result = 0;
        int average = skill[0] + skill[skill.length-1];
        if(skill.length==2){
            return skill[0]*skill[skill.length-1];
        }
        for(int i = 1;i<(skill.length+1)/2;i++){
            if(skill[i]+skill[skill.length-i-1]!=average){
                return -1;
            }else{
            result+=skill[i]*skill[skill.length-i-1];
            }
        }
        result+=skill[0]*skill[skill.length-1];

        return result;
    }
}
