package Day07;
public class TV{
    private int channel;
    private int volume;
    //멤버변수 channel과 맴버메서드의 매개변수 channel은 저장장소가 서로 다음.
    //멤버변수는 생성할때부터 heap메모리의 tv 인스턴스 안에 생성되는 것이고,
    //매개변수 channel은 stack 메모리에 생성된다.
    String brand;
    void powerOn(){}
    void powerOff(){}
    public TV getThis()
    {
        return this;
    }
    //변수에 값을 넣는 메서드인 경우 set을 앞에 붙힘. set이 붙어있는 메서드를 setter라고 부름
    public void setChannel(int channel){  
        //set이 붙은 메서드 대부분은 return 값이 없기때문에 타입은 void를 사용.
        if(channel > 0 ) {
            this.channel = channel;
            //this가 붙은 변수는 멤버필드 접근을 의미함.
            //this : 자기 참조 변수
        }
    }
    //클래스의 값을 출력하는 메서드인 경우 get을 앞에 붙힘. get이 붙어있는 메서드를 getter라고 부름
    public int getChannel()
    {
        return channel;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }
    public int getVolume()
    {
        return volume;
    }
}
