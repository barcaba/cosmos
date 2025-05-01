document.getElementById("btn-update").addEventListener("click", sendData);

// 함수 정의
function sendData() {
  const name = document.getElementById("name").value;
  const nationality = document.getElementById("nationality").value;
  const team = document.getElementById("team").value;

  //const name = input.value;

  // body에 들어갈 데이터 만들기
  const data = {
    name: name,
    nationality: nationality,
    team: team
  };

  // fetch로 POST 요청 보내기
  fetch('http://localhost:8080/api/save', {  // 실제 서버 주소로 변경!
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(data)
  })
  .then(response => {
    if (response.ok) {
      alert("성공했습니다!");
    } else {
      alert("실패했습니다!");
    }
  })
  .catch(error => {
    console.error("에러:", error);
    alert("요청 중 에러 발생!");
  });
}