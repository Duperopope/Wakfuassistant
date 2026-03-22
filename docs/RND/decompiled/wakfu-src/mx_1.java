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
 * Renamed from mX
 */
class mx_1
extends AbstractParser<mw_1> {
    mx_1() {
    }

    public mw_1 ik(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new mw_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ik(codedInputStream, extensionRegistryLite);
    }
}

