# 2020 KLab Project Idea!(team 6) : [IdealMood]

[기능 설명 및 발표 자료](https://github.com/HyezNee/KLab/blob/master/result.pdf)

### 프로젝트 주제 설명
> 감정 절제 도움 앱    
> 일상 속에서 스트레스를 받을 때 이를 감지하여 알려주고 솔루션 제공     
>     - 감정 상태 확인/ 감정 달력/ 감정 분석/ 감정 솔루션/ 감정 쓰레기통 서비스     
   
### 주요 클래스명 설명
> * **MainActivity**   
>     앱의 바탕이 되는 액티비티. TabLayout과 ViewPager2를 가지고 있다.   
>     탭의 항목은 총 3개가 있다. (솔루션, 감정, 감정 일기)
> * **SolutionFragment**   
>     솔루션 탭(첫 번째 탭)에 해당하는 Fragment. recyclerView를 가지고 있다.     
> * **MainFragment**   
>     감정 탭(두 번재 탭)에 해당하는 Fragment.   
>     가로로 swipe하면 화면이 전환되며 순서대로 현재 기분, 감정 기록 달력, 감정 통계 화면이 나타난다.   
> * **EmotionFragment**   
>     감정 탭의 첫 번째 페이지. 현재 기분이 표시된다.   
> * **CalendarFragment**   
>     감정 탭의 두 번째 페이지. 감정 달력이 표시된다.   
> * **StatisticsFragment**   
>     감정 탭의 두 번째 페이지. 감정 통계가 표시된다.
> * **EmoTrashFragment**
>     감정 쓰레기통 탭(세 번째 탭)에 해당하는 Fragment. EmoTrashEditFragment와
>     EmoTrashDeletedFragment로 가는 버튼이 있다.
> * **EmoTrashEditFragment**
>     감정 쓰레기통 작성/수정을 하는 Fragment.
> * **EmoTrashDeletedFragment**
>     감정 쓰레기통 삭제된 목록을 보여주는 Fragment. recyclrView를 가지고 있다.
> * **MyAdapter**   
>     솔루션 탭의 recyclerview를 연결하는 어댑터      
> * **MyStateAdapter**   
>     액티비티에서 viewPager와 각 fragment들(solution, main, 감쓰(만들 예정))을 연결하는 어댑터   
> * **MyStateAdapter2**   
>     MainFragment에서 viewPager와 각 fragment들(emotion, calendar, statistics)을 연결하는 어댑터   
> * **BaseCalendar**   
>     감정달력에서 실제 날짜로 달력 구성하는데 필요한 정보 포함.   
>     CalendarAdapter에서 쓰인다.
> * **CalendarAdapter**   
>     CalendarFragment의 달력을 구성하는 GridLayout RecyclerView의 어댑터.   
> * **DrawerThemeSetting**   
>     drawer에서 앱 테마 설정 항목 선택시 나오는 AppCompatDialogFragment이다.   
>     민트색, 코랄색, 하늘색, 회색 옵션을 가지고 있다.(색 바꾸기 변경 테마)   

### 주요 레이아웃 ID/변수명 설명
> * **contents**   
>     activity_main.xml의 viewPager2의 id   
> * **contents2**   
>     fragment_main.xml의 viewPager2의 id   
