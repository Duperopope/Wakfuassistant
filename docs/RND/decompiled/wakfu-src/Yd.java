/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;

public abstract class Yd {
    private final TIntObjectHashMap<YY> bTK = new TIntObjectHashMap();

    protected Yd() {
        this.bop();
    }

    public final YY[] boo() {
        Object[] objectArray = new YY[this.bTK.size()];
        this.bTK.values(objectArray);
        return objectArray;
    }

    public final YY qN(int n) {
        return (YY)this.bTK.get(n);
    }

    public final Yb a(int n, ByteBuffer byteBuffer) {
        YY yY = this.qN(n);
        if (yY == null) {
            return null;
        }
        Object t = yY.boA();
        yY.a(((Yb)t).bTB, byteBuffer);
        return t;
    }

    protected abstract void bop();

    protected final void a(YY yY) {
        this.bTK.put(yY.boN(), (Object)yY);
    }
}

