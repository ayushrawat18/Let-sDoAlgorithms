package Design.SelfExpiring;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SelfExpiringMap {
    Object key;
    Object value;
    int timeToLive;

    public SelfExpiringMap(Object key, Object value, int timeToLive) {
        this.key = key;
        this.value = value;
        this.timeToLive = timeToLive;
    }
}
