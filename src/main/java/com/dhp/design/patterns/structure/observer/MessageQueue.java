package com.dhp.design.patterns.structure.observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.springframework.util.CollectionUtils;

public class MessageQueue {
    protected HashMap<String, Set<Consumer>> consumersMap = new HashMap<>();

    public void subscribe(Consumer consumer){
        Set<Consumer> consumers = consumersMap.get(consumer.getTopic());
        if(Objects.isNull(consumers) || consumers.isEmpty()){
            consumers = new HashSet<>();
        }
        consumers.add(consumer);
        consumersMap.put(consumer.getTopic(),consumers);
    }

    public void unSubscribe(Consumer consumer){
        Set<Consumer> consumers = consumersMap.get(consumer.getTopic());
        if(Objects.nonNull(consumers) && !consumers.isEmpty()){
            consumers.remove(consumer);
            consumersMap.put(consumer.getTopic(),consumers);
        }
    }

    public void send(String topic,String message){
        Set<Consumer> consumers = consumersMap.get(topic);
        if(!CollectionUtils.isEmpty(consumersMap)){
            consumers.forEach(consumer -> consumer.onMessage(message));
        }
    }
}
