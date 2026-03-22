/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;

public final class VertexBufferPCT$ObjectFactory
extends ayr_2<VertexBufferPCT> {
    public VertexBufferPCT$ObjectFactory() {
        super(VertexBufferPCT.class);
    }

    public VertexBufferPCT bIJ() {
        return new VertexBufferPCT();
    }

    public VertexBufferPCT ue(int n) {
        VertexBufferPCT vertexBufferPCT = (VertexBufferPCT)this.bSJ();
        vertexBufferPCT.tZ(n);
        return vertexBufferPCT;
    }

    public VertexBufferPCT uf(int n) {
        VertexBufferPCT vertexBufferPCT = (VertexBufferPCT)this.bSK();
        vertexBufferPCT.tZ(n);
        vertexBufferPCT.bII();
        return vertexBufferPCT;
    }

    @Override
    public /* synthetic */ ayq_2 bru() {
        return this.bIJ();
    }
}

