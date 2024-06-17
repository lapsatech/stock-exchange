package stock.exchange.integration;

/**
 * The interface represents any possible type of consumers for the events
 * generated by the stock market runners.
 */
public interface NonblockingNonFailingDownstream<T> {

  /**
   * The method is being invoked by market runners.
   * 
   * There are two important considerations for the implementations of this
   * interface:
   * 
   * The implementation should be non-blocking
   * 
   * The implementation should not throw exceptions or errors
   * 
   * @param t the event object
   */
  void accept(T t);

}
