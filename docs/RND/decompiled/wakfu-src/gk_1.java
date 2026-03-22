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
 * Renamed from gk
 */
class gk_1
extends AbstractParser<gj_1> {
    gk_1() {
    }

    public gj_1 dH(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new gj_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dH(codedInputStream, extensionRegistryLite);
    }
}

