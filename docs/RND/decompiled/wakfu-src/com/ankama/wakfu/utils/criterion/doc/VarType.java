/*
 * Decompiled with CFR 0.152.
 */
package com.ankama.wakfu.utils.criterion.doc;

import java.util.Set;

public enum VarType {
    STRING(new VarType[0]),
    NUMBER(new VarType[0]),
    BOOLEAN(new VarType[0]),
    NUMBERLIST(new VarType[0]),
    STRINGLIST(new VarType[0]),
    POSITION(new VarType[0]),
    POSITIONLIST(new VarType[0]),
    PLAYERRANKING(new VarType[0]),
    NUMBERNUMBERMAP(new VarType[0]),
    GLOBALVARIABLEVALUE(STRING, NUMBER, BOOLEAN);

    private final Set<VarType> m_typeRelated;

    private VarType(VarType ... varTypeArray) {
        this.m_typeRelated = Set.of(varTypeArray);
    }

    public Set<VarType> getTypeRelated() {
        return this.m_typeRelated;
    }

    public boolean isAnAlias() {
        return !this.m_typeRelated.isEmpty();
    }
}

