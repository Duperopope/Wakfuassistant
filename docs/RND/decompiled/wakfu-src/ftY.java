/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import java.util.Date;
import lombok.Generated;

public class ftY {
    private long ePP;
    private String aFD;
    private String the;
    private String eGd;
    private short thf;
    private Date thg;
    private Date thh;

    public void e(azg_1 azg_12) {
        azg_12.gK(this.ePP);
        byte[] byArray = BH.aP(this.aFD);
        azg_12.aF((byte)byArray.length);
        azg_12.dH(byArray);
        byte[] byArray2 = BH.aP(this.the);
        azg_12.aF((byte)byArray2.length);
        azg_12.dH(byArray2);
        byte[] byArray3 = BH.aP(this.eGd);
        azg_12.aF((byte)byArray3.length);
        azg_12.dH(byArray3);
        azg_12.aG(this.thf);
        azg_12.gK(this.thg.getTime());
        azg_12.gK(this.thh.getTime());
    }

    public void eL(ByteBuffer byteBuffer) {
        this.ePP = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray);
        this.aFD = BH.dc(byArray);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.the = BH.dc(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray3);
        this.eGd = BH.dc(byArray3);
        this.thf = byteBuffer.getShort();
        this.thg = new java.sql.Date(byteBuffer.getLong());
        this.thh = new java.sql.Date(byteBuffer.getLong());
    }

    @Generated
    public long Xi() {
        return this.ePP;
    }

    @Generated
    public String xO() {
        return this.aFD;
    }

    @Generated
    public String eta() {
        return this.the;
    }

    @Generated
    public String etd() {
        return this.eGd;
    }

    @Generated
    public short gna() {
        return this.thf;
    }

    @Generated
    public Date etb() {
        return this.thg;
    }

    @Generated
    public Date gnb() {
        return this.thh;
    }

    @Generated
    public void pi(long l) {
        this.ePP = l;
    }

    @Generated
    public void dm(String string) {
        this.aFD = string;
    }

    @Generated
    public void sY(String string) {
        this.the = string;
    }

    @Generated
    public void sZ(String string) {
        this.eGd = string;
    }

    @Generated
    public void fO(short s) {
        this.thf = s;
    }

    @Generated
    public void o(Date date) {
        this.thg = date;
    }

    @Generated
    public void p(Date date) {
        this.thh = date;
    }

    @Generated
    public String toString() {
        return "PenalViewElement(m_ownerId=" + this.Xi() + ", m_characterName=" + this.xO() + ", m_moderatorName=" + this.eta() + ", m_reason=" + this.etd() + ", m_sanctionId=" + this.gna() + ", m_date=" + String.valueOf(this.etb()) + ", m_deletionDate=" + String.valueOf(this.gnb()) + ")";
    }
}

