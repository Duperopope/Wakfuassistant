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
 * Renamed from Mg
 */
class mg_2
extends AbstractParser<mf_2> {
    mg_2() {
    }

    public mf_2 kD(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new mf_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kD(codedInputStream, extensionRegistryLite);
    }
}

