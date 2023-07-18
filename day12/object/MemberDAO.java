package day12.object;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

    List<MemberDTO> member = new ArrayList<>();

    public void setMember(MemberDTO data){
        member.add(data);
    }
    public List<MemberDTO> getMember() {
        return member;
    }
    public boolean validID(String id,String pwd){
        for(MemberDTO data : member){
            if(data.getId().equals(id) && data.getPassword().equals(pwd)){
                return true;
            }
        }
        return false;
    }
    public  String getSHA256(String input){
        String toReturn = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.reset();
            digest.update(input.getBytes("utf8"));
            toReturn = String.format("%064x", new BigInteger(1, digest.digest()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return toReturn;
    }
}
