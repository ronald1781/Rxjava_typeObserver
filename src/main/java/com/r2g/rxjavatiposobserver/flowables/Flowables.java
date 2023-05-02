package com.r2g.rxjavatiposobserver.flowables;

import io.reactivex.Flowable;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class Flowables {
    public static void main(String[] args) {
        doSomeWork();
    }

    private static void doSomeWork(){

        Flowable<Integer> obserable=Flowable.just(1,2,3,5);
        Integer[] numbers={3,1,5,8};
        //Flowable.fromArray(numbers);
        obserable.reduce(50,(t1,t2)->t1 +t2).subscribe(getObserver());
    }
    private static SingleObserver<Integer> getObserver(){
        return  new SingleObserver<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println(" onSubscribe ");
            }

            @Override
            public void onSuccess(Integer value) {
                System.out.println(" onSuccess: value : "+value);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println(" on Error "+e.getMessage());
            }
        };
    }
}
