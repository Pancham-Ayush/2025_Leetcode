public class defang_ip {

    public String defangIPaddr(String address) {
        String x="";
        for (int i=0;i<address.length();i++){
            if(address.charAt(i)=='.')
                x+="[.]";
            else
                x+=address.charAt(i);
        }
        return  x;
    }
}
