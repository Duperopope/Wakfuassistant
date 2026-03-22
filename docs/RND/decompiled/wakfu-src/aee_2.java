/*
 * Decompiled with CFR 0.152.
 */
import java.util.Timer;
import java.util.TimerTask;

/*
 * Renamed from aEe
 */
public class aee_2 {
    private final Timer dEW = new Timer();

    public void a(int n, aed_2 aed_22) {
        aec_2 aec_22 = new aec_2(aed_22);
        this.dEW.schedule((TimerTask)aec_22, n);
    }
}

