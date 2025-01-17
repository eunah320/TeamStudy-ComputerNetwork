**TCP와 UDP의 차이점은 무엇인가요?**

- TCP: 연결 지향적이며, 데이터 전송의 신뢰성을 보장합니다. 데이터가 순서대로 도착하고, 손실된 패킷을 재전송합니다.TCP는 신뢰성과 데이터 순서를 보장하지만, 오버헤드가 크고 속도가 느립니다.
- UDP: 비연결 지향적이며, 데이터 전송의 신뢰성을 보장하지 않습니다. 빠른 전송이 가능하지만, 패킷 손실이 발생할 수 있습니다.

**TCP의 3-way handshake 과정은 무엇인가요?**

- TCP의 3-way handshake는 연결을 설정하는 과정으로, 다음과 같은 단계로 이루어집니다:
    1. 클라이언트가 서버에 SYN 패킷을 전송합니다.
    2. 서버가 클라이언트에게 SYN-ACK 패킷을 응답합니다.
    3. 클라이언트가 서버에 ACK 패킷을 전송하여 연결이 완료됩니다. 

**TCP의 4-way handshake 과정은 무엇인가요?**

- TCP의 4-way handshake는 연결을 종료하는 과정으로, 다음과 같은 단계로 이루어집니다:
    1. 클라이언트가 서버에 FIN 패킷을 전송합니다.
    2. 서버가 클라이언트에게 ACK 패킷을 응답합니다.
    3. 서버가 클라이언트에게 FIN 패킷을 전송합니다.
    4. 클라이언트가 서버에 ACK 패킷을 전송하여 연결이 종료됩니다.

**TCP의 윈도우 크기란 무엇인가요?**

- TCP의 윈도우 크기는 한 번에 전송할 수 있는 데이터의 양을 나타내며, 흐름 제어를 통해 네트워크 혼잡을 방지합니다.

**UDP의 장점은 무엇인가요?**

- UDP는 빠른 데이터 전송이 가능하며, 오버헤드가 적어 실시간 애플리케이션(예: VoIP, 온라인 게임)에 적합합니다.

**슬라이딩 윈도우란 무엇인가요?**

- 슬라이딩 윈도우는 흐름 제어의 한 방법으로, 송신자가 수신자로부터 확인 응답을 기다리지 않고 여러 개의 패킷을 전송할 수 있도록 허용합니다. 윈도우 크기는 수신자의 버퍼 크기에 따라 조정됩니다.

**TCP의 흐름 제어란 무엇인가요?**

- 흐름 제어는 송신자가 수신자의 처리 능력에 맞춰 데이터 전송 속도를 조절하는 메커니즘입니다. 이를 통해 수신자가 버퍼 오버플로우를 방지할 수 있습니다.

**TCP의 혼잡 제어란 무엇인가요?**

- 혼잡 제어는 네트워크의 혼잡 상태를 감지하고, 데이터 전송 양을 조절하여 패킷 손실을 방지하는 기술입니다.
니다.

**TCP의 시퀀스 번호란 무엇인가요?**

- 시퀀스 번호는 TCP 세그먼트의 순서를 추적하는 데 사용되며, 데이터의 순서가 보장됩니다. [6]

**UDP의 체크섬 기능은 무엇인가요?**

- UDP 체크섬은 데이터 전송 중 오류를 검출하기 위한 기능으로, 데이터의 무결성을 확인합니다.
