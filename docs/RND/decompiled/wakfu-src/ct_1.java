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
 * Renamed from cT
 */
class ct_1
extends AbstractParser<cs_1> {
    ct_1() {
    }

    public cs_1 bD(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new cs_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bD(codedInputStream, extensionRegistryLite);
    }
}

