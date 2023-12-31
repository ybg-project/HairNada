// Kakao.init("286502551dc04dfa252e2363dc526b97"); //발급받은 키 중 javascript키를 사용해준다.
console.log(Kakao.isInitialized()); // sdk초기화여부판단
//카카오로그인
function kakaoLogin() {
  Kakao.Auth.login({
    success: function (response) {
      Kakao.API.request({
        url: "/v2/user/me",
        success: function (response) {
          console.log(response);
        },
        fail: function (error) {
          console.log(error);
        },
      });
    },
    fail: function (error) {
      console.log(error);
    },
  });
}
//카카오로그아웃
function kakaoLogout() {
  if (Kakao.Auth.getAccessToken()) {
    Kakao.API.request({
      url: "/v1/user/unlink",
      success: function (response) {
        console.log(response);
      },
      fail: function (error) {
        console.log(error);
      },
    });
    Kakao.Auth.setAccessToken(undefined);
  }
}
// Kakao login Api

// Naver login Api

var naverLogin = new naver.LoginWithNaverId({
  clientId: "WrhFKCThICjKmn55AsTp", //내 애플리케이션 정보에 cliendId를 입력해줍니다.
  callbackUrl: "http://127.0.0.1:5500/hairnada/html/login.html", // 내 애플리케이션 API설정의 Callback URL 을 입력해줍니다.
  isPopup: false,
  callbackHandle: true,
});

naverLogin.init();

window.addEventListener("load", function () {
  naverLogin.getLoginStatus(function (status) {
    if (status) {
      var email = naverLogin.user.getEmail(); // 필수로 설정할것을 받아와 아래처럼 조건문을 줍니다.

      console.log(naverLogin.user);

      if (email == undefined || email == null) {
        alert("이메일은 필수정보입니다. 정보제공을 동의해주세요.");
        naverLogin.reprompt();
        return;
      }
    } else {
      console.log("callback 처리에 실패하였습니다.");
    }
  });
});

var testPopUp;
function openPopUp() {
  testPopUp = window.open(
    "https://nid.naver.com/nidlogin.logout",
    "_blank",
    "toolbar=yes,scrollbars=yes,resizable=yes,width=1,height=1"
  );
}
function closePopUp() {
  testPopUp.close();
}

function naverLogout() {
  openPopUp();
  setTimeout(function () {
    closePopUp();
  }, 1000);
}


// 계정찾기
$('.find-btn').click(function(){
  alert("메일 전송이 완료되었습니다. 메일함을 확인해주세요!");
});