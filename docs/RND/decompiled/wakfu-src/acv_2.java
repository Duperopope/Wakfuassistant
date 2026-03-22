/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aCV
 */
class acv_2
implements ThreadFactory {
    private final String dCx;
    private final int dCy;
    private int dCz;

    acv_2(String string, int n) {
        this.dCx = string;
        this.dCy = n;
    }

    @Override
    public Thread newThread(@NotNull Runnable runnable) {
        return new Thread(runnable, "Net-Proto" + this.dCx + ":" + this.dCy + ">" + this.dCz++);
    }

    public String toString() {
        return "GroupThreadFactory{m_host='" + this.dCx + "', m_port=" + this.dCy + ", m_cpt=" + this.dCz + "}";
    }
}

