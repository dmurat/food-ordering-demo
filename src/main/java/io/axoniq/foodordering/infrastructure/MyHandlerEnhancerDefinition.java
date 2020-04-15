package io.axoniq.foodordering.infrastructure;

import org.axonframework.messaging.annotation.HandlerEnhancerDefinition;
import org.axonframework.messaging.annotation.MessageHandlingMember;

public class MyHandlerEnhancerDefinition implements HandlerEnhancerDefinition {
  public MyHandlerEnhancerDefinition() {
    System.out.println("----- MyHandlerEnhancerDefinition constructor");
  }

  @Override
  public <T> MessageHandlingMember<T> wrapHandler(MessageHandlingMember<T> original) {
    System.out.println("----- MyHandlerEnhancerDefinition wrapHandler");
    return original;
  }
}
