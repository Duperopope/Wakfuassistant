/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fjK
 */
public class fjk_0
extends fjz_0 {
    private static final Logger szG = Logger.getLogger(fjk_0.class);
    public static final fja_0 szH = new fjl_0();
    private long szI;
    private long szJ;
    private fkO szK;

    public fjk_0() {
        super(fjb_0.szi);
    }

    public void tZ(long l) {
        this.szI = l;
    }

    public void ua(long l) {
        this.szJ = l;
    }

    public void a(fkO fkO2) {
        this.szK = fkO2;
    }

    @Override
    public void bGy() {
        fjo_0 fjo_02 = this.gbW();
        if (fjo_02 == null) {
            szG.error((Object)("Impossible d'ex\u00e9cuter l'action " + String.valueOf(this) + " : la nation " + this.epQ + " n'existe pas"));
            return;
        }
        fjo_02.a(fkL.ue(this.szI), fkL.ue(this.szJ), this.szK);
    }

    @Override
    public boolean h(fjm fjm2) {
        fjo_0 fjo_02 = fjm2.ffF().ems();
        if (fjo_02.Xt() != this.epQ) {
            return false;
        }
        fkH fkH2 = fjo_02.gbB().uc(fjm2.Sn());
        if (fkH2 == null) {
            return false;
        }
        if (fkH2.emF().Sn() != this.szI) {
            return false;
        }
        return fkM.b(fkH2.emF(), fkL.ue(this.szI));
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.szI);
        byteBuffer.putLong(this.szJ);
        byteBuffer.put(this.szK.aJr());
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.szI = byteBuffer.getLong();
        this.szJ = byteBuffer.getLong();
        this.szK = fkO.gV(byteBuffer.get());
        return true;
    }

    @Override
    public int DN() {
        return 17;
    }

    @Override
    public void clear() {
        this.epQ = -1;
        this.szI = -1L;
        this.szJ = -1L;
    }
}

