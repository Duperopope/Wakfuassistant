/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eTf
 */
public class etf_0
extends pr_0 {
    protected static final Logger rmG = Logger.getLogger(etf_0.class);
    private final etg_0 rmH;
    public static final byte rmI = 12;
    protected int brS;
    protected int brV;
    protected int brU;
    protected int rmJ;
    protected int rmK;

    public etf_0(byte by, ByteBuffer byteBuffer) {
        this.rmH = etg_0.b(by);
        this.fB(byteBuffer);
        if (this.rmH == null) {
            throw new IllegalArgumentException("Erreur dans la d\u00e9s\u00e9rialisation de la Charact\u00e9ristique, Type inconnu : " + by);
        }
    }

    public etf_0(etg_0 etg_02, int n, int n2) {
        this.rmH = etg_02;
        this.fF(n, n2);
    }

    public etg_0 fIU() {
        return this.rmH;
    }

    @Override
    public int aYB() {
        if (this.brS > this.brV) {
            return this.aYD();
        }
        if (this.brS < this.brU) {
            return this.aYF();
        }
        return this.brS;
    }

    @Override
    public int aYC() {
        return this.brS;
    }

    @Override
    public int aYD() {
        return this.brV;
    }

    @Override
    public int aYE() {
        return this.brV;
    }

    @Override
    public int aYF() {
        return this.brU;
    }

    @Override
    public int oo(int n) {
        return 0;
    }

    @Override
    public int aYG() {
        return 0;
    }

    @Override
    public void op(int n) {
        this.j(n, true);
    }

    private void j(int n, boolean bl) {
        int n2 = this.brV < n ? this.brV : n;
        int n3 = this.brS = this.brU > n2 ? this.brU : n2;
        if (bl) {
            this.aYT();
        }
    }

    @Override
    public int nt(int n) {
        this.op(this.brS + n);
        this.aYT();
        return this.brS;
    }

    @Override
    public int oq(int n) {
        this.op(this.brS - n);
        this.aYT();
        return this.brS;
    }

    @Override
    public void ot(int n) {
        this.ab(n, true);
    }

    private void ab(int n, boolean bl) {
        int n2 = this.rmJ < n ? this.rmJ : n;
        this.brV = this.rmK > n2 ? this.rmK : n2;
        int n3 = this.brV = this.brV > this.brU ? this.brV : this.brU;
        if (this.brS > this.brV) {
            this.brS = this.brV;
        }
        if (bl) {
            this.aYT();
        }
    }

    @Override
    public void ou(int n) {
        this.ac(n, true);
    }

    private void ac(int n, boolean bl) {
        int n2 = this.rmK > n ? this.rmK : n;
        this.brU = this.rmJ < n2 ? this.rmJ : n2;
        int n3 = this.brU = this.brV < this.brU ? this.brV : this.brU;
        if (this.brS < this.brU) {
            this.brS = this.brU;
        }
        if (bl) {
            this.aYT();
        }
    }

    @Override
    public int or(int n) {
        if (this.brV == Integer.MAX_VALUE) {
            return this.brV;
        }
        this.ot(this.brV + n);
        return this.brV;
    }

    @Override
    public int os(int n) {
        if (this.brU == Integer.MIN_VALUE) {
            return this.brU;
        }
        this.ou(this.brU + n);
        return this.brU;
    }

    private void fF(int n, int n2) {
        this.rmK = n < n2 ? n : n2;
        int n3 = this.rmJ = n > n2 ? n : n2;
        if (this.brV > this.rmJ) {
            this.ot(this.rmJ);
        }
        if (this.brU < this.rmK) {
            this.ou(this.rmK);
        }
    }

    public void fA(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.brS);
        byteBuffer.putInt(this.brU);
        byteBuffer.putInt(this.brV);
    }

    public void fB(ByteBuffer byteBuffer) {
        this.brS = byteBuffer.getInt();
        this.brU = byteBuffer.getInt();
        this.brV = byteBuffer.getInt();
    }

    @Override
    public void aYH() {
        this.ac(this.rmH.aYZ(), false);
        this.ab(this.rmH.aZa(), false);
        this.j(this.rmH.aZb(), false);
        this.aYT();
    }

    @Override
    public /* synthetic */ pt_0 aYQ() {
        return this.fIU();
    }
}

