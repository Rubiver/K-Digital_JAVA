package day12.object;

import java.io.Serializable;
import java.text.SimpleDateFormat;

public class MemberDTO implements Serializable {
    private static final long serialVersionUID = 6220806364798349685L;
    private String id;
    private String password;
    private String name;
    private long signup_date;

    public MemberDTO(String id, String password, String name, long signup_date) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.signup_date = signup_date;
    }

    public MemberDTO() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSignup_date(long signup_date) {
        this.signup_date = signup_date;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public long getSignup_date() {
        return signup_date;
    }
    public String getDate()
    {
        long currentTime = this.signup_date;
        SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");
        String result = sdf.format(currentTime);
        return result;
    }
}
