/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aqV
 */
public class aqv_1
implements ThreadFactory {
    private int cRI;

    @Override
    public Thread newThread(@NotNull Runnable runnable) {
        return new Thread(runnable, "AnmLoader #" + this.cRI++);
    }
}

