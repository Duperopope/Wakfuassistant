/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Cq {
    private short avX;
    private String p;
    private int avZ;
    private int awa;
    private byte awb;
    private boolean awO;
    private int awP = -1;
    private ea_1[] awQ;
    private ea_1 awR;
    private boolean awS;
    private int awT = -1;

    public short aIi() {
        return this.avX;
    }

    public void j(short s) {
        this.avX = s;
    }

    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
    }

    public int aIj() {
        return this.avZ;
    }

    public void mp(int n) {
        this.avZ = n;
    }

    public int aIk() {
        return this.awa;
    }

    public void mq(int n) {
        this.awa = n;
    }

    public byte aIl() {
        return this.awb;
    }

    public void f(byte by) {
        this.awb = by;
    }

    public boolean aIm() {
        return this.awO;
    }

    public void at(boolean bl) {
        this.awO = bl;
    }

    public int aIn() {
        return this.awP;
    }

    public Set<eh_2> mr(int n) {
        HashSet hashSet = Sets.newHashSet();
        ea_1[] ea_1Array = this.awQ;
        if (n >= ea_1Array.length) {
            return hashSet;
        }
        eh_2[] eh_2Array = ea_1Array[n].aIH();
        Collections.addAll(hashSet, eh_2Array);
        return hashSet;
    }

    public void ms(int n) {
        this.awP = n;
    }

    public ea_1[] aIo() {
        return this.awQ;
    }

    public void a(ea_1[] ea_1Array) {
        this.awQ = ea_1Array;
    }

    public ea_1 aIp() {
        return this.awR;
    }

    public void a(ea_1 ea_12) {
        this.awR = ea_12;
    }

    public boolean aIq() {
        return this.awS;
    }

    public void au(boolean bl) {
        this.awS = bl;
    }

    public int aIr() {
        return this.awT;
    }

    public void mt(int n) {
        this.awT = n;
    }

    public void a(eg_2 eg_22) {
    }

    public int aIs() {
        return this.awQ.length;
    }
}

