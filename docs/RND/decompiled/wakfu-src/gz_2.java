/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Metric
 *  com.codahale.metrics.MetricSet
 *  com.codahale.metrics.jvm.JmxAttributeGauge
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import com.codahale.metrics.Metric;
import com.codahale.metrics.MetricSet;
import com.codahale.metrics.jvm.JmxAttributeGauge;
import java.lang.invoke.CallSite;
import java.lang.management.ManagementFactory;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from GZ
 */
public class gz_2
implements MetricSet {
    private static final Logger aHX = LoggerFactory.getLogger(gz_2.class);
    private static final String[] aHY = new String[]{"Count", "MemoryUsed", "TotalCapacity"};
    private static final String[] aHZ = new String[]{"count", "used", "capacity"};
    private static final String[] aIa = new String[]{"direct", "mapped"};
    private final MBeanServer aIb = ManagementFactory.getPlatformMBeanServer();

    public Map<String, Metric> getMetrics() {
        HashMap hashMap = new HashMap();
        for (String string : aIa) {
            for (int i = 0; i < aHY.length; ++i) {
                String string2 = aHY[i];
                String string3 = aHZ[i];
                try {
                    ObjectName objectName = new ObjectName("java.nio:type=BufferPool,name=" + string);
                    this.aIb.getMBeanInfo(objectName);
                    hashMap.put((CallSite)((Object)(string + "." + string3)), new ha_2("jvm.memory." + string + "." + string3, new JmxAttributeGauge((MBeanServerConnection)this.aIb, objectName, string2)));
                    continue;
                }
                catch (JMException jMException) {
                    aHX.debug("Unable to load buffer pool MBeans, possibly running on Java 6");
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}

