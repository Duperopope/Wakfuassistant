/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from F
 */
public final class f_0
extends GeneratedMessageV3.Builder<f_0>
implements L {
    private int ba = 0;
    private Object bb;
    private long bd;
    private SingleFieldBuilderV3<h_0, J, k_0> bj;

    public static final Descriptors.Descriptor bI() {
        return c_0.aL;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return c_0.aM.ensureFieldAccessorsInitialized(d_0.class, f_0.class);
    }

    f_0() {
        this.D();
    }

    f_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (d_0.bg()) {
            // empty if block
        }
    }

    public f_0 bJ() {
        super.clear();
        this.bd = 0L;
        this.ba = 0;
        this.bb = null;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return c_0.aL;
    }

    public d_0 bH() {
        return d_0.bG();
    }

    public d_0 bK() {
        d_0 d_02 = this.bL();
        if (!d_02.isInitialized()) {
            throw f_0.newUninitializedMessageException((Message)d_02);
        }
        return d_02;
    }

    public d_0 bL() {
        d_0 d_02 = new d_0(this);
        d_02.bd = this.bd;
        if (this.ba == 2) {
            d_02.bb = this.bb;
        }
        if (this.ba == 3) {
            d_02.bb = this.bb;
        }
        if (this.ba == 4) {
            d_02.bb = this.bj == null ? this.bb : this.bj.build();
        }
        d_02.ba = this.ba;
        this.onBuilt();
        return d_02;
    }

    public f_0 bM() {
        return (f_0)super.clone();
    }

    public f_0 k(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (f_0)super.setField(fieldDescriptor, object);
    }

    public f_0 f(Descriptors.FieldDescriptor fieldDescriptor) {
        return (f_0)super.clearField(fieldDescriptor);
    }

    public f_0 f(Descriptors.OneofDescriptor oneofDescriptor) {
        return (f_0)super.clearOneof(oneofDescriptor);
    }

    public f_0 f(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (f_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public f_0 l(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (f_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public f_0 f(Message message) {
        if (message instanceof d_0) {
            return this.c((d_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public f_0 c(d_0 d_02) {
        if (d_02 == d_0.bG()) {
            return this;
        }
        if (d_02.bu() != 0L) {
            this.c(d_02.bu());
        }
        switch (d_02.bt().ordinal()) {
            case 0: {
                this.d(d_02.bw());
                break;
            }
            case 1: {
                this.ba = 3;
                this.bb = d_02.bb;
                this.onChanged();
                break;
            }
            case 2: {
                this.b(d_02.bB());
                break;
            }
        }
        this.l(d_0.b(d_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public f_0 r(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        d_0 d_02 = null;
        try {
            d_02 = (d_0)d_0.bi.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            d_02 = (d_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (d_02 != null) {
                this.c(d_02);
            }
        }
        return this;
    }

    @Override
    public G bt() {
        return G.j(this.ba);
    }

    public f_0 bN() {
        this.ba = 0;
        this.bb = null;
        this.onChanged();
        return this;
    }

    @Override
    public long bu() {
        return this.bd;
    }

    public f_0 c(long l) {
        this.bd = l;
        this.onChanged();
        return this;
    }

    public f_0 bO() {
        this.bd = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean bv() {
        return this.ba == 2;
    }

    @Override
    public long bw() {
        if (this.ba == 2) {
            return (Long)this.bb;
        }
        return 0L;
    }

    public f_0 d(long l) {
        this.ba = 2;
        this.bb = l;
        this.onChanged();
        return this;
    }

    public f_0 bP() {
        if (this.ba == 2) {
            this.ba = 0;
            this.bb = null;
            this.onChanged();
        }
        return this;
    }

    @Override
    public boolean bx() {
        return this.ba == 3;
    }

    @Override
    public String by() {
        Object object = "";
        if (this.ba == 3) {
            object = this.bb;
        }
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (this.ba == 3) {
                this.bb = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString bz() {
        Object object = "";
        if (this.ba == 3) {
            object = this.bb;
        }
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            if (this.ba == 3) {
                this.bb = byteString;
            }
            return byteString;
        }
        return (ByteString)object;
    }

    public f_0 i(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.ba = 3;
        this.bb = string;
        this.onChanged();
        return this;
    }

    public f_0 bQ() {
        if (this.ba == 3) {
            this.ba = 0;
            this.bb = null;
            this.onChanged();
        }
        return this;
    }

    public f_0 w(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        d_0.p(byteString);
        this.ba = 3;
        this.bb = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean bA() {
        return this.ba == 4;
    }

    @Override
    public h_0 bB() {
        if (this.bj == null) {
            if (this.ba == 4) {
                return (h_0)this.bb;
            }
            return h_0.cb();
        }
        if (this.ba == 4) {
            return (h_0)this.bj.getMessage();
        }
        return h_0.cb();
    }

    public f_0 a(h_0 h_02) {
        if (this.bj == null) {
            if (h_02 == null) {
                throw new NullPointerException();
            }
            this.bb = h_02;
            this.onChanged();
        } else {
            this.bj.setMessage((AbstractMessage)h_02);
        }
        this.ba = 4;
        return this;
    }

    public f_0 a(J j) {
        if (this.bj == null) {
            this.bb = j.cf();
            this.onChanged();
        } else {
            this.bj.setMessage((AbstractMessage)j.cf());
        }
        this.ba = 4;
        return this;
    }

    public f_0 b(h_0 h_02) {
        if (this.bj == null) {
            this.bb = this.ba == 4 && this.bb != h_0.cb() ? h_0.c((h_0)this.bb).e(h_02).cg() : h_02;
            this.onChanged();
        } else if (this.ba == 4) {
            this.bj.mergeFrom((AbstractMessage)h_02);
        } else {
            this.bj.setMessage((AbstractMessage)h_02);
        }
        this.ba = 4;
        return this;
    }

    public f_0 bR() {
        if (this.bj == null) {
            if (this.ba == 4) {
                this.ba = 0;
                this.bb = null;
                this.onChanged();
            }
        } else {
            if (this.ba == 4) {
                this.ba = 0;
                this.bb = null;
            }
            this.bj.clear();
        }
        return this;
    }

    public J bS() {
        return (J)this.bT().getBuilder();
    }

    @Override
    public k_0 bC() {
        if (this.ba == 4 && this.bj != null) {
            return (k_0)this.bj.getMessageOrBuilder();
        }
        if (this.ba == 4) {
            return (h_0)this.bb;
        }
        return h_0.cb();
    }

    private SingleFieldBuilderV3<h_0, J, k_0> bT() {
        if (this.bj == null) {
            if (this.ba != 4) {
                this.bb = h_0.cb();
            }
            this.bj = new SingleFieldBuilderV3((AbstractMessage)((h_0)this.bb), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.bb = null;
        }
        this.ba = 4;
        this.onChanged();
        return this.bj;
    }

    public final f_0 k(UnknownFieldSet unknownFieldSet) {
        return (f_0)super.setUnknownFields(unknownFieldSet);
    }

    public final f_0 l(UnknownFieldSet unknownFieldSet) {
        return (f_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.l(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.k(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.l(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.f(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.f(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.f(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.k(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.bJ();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.bM();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.l(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.r(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.f(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.bJ();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.f(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.bM();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.l(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.k(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.l(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.f(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.f(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.f(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.k(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.r(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.bM();
    }

    public /* synthetic */ Message buildPartial() {
        return this.bL();
    }

    public /* synthetic */ Message build() {
        return this.bK();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.f(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.bJ();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.r(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.bM();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.bL();
    }

    public /* synthetic */ MessageLite build() {
        return this.bK();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.bJ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.bH();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.bH();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.r(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.bM();
    }

    public /* synthetic */ Object clone() {
        return this.bM();
    }
}

