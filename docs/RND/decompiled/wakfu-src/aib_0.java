/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.WakfuClient;

/*
 * Renamed from aIb
 */
public class aib_0
implements Runnable {
    final /* synthetic */ aie_0 dTd;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public aib_0(WakfuClient wakfuClient, aie_0 aie_02) {
        this.dTd = aie_02;
    }

    @Override
    public void run() {
        try {
            this.dTd.aPg();
        }
        catch (Throwable throwable) {
            WakfuClient.dSU.fatal((Object)"Erreur au lancement", throwable);
            System.exit(1);
        }
    }
}

