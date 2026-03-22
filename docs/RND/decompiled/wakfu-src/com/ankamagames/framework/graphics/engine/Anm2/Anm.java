/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.io.LittleEndianDataInputStream
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.log4j.Logger
 */
package com.ankamagames.framework.graphics.engine.Anm2;

import com.ankamagames.framework.graphics.engine.Anm2.Anm$ObjectFactory;
import com.google.common.io.LittleEndianDataInputStream;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import org.apache.log4j.Logger;

public final class Anm
extends ayq_2 {
    public static final int cRw = 128;
    public static final int cRx = 63;
    public static final Anm$ObjectFactory cRy = new Anm$ObjectFactory();
    private static final Logger cRz = Logger.getLogger(Anm.class);
    private final ez_0 cRA = new ez_0();
    private volatile arp_1 cRB = arp_1.cSS;
    private ArrayList<ard_2> cRC;
    private fy_0 cRD;
    private String awN;
    private String aCH;
    private static final ExecutorService cRE = Executors.newFixedThreadPool(3, new ThreadFactoryBuilder().setNameFormat("Anm-Loader-%d").setThreadFactory((ThreadFactory)new aqv_1()).build());
    private Future<?> cRF;
    private short cRG;
    private static final short cRH = 500;

    Anm() {
    }

    public boolean bGU() {
        return this.cRD != null && this.cRD.aLC();
    }

    public et_1 aId() {
        return this.cRA.aId();
    }

    public ez_0 bGV() {
        return this.cRA;
    }

    public void cN(boolean bl) {
        String string = this.awN + "/" + this.aCH;
        this.k(string, bl);
    }

    public void k(String string, boolean bl) {
        this.aCH = fq_0.bF(string);
        this.awN = fq_0.bG(string);
        if (bl) {
            this.cRD = fo_0.bx(string);
            this.cRB = arp_1.cST;
        } else {
            try (LittleEndianDataInputStream littleEndianDataInputStream = new LittleEndianDataInputStream(fo_0.bz(string));){
                this.a(new dv_0(littleEndianDataInputStream));
            }
        }
    }

    public void a(do_0 do_02) {
        dl_0.a(this.cRA, this.awN, do_02);
        this.cRB = arp_1.cSV;
    }

    public void aPc() {
        switch (this.cRB) {
            case cST: {
                if (!this.cRD.aLB()) break;
                Object object = this.cRD.aLD();
                this.cRD = null;
                this.cRB = arp_1.cSU;
                this.cRF = cRE.submit(() -> this.dA((byte[])object));
                break;
            }
            case cSU: {
                try {
                    if (!this.cRF.isDone()) break;
                    this.cRB = arp_1.cSV;
                }
                catch (Exception exception) {
                    cRz.error((Object)"Exception raised : ", (Throwable)exception);
                }
            }
            case cSV: {
                if (this.aKK() == 0L) {
                    this.cRB = arp_1.cSX;
                    break;
                }
                this.bGX();
                this.cRB = arp_1.cSW;
            }
            case cSW: {
                Object object = awm_1.bPn().gB(this.aKK());
                if (object != null && ((axc_2)object).bQp()) break;
                this.cRB = arp_1.cSX;
            }
        }
        if (this.aLB() && this.cRC != null) {
            for (int i = 0; i < this.cRC.size(); ++i) {
                this.cRC.get(i).run();
            }
            this.cRC = null;
        }
    }

    public String aLM() {
        return this.aCH;
    }

    public boolean aLB() {
        return this.cRB == arp_1.cSX;
    }

    public boolean aJz() {
        return this.cRA.aId().aJz();
    }

    public int fM(String string) {
        return this.cRA.aID().bs(string);
    }

    public float[] aJI() {
        return this.cRA.aID().aJI();
    }

    @Override
    public void brr() {
        this.cRG = (short)500;
    }

    @Override
    public void brs() {
        awk_1 awk_12;
        this.cRB = arp_1.cSS;
        if (this.cRA.aId() != null && (awk_12 = awm_1.bPn().gB(this.cRA.aIg().aKK())) != null) {
            awk_12.bsI();
        }
        this.cRA.clear();
        this.awN = null;
        this.aCH = null;
        this.cRD = null;
        this.cRC = null;
    }

    private String bGW() {
        if (this.cRA.aId().aJw()) {
            return this.awN + "/Atlas/";
        }
        return this.awN + "/Textures/";
    }

    private String fN(String string) {
        return this.bGW() + string + ".png";
    }

    private void bGX() {
        if (this.aKJ() == null) {
            return;
        }
        awm_1 awm_12 = awm_1.bPn();
        String string = this.fN(this.aKJ());
        arq_1 arq_12 = arq_1.bHF();
        awk_1 awk_12 = awm_12.a((art_1)aru_2.cVG.bIv(), this.aKK(), string, arq_12.bHH(), arq_12.bHG());
        awk_12.bGY();
    }

    @Override
    public void bGY() {
        super.bGY();
        this.cRG = (short)500;
    }

    public short bGZ() {
        return this.cRG;
    }

    public void bHa() {
        if (this.bSW() == 0 && this.cRG > Short.MIN_VALUE) {
            this.cRG = (short)(this.cRG - 1);
        }
    }

    public void a(ard_2 ard_22) {
        if (this.cRC == null) {
            this.cRC = new ArrayList(2);
        }
        this.cRC.add(ard_22);
    }

    public void b(ard_2 ard_22) {
        if (this.cRC != null) {
            this.cRC.remove(ard_22);
        }
    }

    public static int fO(String string) {
        return arx_1.fS(string).bHJ();
    }

    public ew_1[] aJJ() {
        return this.cRA.aID().aJJ();
    }

    public String aKJ() {
        return this.cRA.aIg().aKJ();
    }

    public eg_2 aIE() {
        return this.cRA.aIE();
    }

    public ex_1 aID() {
        return this.cRA.aID();
    }

    public long aKK() {
        return this.cRA.aIg().aKK();
    }

    public String toString() {
        return "Anm{m_path='" + this.awN + "', m_fileName='" + this.aCH + "'}";
    }

    private /* synthetic */ void dA(byte[] byArray) {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
             LittleEndianDataInputStream littleEndianDataInputStream = new LittleEndianDataInputStream((InputStream)byteArrayInputStream);){
            this.a(new dv_0(littleEndianDataInputStream));
        }
        catch (IOException iOException) {
            cRz.error((Object)("Exception while loading ANM " + String.valueOf(this)), (Throwable)iOException);
        }
    }
}

