/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from af
 */
public final class af_1
extends GeneratedMessageV3.Builder<af_1>
implements ag_2 {
    private int an;
    private List<S> ak = Collections.emptyList();
    private RepeatedFieldBuilderV3<S, u_0, ah_2> ao;

    public static final Descriptors.Descriptor dN() {
        return c_0.aX;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return c_0.aY.ensureFieldAccessorsInitialized(ad_1.class, af_1.class);
    }

    af_1() {
        this.D();
    }

    af_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ad_1.dM()) {
            this.aB();
        }
    }

    public af_1 dO() {
        super.clear();
        if (this.ao == null) {
            this.ak = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.ao.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return c_0.aX;
    }

    public ad_1 dL() {
        return ad_1.dK();
    }

    public ad_1 dP() {
        ad_1 ad_12 = this.dQ();
        if (!ad_12.isInitialized()) {
            throw af_1.newUninitializedMessageException((Message)ad_12);
        }
        return ad_12;
    }

    public ad_1 dQ() {
        ad_1 ad_12 = new ad_1(this);
        int n = this.an;
        if (this.ao == null) {
            if ((this.an & 1) != 0) {
                this.ak = Collections.unmodifiableList(this.ak);
                this.an &= 0xFFFFFFFE;
            }
            ad_12.ak = this.ak;
        } else {
            ad_12.ak = this.ao.build();
        }
        this.onBuilt();
        return ad_12;
    }

    public af_1 dR() {
        return (af_1)super.clone();
    }

    public af_1 w(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (af_1)super.setField(fieldDescriptor, object);
    }

    public af_1 l(Descriptors.FieldDescriptor fieldDescriptor) {
        return (af_1)super.clearField(fieldDescriptor);
    }

    public af_1 l(Descriptors.OneofDescriptor oneofDescriptor) {
        return (af_1)super.clearOneof(oneofDescriptor);
    }

    public af_1 l(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (af_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public af_1 x(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (af_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public af_1 l(Message message) {
        if (message instanceof ad_1) {
            return this.c((ad_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public af_1 c(ad_1 ad_12) {
        if (ad_12 == ad_1.dK()) {
            return this;
        }
        if (this.ao == null) {
            if (!ad_12.ak.isEmpty()) {
                if (this.ak.isEmpty()) {
                    this.ak = ad_12.ak;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.ax();
                    this.ak.addAll(ad_12.ak);
                }
                this.onChanged();
            }
        } else if (!ad_12.ak.isEmpty()) {
            if (this.ao.isEmpty()) {
                this.ao.dispose();
                this.ao = null;
                this.ak = ad_12.ak;
                this.an &= 0xFFFFFFFE;
                this.ao = ad_1.aq() ? this.aB() : null;
            } else {
                this.ao.addAllMessages(ad_12.ak);
            }
        }
        this.x(ad_1.b(ad_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public af_1 J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ad_1 ad_12 = null;
        try {
            ad_12 = (ad_1)ad_1.cn.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ad_12 = (ad_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ad_12 != null) {
                this.c(ad_12);
            }
        }
        return this;
    }

    private void ax() {
        if ((this.an & 1) == 0) {
            this.ak = new ArrayList<S>(this.ak);
            this.an |= 1;
        }
    }

    @Override
    public List<S> ai() {
        if (this.ao == null) {
            return Collections.unmodifiableList(this.ak);
        }
        return this.ao.getMessageList();
    }

    @Override
    public int ak() {
        if (this.ao == null) {
            return this.ak.size();
        }
        return this.ao.getCount();
    }

    @Override
    public S p(int n) {
        if (this.ao == null) {
            return this.ak.get(n);
        }
        return (S)this.ao.getMessage(n);
    }

    public af_1 a(int n, S s) {
        if (this.ao == null) {
            if (s == null) {
                throw new NullPointerException();
            }
            this.ax();
            this.ak.set(n, s);
            this.onChanged();
        } else {
            this.ao.setMessage(n, (AbstractMessage)s);
        }
        return this;
    }

    public af_1 a(int n, u_0 u_02) {
        if (this.ao == null) {
            this.ax();
            this.ak.set(n, u_02.cT());
            this.onChanged();
        } else {
            this.ao.setMessage(n, (AbstractMessage)u_02.cT());
        }
        return this;
    }

    public af_1 h(S s) {
        if (this.ao == null) {
            if (s == null) {
                throw new NullPointerException();
            }
            this.ax();
            this.ak.add(s);
            this.onChanged();
        } else {
            this.ao.addMessage((AbstractMessage)s);
        }
        return this;
    }

    public af_1 b(int n, S s) {
        if (this.ao == null) {
            if (s == null) {
                throw new NullPointerException();
            }
            this.ax();
            this.ak.add(n, s);
            this.onChanged();
        } else {
            this.ao.addMessage(n, (AbstractMessage)s);
        }
        return this;
    }

    public af_1 c(u_0 u_02) {
        if (this.ao == null) {
            this.ax();
            this.ak.add(u_02.cT());
            this.onChanged();
        } else {
            this.ao.addMessage((AbstractMessage)u_02.cT());
        }
        return this;
    }

    public af_1 b(int n, u_0 u_02) {
        if (this.ao == null) {
            this.ax();
            this.ak.add(n, u_02.cT());
            this.onChanged();
        } else {
            this.ao.addMessage(n, (AbstractMessage)u_02.cT());
        }
        return this;
    }

    public af_1 b(Iterable<? extends S> iterable) {
        if (this.ao == null) {
            this.ax();
            AbstractMessageLite.Builder.addAll(iterable, this.ak);
            this.onChanged();
        } else {
            this.ao.addAllMessages(iterable);
        }
        return this;
    }

    public af_1 dS() {
        if (this.ao == null) {
            this.ak = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.ao.clear();
        }
        return this;
    }

    public af_1 r(int n) {
        if (this.ao == null) {
            this.ax();
            this.ak.remove(n);
            this.onChanged();
        } else {
            this.ao.remove(n);
        }
        return this;
    }

    public u_0 s(int n) {
        return (u_0)this.aB().getBuilder(n);
    }

    @Override
    public ah_2 q(int n) {
        if (this.ao == null) {
            return this.ak.get(n);
        }
        return (ah_2)this.ao.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends ah_2> aj() {
        if (this.ao != null) {
            return this.ao.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.ak);
    }

    public u_0 dT() {
        return (u_0)this.aB().addBuilder((AbstractMessage)S.cO());
    }

    public u_0 t(int n) {
        return (u_0)this.aB().addBuilder(n, (AbstractMessage)S.cO());
    }

    public List<u_0> aA() {
        return this.aB().getBuilderList();
    }

    private RepeatedFieldBuilderV3<S, u_0, ah_2> aB() {
        if (this.ao == null) {
            this.ao = new RepeatedFieldBuilderV3(this.ak, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.ak = null;
        }
        return this.ao;
    }

    public final af_1 w(UnknownFieldSet unknownFieldSet) {
        return (af_1)super.setUnknownFields(unknownFieldSet);
    }

    public final af_1 x(UnknownFieldSet unknownFieldSet) {
        return (af_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.x(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.w(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.x(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.l(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.l(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.l(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.w(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.dO();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.dR();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.x(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.J(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.l(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.dO();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.l(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.dR();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.x(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.w(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.x(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.l(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.l(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.l(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.w(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.J(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.dR();
    }

    public /* synthetic */ Message buildPartial() {
        return this.dQ();
    }

    public /* synthetic */ Message build() {
        return this.dP();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.l(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.dO();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.J(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.dR();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.dQ();
    }

    public /* synthetic */ MessageLite build() {
        return this.dP();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.dO();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.dL();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.dL();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.J(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.dR();
    }

    public /* synthetic */ Object clone() {
        return this.dR();
    }
}

