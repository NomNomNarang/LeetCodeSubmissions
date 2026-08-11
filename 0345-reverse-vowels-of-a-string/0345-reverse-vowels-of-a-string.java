class Solution {
    public String reverseVowels(String s) {
        //reverse vowels
        char[] arr= s.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end){
        if(!vowel(arr[start])) start++;
        else if(!vowel(arr[end])) end--;
        
        else {
               char temp=arr[end];
               arr[end]=arr[start];
               arr[start]=temp;
               start++;
               end--;
           }
        }
        return new String(arr);
    }
    static boolean vowel(char c){
        if((c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u') || (c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')) return true;
        
        return false;
    }
}