class Solution {
    public boolean isAnagram(String s, String t) {
		
	if(s.length()!=t.length())return false;
	
	int n=s.length();
	int[] res=new int[26];
	
	for(int i=0;i<n;i++){
	
	int index= (s.charAt(i)-97);
	res[index]+=1;
	
	int index2=(t.charAt(i)-97);
	res[index2]-=1;
	}
	
	for(int k:res){
	if(k!=0)return false;
	}
	
	return true;
    }
}
