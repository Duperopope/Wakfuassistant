/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.NotNull;

class Vz
implements ThreadFactory {
    final /* synthetic */ String bIP;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    Vz(Vy vy, String string) {
        this.bIP = string;
    }

    @Override
    public Thread newThread(@NotNull Runnable runnable) {
        return new Thread(runnable, this.bIP);
    }
}

