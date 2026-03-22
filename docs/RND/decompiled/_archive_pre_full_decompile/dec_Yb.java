Picked up JAVA_TOOL_OPTIONS: -javaagent:H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YY
 *  Yc
 *  Yg
 *  Yh
 */
public abstract class Yb<M extends YY> {
    protected final Yh[] bTA;
    protected final Yh[] bTB;
    protected Yg[] bTC;
    protected final M bTD;

    protected Yb(M m) {
        this.bTD = m;
        this.bTA = m.boQ();
        this.bTB = m.boP();
    }

    public final Yh qL(int n) {
        return this.bTB[n];
    }

    public final Yh qM(int n) {
        return this.bTA[n];
    }

    public final int bok() {
        return this.bTD.boN();
    }

    public final Yc bol() {
        return this.bTD.bol();
    }

    public int bom() {
        return this.bTD.boO();
    }

    public void a(Yg[] ygArray) {
        assert (ygArray.length == this.bom());
        this.bTC = ygArray;
    }

    public abstract void qF(int var1);
}

