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
 * Renamed from dh
 */
class dh_1
extends AbstractParser<dg_1> {
    dh_1() {
    }

    public dg_1 bM(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new dg_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bM(codedInputStream, extensionRegistryLite);
    }
}

