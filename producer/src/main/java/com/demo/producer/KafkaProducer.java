package com.demo.producer;
//
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//@RequiredArgsConstructor
//public class KafkaProducer {
//
//    private final KafkaTemplate<String, RiderLocation> KafkaTemplate;
//
////    private final RiderLocation riderLocation;
//
////    Basic String message sending
////    @PostMapping("/send")
////    public String sendMessage(@RequestParam String message) {
////        KafkaTemplate.send("my-topic-new", message);
////        return "Message sent: " + message;
////    }
//
//    @PostMapping("/send")
//    public String sendMessage(@RequestParam String message) {
////        riderLocation.setRiderId("rider123");
////        riderLocation.setLatitude(28.61);
////        riderLocation.setLongitude(77.23);
//        RiderLocation location = new RiderLocation("rider123", 28.31, 75.23);
//        KafkaTemplate.send("my-topic-new", location);
//        return "Message sent: " + location.getRiderId();
//    }
//}
