package crossing;

import uk.co.real_logic.agrona.DirectBuffer;

public interface LOBManager {

    String processOrder(DirectBuffer message);
    boolean isClientMarketDataRequest();
}
