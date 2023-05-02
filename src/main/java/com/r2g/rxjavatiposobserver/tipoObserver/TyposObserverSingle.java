package com.r2g.rxjavatiposobserver.tipoObserver;

import io.reactivex.Single;

public class TyposObserverSingle {
    public static void main(String[] args) {
        Integer[] numbers={3,1,5,8,2,1,7,9,6,4};
myObserverSingle().filter(number ->(number >4))
        .subscribe(count ->System.out.println(count));
    }

    private static Single<Integer> myObserverSingle(){
        Single<Integer> myobsSingle=Single.create(source->{
            for (Integer i=0;i<20; i++){
                source.onSuccess(12);
            }
        });
        return myobsSingle;
    }

}
