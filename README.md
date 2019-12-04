### MVP

 Model-View-Presenter 로 구성됩니다. 
 MVP가 나오게 된 이유는 View와 Model을 완전한 분리해서 사용하기 위해서 입니다. 
 MVP는 Model의 역할인 비즈니스 로직을 독립적으로 테스트할 수 있습니다. 
 - 모델(Model)
 앱의 두뇌(데이터 + 상태 + 비즈니스 로직) 역할입니다. 뷰나 컨트롤러에 묶이지 않으므로 많은 곳에서 재사용할 수 있습니다.
 - 뷰(View)
 유일한 변화는 액티비티/프래그먼트가 이제 뷰의 일부로 간주됩니다. 
 따라서 서로에게 연관되는 자연스러운 현상을 극복할 필요가 없습니다. 
 액티비티가 뷰 인터페이스를 구현해서 프리젠터가 코드를 만들 인터페이스를 갖도록 하는 것이 좋습니다. 
 이렇게 하면 특정 뷰와 결합되지 않고 가상 뷰를 구현해서 간단한 유닛 테스트를 실행할 수 있습니다.
 - 프리젠터(Presenter)
 본질적으로는 MVC의 컨트롤러와 같지만, 뷰에 연결되는 것이 아니라 그냥 인터페이스라는 점이 다릅니다. 
 이에 따라 MVC가 가진 테스트 가능성 문제와 함께 모듈화/유연성 문제 역시 해결합니다. 
 
 ### 기능
 + 간단한 로그인기능으로 구현했습니다.
    + DB없이 아이디와 비밀번호를 입력받아 아이디가 이메일 패턴이고 비밀번호가 6자리 이상이면 성공으로 표현했습니다.
