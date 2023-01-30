package observerpattern.subject;

import observerpattern.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);    //옵저버 등록
    void removeObserver(Observer observer);      //옵저버 제거
    void notifyObserver();      //주제 내용 변경 알림
}
