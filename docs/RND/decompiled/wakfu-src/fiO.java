/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteIterator
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TByteIterator;
import gnu.trove.set.hash.TByteHashSet;
import org.apache.log4j.Logger;

public class fiO {
    protected static Logger oO = Logger.getLogger(fiO.class);
    public static final byte sta = 30;
    protected final TByteHashSet stb = new TByteHashSet();

    public boolean cJ(byte by) {
        this.stb.add(by);
        return true;
    }

    public void clear() {
        this.stb.clear();
    }

    public void a(qt_2 qt_22) {
        TByteIterator tByteIterator = this.stb.iterator();
        while (tByteIterator.hasNext()) {
            qv_2 qv_22 = new qv_2();
            qv_22.UN = tByteIterator.next();
            qt_22.UK.add(qv_22);
        }
    }

    public final void b(qt_2 qt_22) {
        for (int i = 0; i < qt_22.UK.size(); ++i) {
            this.cJ(qt_22.UK.get((int)i).UN);
        }
    }
}

