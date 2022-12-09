/* eslint-disable */
export default function typed3() {
  $(function () {
    let typed2 = new Typed("#typed1", {
      strings: ["질문", "문의", "특이사항은 여기로 ..."], // 타이핑 글자
      typeSpeed: 150, // 타이핑 속도(앞)
      backSpeed: 150, // 타이핑 속도(백)
      backDelay: 1000,
      startDelay: 1000,
      cursorChar: "_", // 타이핑 될때 깜박거리는 커서
      loop: true, // 반복
    });
  });
}
