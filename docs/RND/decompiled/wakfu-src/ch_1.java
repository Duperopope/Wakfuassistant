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
 * Renamed from cH
 */
public final class ch_1
extends GeneratedMessageV3.Builder<ch_1>
implements ci_1 {
    private int an;
    private List<bw_2> ak = Collections.emptyList();
    private RepeatedFieldBuilderV3<bw_2, by_1, cj_2> ao;

    public static final Descriptors.Descriptor nD() {
        return ae_1.fy;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fz.ensureFieldAccessorsInitialized(cf_1.class, ch_1.class);
    }

    ch_1() {
        this.D();
    }

    ch_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (cf_1.nB()) {
            this.aB();
        }
    }

    public ch_1 nE() {
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
        return ae_1.fy;
    }

    public cf_1 nA() {
        return cf_1.nz();
    }

    public cf_1 nF() {
        cf_1 cf_12 = this.nG();
        if (!cf_12.isInitialized()) {
            throw ch_1.newUninitializedMessageException((Message)cf_12);
        }
        return cf_12;
    }

    public cf_1 nG() {
        cf_1 cf_12 = new cf_1(this);
        int n = this.an;
        if (this.ao == null) {
            if ((this.an & 1) != 0) {
                this.ak = Collections.unmodifiableList(this.ak);
                this.an &= 0xFFFFFFFE;
            }
            cf_12.ak = this.ak;
        } else {
            cf_12.ak = this.ao.build();
        }
        this.onBuilt();
        return cf_12;
    }

    public ch_1 nH() {
        return (ch_1)super.clone();
    }

    public ch_1 aG(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ch_1)super.setField(fieldDescriptor, object);
    }

    public ch_1 Q(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ch_1)super.clearField(fieldDescriptor);
    }

    public ch_1 Q(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ch_1)super.clearOneof(oneofDescriptor);
    }

    public ch_1 Q(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ch_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ch_1 aH(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ch_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ch_1 Q(Message message) {
        if (message instanceof cf_1) {
            return this.c((cf_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ch_1 c(cf_1 cf_12) {
        if (cf_12 == cf_1.nz()) {
            return this;
        }
        if (this.ao == null) {
            if (!cf_12.ak.isEmpty()) {
                if (this.ak.isEmpty()) {
                    this.ak = cf_12.ak;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.ax();
                    this.ak.addAll(cf_12.ak);
                }
                this.onChanged();
            }
        } else if (!cf_12.ak.isEmpty()) {
            if (this.ao.isEmpty()) {
                this.ao.dispose();
                this.ao = null;
                this.ak = cf_12.ak;
                this.an &= 0xFFFFFFFE;
                this.ao = cf_1.nC() ? this.aB() : null;
            } else {
                this.ao.addAllMessages(cf_12.ak);
            }
        }
        this.aH(cf_1.b(cf_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public ch_1 by(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        cf_1 cf_12 = null;
        try {
            cf_12 = (cf_1)cf_1.ix.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            cf_12 = (cf_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (cf_12 != null) {
                this.c(cf_12);
            }
        }
        return this;
    }

    private void ax() {
        if ((this.an & 1) == 0) {
            this.ak = new ArrayList<bw_2>(this.ak);
            this.an |= 1;
        }
    }

    @Override
    public List<bw_2> ai() {
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
    public bw_2 W(int n) {
        if (this.ao == null) {
            return this.ak.get(n);
        }
        return (bw_2)this.ao.getMessage(n);
    }

    public ch_1 a(int n, bw_2 bw_22) {
        if (this.ao == null) {
            if (bw_22 == null) {
                throw new NullPointerException();
            }
            this.ax();
            this.ak.set(n, bw_22);
            this.onChanged();
        } else {
            this.ao.setMessage(n, (AbstractMessage)bw_22);
        }
        return this;
    }

    public ch_1 a(int n, by_1 by_12) {
        if (this.ao == null) {
            this.ax();
            this.ak.set(n, by_12.kU());
            this.onChanged();
        } else {
            this.ao.setMessage(n, (AbstractMessage)by_12.kU());
        }
        return this;
    }

    public ch_1 n(bw_2 bw_22) {
        if (this.ao == null) {
            if (bw_22 == null) {
                throw new NullPointerException();
            }
            this.ax();
            this.ak.add(bw_22);
            this.onChanged();
        } else {
            this.ao.addMessage((AbstractMessage)bw_22);
        }
        return this;
    }

    public ch_1 b(int n, bw_2 bw_22) {
        if (this.ao == null) {
            if (bw_22 == null) {
                throw new NullPointerException();
            }
            this.ax();
            this.ak.add(n, bw_22);
            this.onChanged();
        } else {
            this.ao.addMessage(n, (AbstractMessage)bw_22);
        }
        return this;
    }

    public ch_1 f(by_1 by_12) {
        if (this.ao == null) {
            this.ax();
            this.ak.add(by_12.kU());
            this.onChanged();
        } else {
            this.ao.addMessage((AbstractMessage)by_12.kU());
        }
        return this;
    }

    public ch_1 b(int n, by_1 by_12) {
        if (this.ao == null) {
            this.ax();
            this.ak.add(n, by_12.kU());
            this.onChanged();
        } else {
            this.ao.addMessage(n, (AbstractMessage)by_12.kU());
        }
        return this;
    }

    public ch_1 g(Iterable<? extends bw_2> iterable) {
        if (this.ao == null) {
            this.ax();
            AbstractMessageLite.Builder.addAll(iterable, this.ak);
            this.onChanged();
        } else {
            this.ao.addAllMessages(iterable);
        }
        return this;
    }

    public ch_1 nI() {
        if (this.ao == null) {
            this.ak = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.ao.clear();
        }
        return this;
    }

    public ch_1 Y(int n) {
        if (this.ao == null) {
            this.ax();
            this.ak.remove(n);
            this.onChanged();
        } else {
            this.ao.remove(n);
        }
        return this;
    }

    public by_1 Z(int n) {
        return (by_1)this.aB().getBuilder(n);
    }

    @Override
    public cj_2 X(int n) {
        if (this.ao == null) {
            return this.ak.get(n);
        }
        return (cj_2)this.ao.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends cj_2> aj() {
        if (this.ao != null) {
            return this.ao.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.ak);
    }

    public by_1 nJ() {
        return (by_1)this.aB().addBuilder((AbstractMessage)bw_2.kP());
    }

    public by_1 aa(int n) {
        return (by_1)this.aB().addBuilder(n, (AbstractMessage)bw_2.kP());
    }

    public List<by_1> aA() {
        return this.aB().getBuilderList();
    }

    private RepeatedFieldBuilderV3<bw_2, by_1, cj_2> aB() {
        if (this.ao == null) {
            this.ao = new RepeatedFieldBuilderV3(this.ak, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.ak = null;
        }
        return this.ao;
    }

    public final ch_1 aG(UnknownFieldSet unknownFieldSet) {
        return (ch_1)super.setUnknownFields(unknownFieldSet);
    }

    public final ch_1 aH(UnknownFieldSet unknownFieldSet) {
        return (ch_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aH(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aG(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aH(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.Q(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.Q(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.Q(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aG(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.nE();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.nH();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aH(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.by(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.Q(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.nE();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.Q(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.nH();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aH(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aG(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aH(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.Q(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.Q(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.Q(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aG(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.by(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.nH();
    }

    public /* synthetic */ Message buildPartial() {
        return this.nG();
    }

    public /* synthetic */ Message build() {
        return this.nF();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.Q(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.nE();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.by(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.nH();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.nG();
    }

    public /* synthetic */ MessageLite build() {
        return this.nF();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.nE();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.nA();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.nA();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.by(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.nH();
    }

    public /* synthetic */ Object clone() {
        return this.nH();
    }
}

