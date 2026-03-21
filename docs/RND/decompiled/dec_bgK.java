Picked up JAVA_TOOL_OPTIONS: -javaagent:H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bgy
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

class bgK
implements TLongObjectProcedure<bgy> {
    final /* synthetic */ bgJ icV;

    bgK(bgJ bgJ2) {
        this.icV = bgJ2;
    }

    public boolean a(long l, bgy bgy2) {
        int n = bgy2.doV().cqy();
        bgJ.a(this.icV, n);
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (bgy)object);
    }
}

