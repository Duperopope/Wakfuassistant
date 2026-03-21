Picked up JAVA_TOOL_OPTIONS: -javaagent:H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YY
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
        Yb yb = yY.boA();
        yY.a(yb.bTB, byteBuffer);
        return yb;
    }

    protected abstract void bop();

    protected final void a(YY yY) {
        this.bTK.put(yY.boN(), (Object)yY);
    }
}

