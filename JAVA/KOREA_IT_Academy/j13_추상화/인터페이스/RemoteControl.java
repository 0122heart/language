package j13_추상화.인터페이스;

public class RemoteControl {
    // 이하의 부분은 RemoteControl의 필드로, REmoteControl 객체가 제어할 버튼을 정의한 것들
    private PowerButton powerButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;
    private ChannelUpButton channelUpButton;
    private ChannelDownButton channelDownButton;

    // 생성자
    public RemoteControl(PowerButton powerButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton,
                         ChannelUpButton channelUpButton, ChannelDownButton channelDownButton){
        this.powerButton = powerButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
        this.channelUpButton = channelUpButton;
        this.channelDownButton = channelDownButton;
    }

    public void onPressedPowerButton(){
        powerButton.onPressed();
    }

    public void onPressedVolumeUpButton(){
        volumeUpButton.onPressed();
    }

    public void onPressedVolumeDownButton(){
        volumeDownButton.onPressed();
    }

    public void onPressedChannelUpButton(){
        channelUpButton.onPressed();
    }

    public void onPressedChannelDownButton(){
        channelDownButton.onPressed();
    }

    public void onDownVolumeUpButton(){
        volumeUpButton.onDown();
    }

    public void onDownVolumeDownButton(){
        volumeDownButton.onDown();
    }

    public void onDownChannelUpButton(){
        channelUpButton.onDown();
    }

    public void onDownChannelDownButton(){
        channelDownButton.onDown();
    }




}
