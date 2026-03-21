Picked up JAVA_TOOL_OPTIONS: -javaagent:H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nv
 *  azg
 */
public class cjE
extends Nv {
    private final int lWM;
    private final long lWN;
    private final boolean lWO;

    public cjE(int n, long l, boolean bl) {
        this.lWM = n;
        this.lWN = l;
        this.lWO = bl;
    }

    public byte[] aVX() {
        azg azg2 = new azg();
        azg2.vC(this.lWM);
        azg2.gK(this.lWN);
        azg2.aF((byte)(this.lWO ? 1 : 0));
        return this.a((byte)3, azg2.bTe());
    }

    public int d() {
        return 13210;
    }
}

