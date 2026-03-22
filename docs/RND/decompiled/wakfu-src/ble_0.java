/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ble
 */
public class ble_0
implements adi_1 {
    private static final Logger itb = Logger.getLogger(ble_0.class);
    public static final ble_0 itc = new ble_0();

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        itb.trace((Object)"Frame de Browsing ajout\u00e9e");
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        itb.trace((Object)"Frame de Browsing retir\u00e9e");
    }

    @Override
    public boolean b(aam_2 aam_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        switch (aam_22.d()) {
            case 12025: {
                cpo cpo2 = (cpo)aam_22;
                bkb_0 bkb_02 = bgt_02.dps();
                if (bkb_02.dsm() != 17) {
                    itb.warn((Object)"Reception d'un message de contenu de r\u00e9ceptacle ne dans un contexte ne correspondant pas");
                    return false;
                }
                ((bke_1)bkb_02).dW(cpo2.exk());
                itb.info((Object)"Contenu du r\u00e9ceptacle re\u00e7u");
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }
}

