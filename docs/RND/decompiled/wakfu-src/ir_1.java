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
 * Renamed from iR
 */
class ir_1
extends AbstractParser<iq_1> {
    ir_1() {
    }

    public iq_1 fq(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new iq_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fq(codedInputStream, extensionRegistryLite);
    }
}

