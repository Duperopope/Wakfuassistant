/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from avO
 */
public class avo_2
implements awh_2 {
    private byte dib;
    private short dic;
    private short did;
    private short die;
    private short dif;
    short dig;
    private short dih;
    private String p;
    private awk_1 bXx;
    private TIntObjectHashMap<avr_2> dii;

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

    private void bNl() {
        this.dii.put(160, (Object)((avr_2)this.dii.get(32)));
    }

    private void m(apl_1 apl_12) {
        byte by = apl_12.aIy();
        int n = apl_12.aIA();
        int n2 = apl_12.bFT() + n;
        apl_12.tw(n2);
    }

    private void n(apl_1 apl_12) {
        byte by = apl_12.aIy();
        int n = apl_12.aIA();
        int n2 = apl_12.bFT() + n;
        this.die = apl_12.aIz();
        this.dif = apl_12.aIz();
        apl_12.tw(n2);
    }

    private void o(apl_1 apl_12) {
        byte by = apl_12.aIy();
        int n = apl_12.aIA();
        int n2 = apl_12.bFT() + n;
        apl_12.tw(n2);
    }

    private void p(apl_1 apl_12) {
        byte by = apl_12.aIy();
        int n = apl_12.aIA();
        this.dic = (short)(n / 20);
        this.dii = new TIntObjectHashMap((int)this.dic, 1.0f);
        for (int i = 0; i < this.dic; ++i) {
            avr_2 avr_22 = new avr_2();
            char[] cArray = Character.toChars(apl_12.aIA());
            avr_22.dik = cArray[0];
            avr_22.ccg = apl_12.aIz();
            avr_22.cch = apl_12.aIz();
            avr_22.aAv = apl_12.aIz();
            avr_22.aAw = apl_12.aIz();
            avr_22.dil = apl_12.aIz();
            avr_22.dim = apl_12.aIz();
            avr_22.din = apl_12.aIz();
            apl_12.aIy();
            apl_12.aIy();
            this.dii.put((int)avr_22.dik, (Object)avr_22);
            this.dig = (short)Math.max(this.dig, avr_22.aAv);
            this.dih = (short)Math.max(this.dih, avr_22.aAw);
        }
    }

    private void q(apl_1 apl_12) {
        if (apl_12.available() <= 0) {
            return;
        }
        byte by = apl_12.aIy();
        int n = apl_12.aIA();
        int n2 = n / 10;
        for (int i = 0; i < n2; ++i) {
            char[] cArray = Character.toChars(apl_12.aIA());
            char[] cArray2 = Character.toChars(apl_12.aIA());
            short s = apl_12.aIz();
            avr_2 avr_22 = (avr_2)this.dii.get((int)cArray[0]);
            if (avr_22 == null) continue;
            if (avr_22.dio == null) {
                avr_22.dio = new aai_1();
            }
            avr_22.dio.c(cArray2[0], s);
        }
        this.bNm();
    }

    private void bNm() {
        this.dii.forEachValue((TObjectProcedure)new avp_2(this));
    }

    public void x(String string, String string2) {
        this.p = string;
        apl_1 apl_12 = apl_1.dw(fo_0.by(string2 + string + ".fnt"));
        if (apl_12.aIy() != 66 || apl_12.aIy() != 77 || apl_12.aIy() != 70) {
            return;
        }
        this.dib = apl_12.aIy();
        this.m(apl_12);
        this.n(apl_12);
        this.o(apl_12);
        this.p(apl_12);
        this.q(apl_12);
        this.bNl();
        apl_12.close();
        long l = -6196766170285080576L + (long)arn_2.fX(string);
        String string3 = string2 + string + "_0.dds";
        if (!bl_0.bl(string3)) {
            string3 = string2 + string + "_0.DDS";
        }
        this.bXx = awm_1.bPn().a((art_1)aru_2.cVG.bIv(), l, string3, false);
        this.bXx.bGY();
    }

    public final String bNn() {
        return this.p;
    }

    public final avr_2 d(char c2) {
        return (avr_2)this.dii.get((int)c2);
    }

    public final awk_1 bNo() {
        return this.bXx;
    }

    public final int getCellHeight() {
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
        return 0;
    }

    public short bNr() {
        return this.dif;
    }

    @Override
    public void cc(int n, int n2) {
    }

    @Override
    public boolean bNk() {
        return true;
    }

    public short bNs() {
        return (short)(this.die - this.dif);
    }

    public void bNt() {
        this.dii.forEachValue((TObjectProcedure)new avq_2(this));
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        avo_2 avo_22 = (avo_2)object;
        return this.p.equals(avo_22.p);
    }

    public int hashCode() {
        return this.p.hashCode();
    }
}

