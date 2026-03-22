/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bMa
 */
public final class bma_1
implements ezp_0 {
    private static final Logger kvr = Logger.getLogger(bma_1.class);
    private ezn_0 kvs;

    public void a(ezn_0 ezn_02) {
        this.kvs = ezn_02;
    }

    @Override
    public void Id(int n) {
        try {
            bmb_1 bmb_12 = (bmb_1)this.kvs.Pm(n);
            if (bmb_12 != null) {
                bmb_12.eef();
            }
        }
        catch (Exception exception) {
            kvr.error((Object)"[SYMBIOT] on demande de modifier un index non valide", (Throwable)exception);
        }
        bma_1.eec();
    }

    @Override
    public void edV() {
        bma_1.eea();
        bmc_1.eeg().eeh();
    }

    @Override
    public void edW() {
        bma_1.eea();
    }

    @Override
    public void edX() {
        bma_1.eeb();
    }

    @Override
    public void dRK() {
        bma_1.eea();
        bma_1.eeb();
    }

    @Override
    public void edY() {
        this.edZ();
        bma_1.eec();
    }

    @Override
    public void cp(byte by) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16471);
        dae_02.ay(by);
        aaw_1.bUq().h(dae_02);
        bma_1.eeb();
    }

    private void edZ() {
        try {
            for (int n = 0; n < 10; n = (int)((byte)(n + 1))) {
                ezw ezw2 = this.kvs.Pm(n);
                if (ezw2 == null) continue;
                fse_1.gFu().a((aef_2)((Object)ezw2), bmb_1.kvE);
            }
        }
        catch (Exception exception) {
            kvr.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private static void eea() {
        bmc_1.eeg().eea();
    }

    private static void eeb() {
        bmc_1.eeg().eeb();
    }

    private static void eec() {
        fse_1.gFu().a((aef_2)bmc_1.eeg(), bmc_1.kvL);
    }
}

