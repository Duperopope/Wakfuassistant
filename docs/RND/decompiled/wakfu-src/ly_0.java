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
 * Renamed from lY
 */
class ly_0
extends AbstractParser<lx_0> {
    ly_0() {
    }

    public lx_0 hD(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new lx_0(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hD(codedInputStream, extensionRegistryLite);
    }
}

