package day12.dao;

import day11.dto.ProductDTO;
import day12.dto.MemberDTO;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
