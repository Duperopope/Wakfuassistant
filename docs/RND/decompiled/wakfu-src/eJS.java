/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class eJS {
    private static final Logger qAN = Logger.getLogger(eJS.class);
    private final List<eJT> qAO = new ArrayList<eJT>();
    private final short qAP;
    private final fgd_0 qAQ = new fgd_0();
    private long aXv;
    private long aZl;
    private String p;
    private long ePP;
    private byte[] qAR;
    private boolean mdS;
    private int qAS;
    private int poU;
    private int qAT;

    public eJS(short s) {
        this.qAP = s;
        this.fxu();
        this.fxt();
    }

    private void fxt() {
        ffS[] ffSArray = eJI.qAk;
        for (int i = 0; i < ffSArray.length; ++i) {
            ffS ffS2 = ffSArray[i];
            this.qAQ.a(ffS2, false);
        }
    }

    private void fxu() {
        ffS[] ffSArray = ffS.values();
        for (int i = 0; i < ffSArray.length; ++i) {
            ffS ffS2 = ffSArray[i];
            this.qAQ.a(ffS2, true);
        }
    }

    public short aWP() {
        return this.qAP;
    }

    public long Sn() {
        return this.aXv;
    }

    public void dC(long l) {
        this.aXv = l;
        this.fxB();
    }

    public long pf() {
        return this.aZl;
    }

    public void ij(long l) {
        long l2 = this.aZl;
        this.aZl = l;
        if (l2 != this.aZl) {
            this.pV(l2);
        }
    }

    public short cmL() {
        return mz_1.aVX.cR(this.pf());
    }

    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        boolean bl = (string != null || this.p != null) && string != null && !string.equals(this.p);
        this.p = string;
        if (bl) {
            this.fxA();
        }
    }

    public void pO(long l) {
        this.ij(this.aZl + l);
    }

    public long Xi() {
        return this.ePP;
    }

    public void pi(long l) {
        this.ePP = l;
    }

    public byte[] fxv() {
        return (byte[])this.qAR.clone();
    }

    public void eB(byte[] byArray) {
        this.qAR = (byte[])byArray.clone();
    }

    @NotNull
    public fgd_0 dme() {
        return this.qAQ;
    }

    public boolean efO() {
        return this.mdS;
    }

    public void lD(boolean bl) {
        this.mdS = bl;
        this.fxE();
    }

    public int fxw() {
        return this.qAS;
    }

    public void Qi(int n) {
        this.qAS = n;
        this.fxD();
    }

    public int fmi() {
        return this.poU;
    }

    public void OZ(int n) {
        this.poU = n;
        this.fxC();
    }

    public int fxx() {
        return this.qAT;
    }

    public void Qj(int n) {
        this.qAT = n;
    }

    public boolean fxy() {
        if (!this.qAQ.aJG()) {
            return true;
        }
        if (this.qAR == null) {
            return false;
        }
        pi_1 pi_12 = new pi_1();
        try {
            pi_12.b(ByteBuffer.wrap((byte[])this.qAR.clone()), this.qAT);
        }
        catch (Exception exception) {
            qAN.error((Object)"Exception levee", (Throwable)exception);
        }
        return !pi_12.Tl.afs.isEmpty();
    }

    public boolean fxz() {
        pi_1 pi_12 = new pi_1();
        try {
            pi_12.b(ByteBuffer.wrap((byte[])this.qAR.clone()), this.qAT);
        }
        catch (Exception exception) {
            qAN.error((Object)"Exception levee", (Throwable)exception);
            return false;
        }
        return true;
    }

    public void a(eJT eJT2) {
        if (!this.qAO.contains(eJT2)) {
            return;
        }
        this.qAO.remove(eJT2);
    }

    public void b(eJT eJT2) {
        if (this.qAO.contains(eJT2)) {
            return;
        }
        this.qAO.add(eJT2);
    }

    private void fxA() {
        ArrayList<eJT> arrayList = new ArrayList<eJT>(this.qAO);
        for (eJT eJT2 : arrayList) {
            eJT2.d(this);
        }
    }

    private void pV(long l) {
        ArrayList<eJT> arrayList = new ArrayList<eJT>(this.qAO);
        for (eJT eJT2 : arrayList) {
            eJT2.a(this, l);
        }
    }

    private void fxB() {
        ArrayList<eJT> arrayList = new ArrayList<eJT>(this.qAO);
        for (eJT eJT2 : arrayList) {
            eJT2.e(this);
        }
    }

    private void fxC() {
        ArrayList<eJT> arrayList = new ArrayList<eJT>(this.qAO);
        for (eJT eJT2 : arrayList) {
            eJT2.f(this);
        }
    }

    private void fxD() {
        ArrayList<eJT> arrayList = new ArrayList<eJT>(this.qAO);
        for (eJT eJT2 : arrayList) {
            eJT2.g(this);
        }
    }

    private void fxE() {
        ArrayList<eJT> arrayList = new ArrayList<eJT>(this.qAO);
        for (eJT eJT2 : arrayList) {
            eJT2.h(this);
        }
    }

    public boolean equals(Object object) {
        if (!(object instanceof eJS)) {
            return false;
        }
        return this.aXv == ((eJS)object).aXv;
    }

    public String toString() {
        return "CompanionModel{m_id=" + this.aXv + ", m_breedId=" + this.qAP + ", m_xp=" + this.aZl + ", level=" + this.cmL() + ", m_name='" + this.p + "', m_ownerId=" + this.ePP + ", m_itemEquipment=" + String.valueOf(this.qAQ) + ", m_serializedEquipment=" + (this.qAR != null ? this.qAR.length : -1) + ", m_isUnlocked=" + this.mdS + ", m_hpMax=" + this.qAS + ", m_currentHp=" + this.poU + ", m_serializationVersion=" + this.qAT + "}";
    }
}

