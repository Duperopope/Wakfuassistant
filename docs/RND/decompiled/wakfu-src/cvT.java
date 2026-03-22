/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

public class cvT
extends nr_0 {
    private long aZQ;
    private int mcs;
    private short ejt;
    private final ArrayList<Integer> mkD = new ArrayList();
    private final ArrayList<Integer> mkE = new ArrayList();

    @Override
    public boolean dn(byte[] byArray) {
        int n;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZQ = byteBuffer.getLong();
        this.mcs = byteBuffer.getInt();
        this.ejt = byteBuffer.getShort();
        int n2 = byteBuffer.getInt();
        for (n = 0; n < n2; ++n) {
            this.mkD.add(byteBuffer.getInt());
        }
        n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            this.mkE.add(byteBuffer.getInt());
        }
        return true;
    }

    @Override
    public int d() {
        return 12657;
    }

    public int eEt() {
        return this.mcs;
    }

    public long aXb() {
        return this.aZQ;
    }

    public short cmL() {
        return this.ejt;
    }

    public ArrayList<Integer> eEu() {
        return new ArrayList<Integer>(Collections.unmodifiableList(this.mkD));
    }

    public ArrayList<Integer> eEv() {
        return new ArrayList<Integer>(Collections.unmodifiableList(this.mkE));
    }

    @Override
    public String toString() {
        return "SpellDeckSynchronizeMessage{m_playerId=" + this.aZQ + ", m_deckIndex=" + this.mcs + ", m_level=" + this.ejt + ", m_activeSpells=" + String.valueOf(this.mkD) + ", m_passiveSpells=" + String.valueOf(this.mkE) + "}";
    }
}

