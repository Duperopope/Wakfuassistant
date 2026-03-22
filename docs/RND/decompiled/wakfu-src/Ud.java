/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public abstract class Ud
extends TO {
    private static final int bus = -1;
    protected QD but;
    private static final Logger buu = Logger.getLogger(Ud.class);
    private long buv;
    private long bhR;

    protected Ud() {
    }

    public QD biU() {
        if (this.but != null && this.but.LV() != this.buv) {
            buu.error((Object)("Le running effect n'est plus le m\u00eame qu'a la creation de l'event " + this.buv));
            return null;
        }
        return this.but;
    }

    @Override
    public boolean isValid() {
        return this.but != null && this.but.LV() == this.buv;
    }

    protected void u(QD qD) {
        this.but = qD;
        this.buv = qD.LV();
        this.but.a(this);
    }

    protected void fg(long l) {
        this.bhR = l;
    }

    protected void b(QD qD, long l) {
        this.u(qD);
        this.bhR = l;
    }

    @Override
    public long biC() {
        long l = this.bhR;
        if (this.but == null) {
            return l;
        }
        Object FX = this.but.bba();
        if (FX == null) {
            return l;
        }
        if (FX.aZD() && this.but.bbc() != null) {
            return this.but.bbc().Sn();
        }
        return l;
    }

    @Override
    protected int biD() {
        return 16;
    }

    @Override
    protected void eP(ByteBuffer byteBuffer) {
        if (this.but == null) {
            byteBuffer.putLong(-1L);
        } else {
            byteBuffer.putLong(this.buv);
        }
        byteBuffer.putLong(this.bhR);
    }

    @Override
    protected void e(Tz tz, ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        this.bhR = byteBuffer.getLong();
        if (l == -1L) {
            return;
        }
        QD qD = tz.en(l);
        if (qD == null) {
            buu.warn((Object)("D\u00e9s\u00e9rialisation de timeline : on ne trouve pas le RunningEffect d'UID " + l));
            return;
        }
        this.u(qD);
    }

    public void biV() {
        this.but = null;
        this.biE();
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{m_runningEffectId=" + this.buv + ", m_targetId=" + this.bhR + "}";
    }
}

