/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

public final class nx
extends GeneratedMessageV3.Builder<nx>
implements ny {
    private int an;
    private long AH;
    private long nW;
    private Object bs = "";
    private long Dn;
    private boolean NQ;

    public static final Descriptors.Descriptor aqn() {
        return nq.Nx;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nq.Ny.ensureFieldAccessorsInitialized(nv.class, nx.class);
    }

    nx() {
        this.D();
    }

    nx(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (nv.el()) {
            // empty if block
        }
    }

    public nx aqo() {
        super.clear();
        this.AH = 0L;
        this.an &= 0xFFFFFFFE;
        this.nW = 0L;
        this.an &= 0xFFFFFFFD;
        this.bs = "";
        this.an &= 0xFFFFFFFB;
        this.Dn = 0L;
        this.an &= 0xFFFFFFF7;
        this.NQ = false;
        this.an &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return nq.Nx;
    }

    public nv aqm() {
        return nv.aql();
    }

    public nv aqp() {
        nv nv2 = this.aqq();
        if (!nv2.isInitialized()) {
            throw nx.newUninitializedMessageException((Message)nv2);
        }
        return nv2;
    }

    public nv aqq() {
        nv nv2 = new nv(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            nv2.AH = this.AH;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            nv2.nW = this.nW;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            n2 |= 4;
        }
        nv2.bs = this.bs;
        if ((n & 8) != 0) {
            nv2.Dn = this.Dn;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            nv2.NQ = this.NQ;
            n2 |= 0x10;
        }
        nv2.an = n2;
        this.onBuilt();
        return nv2;
    }

    public nx aqr() {
        return (nx)super.clone();
    }

    public nx fm(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nx)super.setField(fieldDescriptor, object);
    }

    public nx cg(Descriptors.FieldDescriptor fieldDescriptor) {
        return (nx)super.clearField(fieldDescriptor);
    }

    public nx cg(Descriptors.OneofDescriptor oneofDescriptor) {
        return (nx)super.clearOneof(oneofDescriptor);
    }

    public nx cg(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (nx)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public nx fn(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nx)super.addRepeatedField(fieldDescriptor, object);
    }

    public nx cg(Message message) {
        if (message instanceof nv) {
            return this.d((nv)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public nx d(nv nv2) {
        if (nv2 == nv.aql()) {
            return this;
        }
        if (nv2.oN()) {
            this.bB(nv2.Sn());
        }
        if (nv2.xk()) {
            this.bC(nv2.xl());
        }
        if (nv2.wq()) {
            this.an |= 4;
            this.bs = nv2.bs;
            this.onChanged();
        }
        if (nv2.Xl()) {
            this.bD(nv2.Xm());
        }
        if (nv2.aqg()) {
            this.V(nv2.aqh());
        }
        this.fn(nv.c(nv2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.oN()) {
            return false;
        }
        if (!this.xk()) {
            return false;
        }
        if (!this.wq()) {
            return false;
        }
        if (!this.Xl()) {
            return false;
        }
        return this.aqg();
    }

    public nx iu(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        nv nv2 = null;
        try {
            nv2 = (nv)nv.NS.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            nv2 = (nv)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (nv2 != null) {
                this.d(nv2);
            }
        }
        return this;
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Sn() {
        return this.AH;
    }

    public nx bB(long l) {
        this.an |= 1;
        this.AH = l;
        this.onChanged();
        return this;
    }

    public nx aqs() {
        this.an &= 0xFFFFFFFE;
        this.AH = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xk() {
        return (this.an & 2) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    public nx bC(long l) {
        this.an |= 2;
        this.nW = l;
        this.onChanged();
        return this;
    }

    public nx aqt() {
        this.an &= 0xFFFFFFFD;
        this.nW = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean wq() {
        return (this.an & 4) != 0;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bs = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nx Z(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.bs = string;
        this.onChanged();
        return this;
    }

    public nx aqu() {
        this.an &= 0xFFFFFFFB;
        this.bs = nv.aql().getName();
        this.onChanged();
        return this;
    }

    public nx dz(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Xl() {
        return (this.an & 8) != 0;
    }

    @Override
    public long Xm() {
        return this.Dn;
    }

    public nx bD(long l) {
        this.an |= 8;
        this.Dn = l;
        this.onChanged();
        return this;
    }

    public nx aqv() {
        this.an &= 0xFFFFFFF7;
        this.Dn = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aqg() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public boolean aqh() {
        return this.NQ;
    }

    public nx V(boolean bl) {
        this.an |= 0x10;
        this.NQ = bl;
        this.onChanged();
        return this;
    }

    public nx aqw() {
        this.an &= 0xFFFFFFEF;
        this.NQ = false;
        this.onChanged();
        return this;
    }

    public final nx fm(UnknownFieldSet unknownFieldSet) {
        return (nx)super.setUnknownFields(unknownFieldSet);
    }

    public final nx fn(UnknownFieldSet unknownFieldSet) {
        return (nx)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fn(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fm(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fn(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cg(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cg(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cg(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fm(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aqo();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aqr();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fn(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iu(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cg(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aqo();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cg(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aqr();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fn(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fm(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fn(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cg(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cg(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cg(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fm(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iu(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aqr();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aqq();
    }

    public /* synthetic */ Message build() {
        return this.aqp();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cg(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aqo();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iu(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aqr();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aqq();
    }

    public /* synthetic */ MessageLite build() {
        return this.aqp();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aqo();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aqm();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aqm();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iu(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aqr();
    }

    public /* synthetic */ Object clone() {
        return this.aqr();
    }
}

