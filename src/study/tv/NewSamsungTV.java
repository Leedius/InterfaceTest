package tv;

public class NewSamsungTV implements TV{
    @Override
    public void powerOn() {
        System.out.println("삼성티비 - 전원을 킵니다.");
    }

    @Override
    public void powerOff() {
        System.out.println("삼성티비 - 전원을 끕니다.");
    }

    @Override
    public void volumeUp() {
        System.out.println("삼성티비 - 소리를 높입니다");
    }

    @Override
    public void volumeDown() {
        System.out.println("삼성티비 - 소리를 낮춥니다.");
    }
}
