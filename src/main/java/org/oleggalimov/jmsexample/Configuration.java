package org.oleggalimov.jmsexample;

import org.springframework.jms.annotation.EnableJms;

@org.springframework.context.annotation.Configuration
@EnableJms
public class Configuration {
//    @Bean  ("ActiveMqFactory")
//    public ActiveMQConnectionFactory AMQFactory() {
//        var BROKER_URL = "tcp://localhost:61616";
//        var BROKER_USERNAME = "admin";
//        var BROKER_PASSWORD = "admin";
//        var connectionFactory = new ActiveMQConnectionFactory();
//        connectionFactory.setBrokerURL(BROKER_URL);
//        connectionFactory.setUserName(BROKER_USERNAME);
//        connectionFactory.setPassword(BROKER_PASSWORD);
//        return connectionFactory;
//    }
//
//    @Bean ("myFactory")
//    public JmsListenerContainerFactory<?> myFactory(
//            @Autowired  ActiveMQConnectionFactory connectionFactory,
//            DefaultJmsListenerContainerFactoryConfigurer configurer) {
//        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//        // This provides all boot's default to this factory, including the message converter
//        configurer.configure(factory, connectionFactory);
//        // You could still override some of Boot's default if necessary.
//        return factory;
//    }
}
