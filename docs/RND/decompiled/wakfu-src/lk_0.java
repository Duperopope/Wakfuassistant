/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 */
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

/*
 * Renamed from lK
 */
class lk_0
extends AbstractParser<lj_0> {
    lk_0() {
    }

    public lj_0 hu(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new lj_0(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hu(codedInputStream, extensionRegistryLite);
    }
}

