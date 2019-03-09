package pl.sda.patterns.observer2;

import java.util.Map;

@FunctionalInterface
interface IObserver {

    void notify(Map<ObserverParams, String> params);

}
