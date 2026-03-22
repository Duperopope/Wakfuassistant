Picked up JAVA_TOOL_OPTIONS: -javaagent:H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bgT
 *  eyJ
 *  fh
 *  rr
 */
final class bhi
extends eyJ {
    private final rr ifW;
    final /* synthetic */ bgT ifX;

    bhi(bgT bgT2, rr rr2) {
        this.ifX = bgT2;
        this.ifW = rr2;
        this.ifW.DM().a((fh)this);
    }

    public void zl() {
        bgT.doh().error((Object)(((Object)((Object)this)).getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    public void zm() {
        this.ifX.ieS.YW(this.ifW.WK);
    }
}

