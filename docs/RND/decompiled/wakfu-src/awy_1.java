/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.map.hash.TShortObjectHashMap;

/*
 * Renamed from awy
 */
public class awy_1
implements awh_2 {
    private short dlX;
    private short did;
    private short dlY;
    private short dlZ;
    private short die;
    private short dig = 0;
    private short dih = 0;
    private String p;
    private awk_1 bXx;
    private TShortObjectHashMap<awz_1> dma;

    @Override
    public awh_2 c(int n, float f2, boolean bl) {
        String string = awk_2.gA(this.p);
        return awk_2.f(string, n, (int)f2);
    }

    @Override
    public float bNe() {
        return awk_2.gz(this.p);
    }

    @Override
    public int bNf() {
        return awk_2.gy(this.p);
    }

    public void x(String string, String string2) {
        this.p = string;
        apl_1 apl_12 = apl_1.dw(fo_0.by(string2 + string + ".tab"));
        boolean bl = string.contains("bordered");
        apl_12.tw(10);
        if (bl) {
            this.dlX = (short)2;
        }
        int n = apl_12.aIz();
        this.did = apl_12.aIz();
        this.dlY = apl_12.aIz();
        this.dlZ = apl_12.aIz();
        this.die = (short)(apl_12.aIz() + this.dlX);
        this.dma = new TShortObjectHashMap(n);
        for (int i = 0; i < n; ++i) {
            awz_1 awz_12 = new awz_1();
            awz_12.dmb = apl_12.aIz();
            apl_12.aIz();
            awz_12.ccg = (short)(apl_12.aIz() - this.dlX);
            awz_12.cch = (short)(apl_12.aIz() - this.dlX);
            awz_12.aAv = (short)(apl_12.aIz() + 2 * this.dlX);
            awz_12.aAw = (short)(apl_12.aIz() + 2 * this.dlX);
            awz_12.dmc = apl_12.aIz();
            awz_12.dmd = apl_12.aIz();
            this.dma.put(awz_12.dmb, (Object)awz_12);
            if (awz_12.aAv > this.dig) {
                this.dig = awz_12.aAv;
            }
            if (awz_12.aAw <= this.dih) continue;
            this.dih = awz_12.aAw;
        }
        this.bNl();
        apl_12.close();
        long l = -6196766170285080576L + (long)arn_2.fX(string);
        String string3 = string2 + string + "000.DDS";
        if (!bl_0.bl(string3)) {
            string3 = string2 + string + "000.tga";
        }
        this.bXx = awm_1.bPn().a((art_1)aru_2.cVG.bIv(), l, string3, false);
        this.bXx.bGY();
    }

    private void bNl() {
        this.dma.put((short)160, (Object)((awz_1)this.dma.get((short)32)));
    }

    public final String bOO() {
        return this.p;
    }

    public final awz_1 aE(short s) {
        if (s < this.dlY || s > (this.dlZ & 0xFFFF)) {
            return null;
        }
        return (awz_1)this.dma.get(s);
    }

    public final awk_1 bOP() {
        return this.bXx;
    }

    public final int bOQ() {
        return this.die;
    }

    public short bNp() {
        return this.dig;
    }

    public short bNq() {
        return this.dih;
    }

    @Override
    public short bNg() {
        return this.dlX;
    }

    @Override
    public void cc(int n, int n2) {
    }

    @Override
    public boolean bNk() {
        return true;
    }
}

