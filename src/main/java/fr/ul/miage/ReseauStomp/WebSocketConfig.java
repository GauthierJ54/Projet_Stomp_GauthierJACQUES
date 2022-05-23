package fr.ul.miage.ReseauStomp;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;


@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
public void configureMessageBroker(MessageBrokerRegistry config) {
//topic Pour diffuser ,user Pour réaliser point à point
config.enableSimpleBroker("/topic", "/user");
}


public void registerStompEndpoints(StompEndpointRegistry registry) {
// Inscrivez - vous pour deux STOMPDeendpoint, Pour la diffusion et point à point
//Diffusion
registry.addEndpoint("/publicServer").withSockJS();
//Point à point
registry.addEndpoint("/privateServer").withSockJS();
}
}
