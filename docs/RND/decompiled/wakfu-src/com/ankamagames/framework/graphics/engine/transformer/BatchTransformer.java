/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.transformer;

import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer$ObjectFactory;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;

public class BatchTransformer
extends ayq_2 {
    public static final BatchTransformer$ObjectFactory dnd = new BatchTransformer$ObjectFactory();
    private static final Matrix44 dne = (Matrix44)Matrix44.dAb.bSJ();
    private final ArrayList<awn_1> dnf = new ArrayList(2);
    private Matrix44 dng;
    private boolean cSL;
    private final ArrayList<BatchTransformer> dnh = new ArrayList(1);
    private BatchTransformer dni;

    BatchTransformer() {
    }

    public void uU(int n) {
        this.uW(n).bPx();
        this.bPv();
    }

    public void d(int n, float f2, float f3) {
        awn_1 awn_12 = this.uW(n);
        if (awn_12.aIQ() == f2 && awn_12.aIR() == f3) {
            return;
        }
        awn_12.A(f2, f3, 0.0f);
        this.bPv();
    }

    public void e(int n, float f2, float f3) {
        awn_1 awn_12 = this.uW(n);
        if (awn_12.aRH() == f2 && awn_12.aRI() == f3) {
            return;
        }
        awn_12.B(f2, f3, 1.0f);
        this.bPv();
    }

    public final void a(BatchTransformer batchTransformer) {
        this.a(this.dnh.size(), batchTransformer);
    }

    public final void a(int n, BatchTransformer batchTransformer) {
        assert (batchTransformer != null) : "Child can't be null";
        batchTransformer.bGY();
        batchTransformer.c(this);
        this.dnh.add(n, batchTransformer);
    }

    public final void b(BatchTransformer batchTransformer) {
        assert (batchTransformer != null) : "Child can't be null";
        batchTransformer.c(null);
        if (this.dnh.remove(batchTransformer)) {
            batchTransformer.bsI();
        }
    }

    public final void uV(int n) {
        assert (n > 0 && n < this.dnh.size()) : "Index out of bound";
        this.b(this.dnh.get(n));
    }

    public final void bPs() {
        int n = this.dnh.size();
        for (int i = 0; i < n; ++i) {
            BatchTransformer batchTransformer = this.dnh.get(i);
            batchTransformer.c(null);
            batchTransformer.bsI();
        }
        this.dnh.clear();
    }

    public final void a(awn_1 awn_12) {
        this.dnf.add(awn_12);
        this.bPv();
    }

    public final void a(int n, awn_1 awn_12) {
        this.dnf.add(n, awn_12);
        this.bPv();
    }

    public final awn_1 uW(int n) {
        return this.dnf.get(n);
    }

    public final void b(int n, awn_1 awn_12) {
        this.dnf.set(n, awn_12);
        this.bPv();
    }

    public final void bPt() {
        this.dni = null;
        this.bPs();
        this.dnf.clear();
        this.bPv();
    }

    public final Matrix44 bPu() {
        if (!this.cSL) {
            return this.dng;
        }
        int n = this.dnf.size();
        if (n == 0) {
            this.dng.bPx();
        } else if (n > 4) {
            this.dng.a(this.dnf.get(n - 2).bIT(), this.dnf.get(n - 1).bIT());
            for (int i = n - 3; i >= 0; --i) {
                dne.c(this.dng);
                this.dng.a(this.dnf.get(i).bIT(), dne);
            }
        } else {
            switch (n) {
                case 1: {
                    this.dng.c(this.dnf.get(0).bIT());
                    break;
                }
                case 2: {
                    this.dng.a(this.dnf.get(0).bIT(), this.dnf.get(1).bIT());
                    break;
                }
                case 3: {
                    this.dng.a(this.dnf.get(0).bIT(), this.dnf.get(1).bIT(), this.dnf.get(2).bIT());
                    break;
                }
                case 4: {
                    this.dng.a(this.dnf.get(0).bIT(), this.dnf.get(1).bIT(), this.dnf.get(2).bIT(), this.dnf.get(3).bIT());
                }
            }
        }
        if (this.dni != null) {
            if (this.dng.bWq()) {
                this.dng.c(this.dni.bPu());
            } else {
                this.dng.e(this.dni.bPu());
            }
        }
        this.bHu();
        return this.dng;
    }

    @Override
    public void brr() {
        if (this.dng == null) {
            this.dng = (Matrix44)Matrix44.dAb.bSK();
        }
        this.bPv();
    }

    @Override
    public void brs() {
        int n = this.dnh.size();
        this.bPs();
        if (n > 1) {
            this.dnh.trimToSize();
        }
        int n2 = this.dnf.size();
        this.dnf.clear();
        if (n2 > 2) {
            this.dnf.trimToSize();
        }
        this.dni = null;
        this.dng.bsI();
        this.dng = null;
    }

    private void c(BatchTransformer batchTransformer) {
        this.dni = batchTransformer;
        this.bPv();
    }

    public void bPv() {
        if (this.cSL) {
            return;
        }
        this.cSL = true;
        int n = this.dnh.size();
        for (int i = 0; i < n; ++i) {
            this.dnh.get(i).bPv();
        }
    }

    private void bHu() {
        this.cSL = false;
        assert (this.dni == null || !this.dni.cSL);
    }
}

