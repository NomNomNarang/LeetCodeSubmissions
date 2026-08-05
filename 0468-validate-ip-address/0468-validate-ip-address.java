class Solution {
    public String validIPAddress(String queryIP) {
        String result="";
        //normal logic-IPV4
        if(queryIP.contains(".")){
             String[] parts = queryIP.split("\\.", -1);
               for(int i=0;i<parts.length;i++){
            if(parts.length!=4) return "Neither";
            if(parts.length==4){
                char[] arr = parts[i].toCharArray();
                for (char c : arr) { if (!Character.isDigit(c)) return "Neither";}
                if(parts[i].length()==0 || parts[i].length()>3) return "Neither";
                int num = Integer.parseInt(parts[i]);
                //ipv4 logic will be activated
                if(num<=255 && num>=0){
                     char[] res=parts[i].toCharArray();
                     for(int j=0;j<res.length;j++){
                         if(res.length>1 && res[0]=='0') return "Neither";
                        else result= "IPv4";
                     }
                } 
                 else return "Neither";
            }
            // else result="Neither";
        }
    }
      
        else if(queryIP.contains(":")){
            String[] parts1 = queryIP.split("\\:",-1);
        for(int i=0;i<parts1.length;i++){
             if (parts1[i].length() == 0 || parts1[i].length() > 4) return "Neither";
            if(parts1.length!=8) return "Neither";
            if(parts1.length==8){
                char[] res=parts1[i].toCharArray();
                for(int j=0;j<res.length;j++){
                    if(res.length>=1 && res.length<=4){
                    if((res[j]>='0' && res[j]<='9') || (res[j]>='A' && res[j]<='F') || (res[j]>='a' && res[j]<='f')){
                        result="IPv6";
                    }
                    else return "Neither";

                }
                else return "Neither";
                }
            }
            
        }
    }
    else return "Neither";
       return result;
    }
}