/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.LinkedList;
import java.util.Queue;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eIM
 */
public class eim_0 {
    private static final Logger qxw = Logger.getLogger(eim_0.class);
    public static final eim_0 qxx = new eim_0();
    final TLongObjectHashMap<Queue<eil_0>> qxy = new TLongObjectHashMap();

    private eim_0() {
    }

    public void a(long l, @NotNull eil_0 eil_02) {
        LinkedList<eil_0> linkedList = (LinkedList<eil_0>)this.qxy.get(l);
        if (linkedList == null) {
            linkedList = new LinkedList<eil_0>();
            this.qxy.put(l, linkedList);
        }
        linkedList.offer(eil_02);
    }

    public void pI(long l) {
        Queue queue = (Queue)this.qxy.remove(l);
        if (queue == null) {
            return;
        }
        while (!queue.isEmpty()) {
            ((eil_0)queue.poll()).euv();
        }
    }
}

