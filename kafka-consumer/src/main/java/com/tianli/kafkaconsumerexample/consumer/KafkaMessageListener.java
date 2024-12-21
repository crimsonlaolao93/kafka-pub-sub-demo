package com.tianli.kafkaconsumerexample.consumer;

import com.tianli.kafkacommon.model.PaymentInfo;
import com.tianli.kafkaconsumerexample.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = Constants.KAFKA_TOPIC, groupId = Constants.KAFKA_GROUP_ID)
    public void consume(PaymentInfo paymentInfo){
        logger.info("consumer is consuming the message {}", paymentInfo);
    }

}


