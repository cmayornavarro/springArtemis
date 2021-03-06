package com.artemis.springArtemis;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ArtemisConsumer {

    @JmsListener(destination = "${jms.queue.destination}")
    public void receive(String msg) {
        System.out.println("Recieved Message: " + msg);
    }
}