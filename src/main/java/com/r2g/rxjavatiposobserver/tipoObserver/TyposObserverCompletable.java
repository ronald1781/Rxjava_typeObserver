package com.r2g.rxjavatiposobserver.tipoObserver;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;

public class TyposObserverCompletable {
    public static void main(String[] args) {
Completable completable=myObserverCompletable();
completable.subscribe(new CompletableObserver() {
    @Override
    public void onSubscribe(Disposable d) {
        System.out.println(" onSubscribe "+d);
    }

    @Override
    public void onComplete() {
        System.out.println("Operation Complete");
    }

    @Override
    public void onError(Throwable e) {
        System.out.println("onError "+e.getMessage());
    }
});

    }
    private static Completable myObserverCompletable(){
        return Completable.fromAction(deleteItemFromDBAction());
    }
private static Action deleteItemFromDBAction(){
        return new Action() {
            @Override
            public void run() throws Exception {
                System.out.println("Deleting item from DB");
            }
        };
}

}
