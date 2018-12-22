package kr.tjeit.listview_20181222_02.datas;

public class Members {
//    사용자가 갖는 고유정보

    private String name;
    private String address;

//    차후에 이런식으로 활용 연습
    private String profileInageUrl;

//    생성자를 이용해서 이름/ 주소/ url 한꺼번에 입력

    public Member(String name, String address, String profileInageUrl){
        this.name = name;
        this.address = address;
        this.profileInageUrl = profileInageUrl;
    }

//    각 변수의 값을 조회하거나 세팅하는 getter/ setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfileInageUrl() {
        return profileInageUrl;
    }

    public void setProfileInageUrl(String profileInageUrl) {
        this.profileInageUrl = profileInageUrl;
    }
}
