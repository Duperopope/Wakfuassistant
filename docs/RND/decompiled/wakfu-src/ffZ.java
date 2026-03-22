/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class ffZ
extends pr_0 {
    protected static final Logger shE = Logger.getLogger(ffZ.class);
    private final fga shF;
    public static final byte shG = 12;
    protected int brS;
    protected int brV;
    protected int brU;
    protected int rmJ;
    protected int rmK;

    public ffZ(byte by, ByteBuffer byteBuffer) {
        this.shF = fga.d(by);
        this.fB(byteBuffer);
        if (this.shF == null) {
            throw new IllegalArgumentException("Erreur dans la d\u00e9s\u00e9rialisation de la Charact\u00e9ristique, Type inconnu : " + by);
        }
    }

    public ffZ(fga fga2, int n, int n2) {
        this.shF = fga2;
        this.fF(n, n2);
        if (fga2 != null) {
            this.brS = fga2.aZb();
        }
    }

    public fga fWC() {
        return this.shF;
    }

    @Override
    public int aYC() {
        return this.brS;
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
        this.brS = Math.max(this.brU, Math.min(this.brV, n));
        if (bl) {
            this.aYT();
        }
    }

    @Override
    public int nt(int n) {
        this.op(this.brS + n);
        return this.brS;
    }

    @Override
    public int oq(int n) {
        this.op(this.brS - n);
        return this.brS;
    }

    @Override
    public void ot(int n) {
        this.ab(n, true);
    }

    private void ab(int n, boolean bl) {
        this.brV = Math.max(this.rmK, Math.min(this.rmJ, n));
        this.brV = Math.max(this.brV, this.brU);
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
        this.brU = Math.min(this.rmJ, Math.max(this.rmK, n));
        this.brU = Math.min(this.brV, this.brU);
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
        this.rmK = Math.min(n, n2);
        this.rmJ = Math.max(n, n2);
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
        this.ac(this.shF.aYZ(), false);
        this.ab(this.shF.aZa(), false);
        this.j(this.shF.aZb(), false);
        this.aYT();
    }

    @Override
    public /* synthetic */ pt_0 aYQ() {
        return this.fWC();
    }
}

