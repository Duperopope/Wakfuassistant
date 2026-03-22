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
 * Renamed from Ml
 */
class ml_2
extends AbstractParser<mk_2> {
    ml_2() {
    }

    public mk_2 kG(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new mk_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kG(codedInputStream, extensionRegistryLite);
    }
}

