package dependencyinjection.example2;


/**
 * This class serves as the general contract for all MessageInput
 * implementations. It is the abstraction that makes loose coupling (weak
 * dependencies) possible. When declaring delegate components with this 
 * abstraction you make it possible for dependencies to be injected into 
 * the host object at runtime, without concern for which implementation you 
 * have configured. And these implementations can be swapped out for other
 * variations at any time.
 * 
 * @author The ByteShop.Net
 */
public interface MessageInput {

    String getMessage();
    
}
