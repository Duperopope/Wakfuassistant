/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import java.util.Collections;
import java.util.List;
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from eTR
 */
public class etr_0
extends Sw {
    private ett_0 mer;
    protected long meu;
    private static final ObjectPool rqu = new ayv_2(new ets_0());

    public ett_0 exQ() {
        return this.mer;
    }

    public long exS() {
        if (this.boK != Sy.boQ) {
            throw new UnsupportedOperationException("Amount of cash can be retrieved for Cash Modification events only");
        }
        return this.meu;
    }

    public static etr_0 a(RZ rZ, ett_0 ett_02) {
        etr_0 etr_02;
        try {
            etr_02 = (etr_0)rqu.borrowObject();
            etr_02.bip = rqu;
        }
        catch (Exception exception) {
            boJ.error((Object)("Erreur lors d'un checkOut sur un message de type WakfuItemExchangerModifiedEvent : " + exception.getMessage()));
            etr_02 = new etr_0();
        }
        etr_02.b(rZ, ett_02);
        return etr_02;
    }

    public static etr_0 a(RZ rZ, Sy sy, long l, RT rT, short s, ett_0 ett_02) {
        etr_0 etr_02;
        try {
            etr_02 = (etr_0)rqu.borrowObject();
            etr_02.bip = rqu;
        }
        catch (Exception exception) {
            boJ.error((Object)("Erreur lors d'un checkOut sur un message de type ItemExchangerEndEvent : " + exception.getMessage()));
            etr_02 = new etr_0();
        }
        etr_02.b(rZ, sy, l, rT, s, ett_02);
        return etr_02;
    }

    public static etr_0 a(RZ rZ, Sy sy, long l, List<RT> list, ett_0 ett_02) {
        etr_0 etr_02;
        try {
            etr_02 = (etr_0)rqu.borrowObject();
            etr_02.bip = rqu;
        }
        catch (Exception exception) {
            boJ.error((Object)("Error in checkOut on ItemExchangerEndEvent type message : " + exception.getMessage()));
            etr_02 = new etr_0();
        }
        etr_02.b(rZ, sy, l, list, ett_02);
        return etr_02;
    }

    public static etr_0 a(RZ rZ, Sy sy, long l, long l2, ett_0 ett_02) {
        etr_0 etr_02;
        if (sy != Sy.boQ) {
            throw new UnsupportedOperationException("checkout with this parameters should only be use for a cash modification");
        }
        try {
            etr_02 = (etr_0)rqu.borrowObject();
            etr_02.bip = rqu;
        }
        catch (Exception exception) {
            boJ.error((Object)("Erreur lors d'un checkOut sur un message de type ItemExchangerEndEvent : " + exception.getMessage()));
            etr_02 = new etr_0();
        }
        etr_02.b(rZ, sy, l, l2, ett_02);
        return etr_02;
    }

    public static etr_0 a(RZ rZ, Sy sy, long l, long l2) {
        etr_0 etr_02;
        if (sy != Sy.boQ) {
            throw new UnsupportedOperationException("checkout with this parameters should only be use for a cash modification");
        }
        try {
            etr_02 = (etr_0)rqu.borrowObject();
            etr_02.bip = rqu;
        }
        catch (Exception exception) {
            boJ.error((Object)("Erreur lors d'un checkOut sur un message de type ItemExchangerEndEvent : " + exception.getMessage()));
            etr_02 = new etr_0();
        }
        etr_02.b(rZ, sy, l, l2, null);
        return etr_02;
    }

    private void b(RZ rZ, Sy sy, long l, RT rT, short s, ett_0 ett_02) {
        this.b(rZ, Sv.boG);
        this.boK = sy;
        this.aZj = l;
        this.boL = Collections.singletonList(rT);
        this.boM = s;
        this.mer = ett_02;
    }

    private void b(RZ rZ, Sy sy, long l, List<RT> list, ett_0 ett_02) {
        this.b(rZ, Sv.boG);
        this.boK = sy;
        this.aZj = l;
        this.boL = list;
        this.mer = ett_02;
    }

    private void b(RZ rZ, Sy sy, long l, long l2, ett_0 ett_02) {
        this.b(rZ, Sv.boG);
        this.boK = sy;
        this.aZj = l;
        this.meu = l2;
        this.mer = ett_02;
    }

    protected etr_0() {
        this.boA = null;
        this.boB = null;
        this.mer = null;
    }

    protected void b(RZ rZ, ett_0 ett_02) {
        this.b(rZ, Sv.boG);
        this.mer = ett_02;
    }

    @Override
    public void aZp() {
        if (this.bip != null) {
            this.bip.returnObject((Object)this);
            this.bip = null;
        } else {
            this.aVH();
        }
    }

    @Override
    public void aVI() {
        super.aVI();
        this.mer = null;
        this.meu = -1L;
        this.boL = null;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.mer = null;
        this.meu = -1L;
        this.boL = null;
    }
}

