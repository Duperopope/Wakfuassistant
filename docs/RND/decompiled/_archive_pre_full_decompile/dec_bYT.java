Picked up JAVA_TOOL_OPTIONS: -javaagent:H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GC
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TShortArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TShortArrayList;

public abstract class bYT {
    private final TIntArrayList lBv = new TIntArrayList();
    private final TShortArrayList lBw = new TShortArrayList();
    private int lBx = -1;
    private short bol = 0;

    protected abstract void bop();

    protected final void JG(int n) {
        int n2 = this.lBv.indexOf(n);
        if (n2 == -1) {
            n2 = this.lBv.size();
            this.lBv.add(n);
            this.lBw.add((short)0);
        }
        this.lBw.setQuick(n2, (short)(this.lBw.getQuick(n2) + 1));
    }

    int epB() {
        return this.lBx;
    }

    short bfd() {
        return this.bol;
    }

    private void bot() {
        this.bol = 0;
        this.lBx = -1;
        int n = this.lBw.size();
        for (int i = 0; i < n; ++i) {
            short s = this.lBw.getQuick(i);
            if (s <= this.bol) continue;
            this.bol = s;
            this.lBx = this.lBv.getQuick(i);
        }
    }

    void epC() {
        int n;
        this.bol = 0;
        this.lBx = -1;
        int n2 = 0;
        int n3 = this.lBw.size();
        for (n = 0; n < n3; ++n) {
            n2 += this.lBw.getQuick(n);
        }
        n = GC.mR((int)n2);
        for (int i = 0; i < n3; ++i) {
            if ((n -= this.lBw.getQuick(i)) >= 0) continue;
            this.lBx = this.lBv.getQuick(i);
            this.bol = this.lBw.getQuick(i);
            return;
        }
    }
}

