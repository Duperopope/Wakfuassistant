/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.debug.WorkerTestCommand;

public class aTZ
implements Runnable {
    private long gwj = System.currentTimeMillis();

    public aTZ(WorkerTestCommand workerTestCommand) {
    }

    @Override
    public void run() {
        long l = System.currentTimeMillis();
        System.err.println("Delta time : " + (l - this.gwj));
        if (l - this.gwj < 1000L) {
            boolean bl = false;
        }
        this.gwj = l;
    }
}

