package com.r2g.rxjavatiposobserver.tipoObserver;

import io.reactivex.Maybe;

public class TyposObserverMaybe {
    public static void main(String[] args) {
        Integer[] numbers={3,1,5,8,2,1,7,9,6,4};
myObserverMaybe().filter(number ->(number >4))
        .subscribe(count ->System.out.println(count));
    }

    private static Maybe<Integer> myObserverMaybe(){
        Maybe myobsMaybe=Maybe.create(source->{
            for (Integer i=0;i<20; i++){
                source.onSuccess(i);
            }
        });
        return myobsMaybe;
    }

}
