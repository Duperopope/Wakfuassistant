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
 * Renamed from gv
 */
class gv_1
extends AbstractParser<gu_1> {
    gv_1() {
    }

    public gu_1 dK(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new gu_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dK(codedInputStream, extensionRegistryLite);
    }
}

