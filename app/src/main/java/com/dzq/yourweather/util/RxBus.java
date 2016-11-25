package com.dzq.yourweather.util;

import rx.Observable;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

/**
 * Description:
 * Created by dzq on 2016/11/25.
 */

public class RxBus {

    //主题
    private final Subject<Object, Object> bus;

    // PublishSubject只会把在订阅发生的时间点之后来自原始Observable的数据发射给观察者
    private RxBus(){
        bus = new SerializedSubject<>(PublishSubject.create());
    }

    public static RxBus getDefault(){
        return RxBusHolder.sInstance;
    }

    private static class RxBusHolder {
        private static final RxBus sInstance = new RxBus();
    }

    public void post(Object obj){
        bus.onNext(obj);
    }

    // 根据传递的 eventType 类型返回特定类型(eventType)的 被观察者
    public <T> Observable<T> toObservable(Class<T> eventType) {
        return bus.ofType(eventType);
    }
}
