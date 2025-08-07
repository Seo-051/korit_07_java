package ch14_abstraction.Interfaces;

public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                powerButton, channelDownButton, channelUpButton
//        );
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();

        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를
        // 생성하는 방법
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                new PowerButton(), new ChannelDownButton(), new ChannelUpButton()
//        );

        TvRemoteController tvRemoteController = new TvRemoteController(
                new VolumeDownButton(), new VolumeUpButton()
        );
//
//        tvRemoteController.onPressedPowerButton();
//        tvRemoteController.onPressedChannelDownButton();
//        tvRemoteController.onDownChannelDownButton();
//        System.out.println();
//        tvRemoteController.onPressedChannelUpButton();
//        tvRemoteController.onUpChannelUpButton(); // 풀이 #1

        // 풀이방법 #2 string 으로 (onUP과 onUpChannelUpButton으로 만듬) return 값을 main에서 출력

        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onUpVolumeUpButton();
        tvRemoteController.onPressedVolumeUpButton();



    }
}



/*
    VolumeDownButton / VolumeUpButton 클래스를 생성하고
    얘를 TvRemoteContorller의 필드에 추가하고
    onPressedVolumeDownButton() / onDownVolumeDownButton()
    onPressedVolumeUpButton() / onUpVolumeUpButton() 메서드를 정의하시고
    Main에서
    음량을 한칸 내립니다
    음량을 계속 내립니다.
    음량을 한칸 올립니다.
    음량을 계속 올립니다. # 1
    음량을 계속 올립니다. # 2

 */