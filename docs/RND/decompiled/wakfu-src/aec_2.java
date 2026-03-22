/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimerTask;

/*
 * Renamed from aEc
 */
public class aec_2
extends TimerTask {
    private final aed_2 dEV;

    public aec_2(aed_2 aed_22) {
        this.dEV = aed_22;
    }

    @Override
    public void run() {
        this.dEV.run();
    }
}

