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
 * Renamed from jH
 */
public final class jh_2
extends GeneratedMessageV3.Builder<jh_2>
implements ji_2 {
    private int an;
    private List<jc_2> jj = Collections.emptyList();
    private RepeatedFieldBuilderV3<jc_2, je_2, jj_2> jm;

    public static final Descriptors.Descriptor WH() {
        return jb_2.CG;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jb_2.CH.ensureFieldAccessorsInitialized(jf_2.class, jh_2.class);
    }

    jh_2() {
        this.D();
    }

    jh_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (jf_2.fa()) {
            this.oL();
        }
    }

    public jh_2 WI() {
        super.clear();
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.jm.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return jb_2.CG;
    }

    public jf_2 WG() {
        return jf_2.WF();
    }

    public jf_2 WJ() {
        jf_2 jf_22 = this.WK();
        if (!jf_22.isInitialized()) {
            throw jh_2.newUninitializedMessageException((Message)jf_22);
        }
        return jf_22;
    }

    public jf_2 WK() {
        jf_2 jf_22 = new jf_2(this);
        int n = this.an;
        if (this.jm == null) {
            if ((this.an & 1) != 0) {
                this.jj = Collections.unmodifiableList(this.jj);
                this.an &= 0xFFFFFFFE;
            }
            jf_22.jj = this.jj;
        } else {
            jf_22.jj = this.jm.build();
        }
        this.onBuilt();
        return jf_22;
    }

    public jh_2 WL() {
        return (jh_2)super.clone();
    }

    public jh_2 dE(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jh_2)super.setField(fieldDescriptor, object);
    }

    public jh_2 bp(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jh_2)super.clearField(fieldDescriptor);
    }

    public jh_2 bp(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jh_2)super.clearOneof(oneofDescriptor);
    }

    public jh_2 bp(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jh_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jh_2 dF(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jh_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public jh_2 bp(Message message) {
        if (message instanceof jf_2) {
            return this.c((jf_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jh_2 c(jf_2 jf_22) {
        if (jf_22 == jf_2.WF()) {
            return this;
        }
        if (this.jm == null) {
            if (!jf_22.jj.isEmpty()) {
                if (this.jj.isEmpty()) {
                    this.jj = jf_22.jj;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.oH();
                    this.jj.addAll(jf_22.jj);
                }
                this.onChanged();
            }
        } else if (!jf_22.jj.isEmpty()) {
            if (this.jm.isEmpty()) {
                this.jm.dispose();
                this.jm = null;
                this.jj = jf_22.jj;
                this.an &= 0xFFFFFFFE;
                this.jm = jf_2.oV() ? this.oL() : null;
            } else {
                this.jm.addAllMessages(jf_22.jj);
            }
        }
        this.dF(jf_2.b(jf_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.ov(); ++i) {
            if (this.fF(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public jh_2 fV(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jf_2 jf_22 = null;
        try {
            jf_22 = (jf_2)jf_2.CP.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jf_22 = (jf_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jf_22 != null) {
                this.c(jf_22);
            }
        }
        return this;
    }

    private void oH() {
        if ((this.an & 1) == 0) {
            this.jj = new ArrayList<jc_2>(this.jj);
            this.an |= 1;
        }
    }

    @Override
    public List<jc_2> ot() {
        if (this.jm == null) {
            return Collections.unmodifiableList(this.jj);
        }
        return this.jm.getMessageList();
    }

    @Override
    public int ov() {
        if (this.jm == null) {
            return this.jj.size();
        }
        return this.jm.getCount();
    }

    @Override
    public jc_2 fF(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (jc_2)this.jm.getMessage(n);
    }

    public jh_2 a(int n, jc_2 jc_22) {
        if (this.jm == null) {
            if (jc_22 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.set(n, jc_22);
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)jc_22);
        }
        return this;
    }

    public jh_2 a(int n, je_2 je_22) {
        if (this.jm == null) {
            this.oH();
            this.jj.set(n, je_22.Wx());
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)je_22.Wx());
        }
        return this;
    }

    public jh_2 d(jc_2 jc_22) {
        if (this.jm == null) {
            if (jc_22 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(jc_22);
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)jc_22);
        }
        return this;
    }

    public jh_2 b(int n, jc_2 jc_22) {
        if (this.jm == null) {
            if (jc_22 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(n, jc_22);
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)jc_22);
        }
        return this;
    }

    public jh_2 a(je_2 je_22) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(je_22.Wx());
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)je_22.Wx());
        }
        return this;
    }

    public jh_2 b(int n, je_2 je_22) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(n, je_22.Wx());
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)je_22.Wx());
        }
        return this;
    }

    public jh_2 M(Iterable<? extends jc_2> iterable) {
        if (this.jm == null) {
            this.oH();
            AbstractMessageLite.Builder.addAll(iterable, this.jj);
            this.onChanged();
        } else {
            this.jm.addAllMessages(iterable);
        }
        return this;
    }

    public jh_2 WM() {
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.jm.clear();
        }
        return this;
    }

    public jh_2 fH(int n) {
        if (this.jm == null) {
            this.oH();
            this.jj.remove(n);
            this.onChanged();
        } else {
            this.jm.remove(n);
        }
        return this;
    }

    public je_2 fI(int n) {
        return (je_2)this.oL().getBuilder(n);
    }

    @Override
    public jj_2 fG(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (jj_2)this.jm.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends jj_2> ou() {
        if (this.jm != null) {
            return this.jm.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.jj);
    }

    public je_2 WN() {
        return (je_2)this.oL().addBuilder((AbstractMessage)jc_2.Wt());
    }

    public je_2 fJ(int n) {
        return (je_2)this.oL().addBuilder(n, (AbstractMessage)jc_2.Wt());
    }

    public List<je_2> oK() {
        return this.oL().getBuilderList();
    }

    private RepeatedFieldBuilderV3<jc_2, je_2, jj_2> oL() {
        if (this.jm == null) {
            this.jm = new RepeatedFieldBuilderV3(this.jj, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.jj = null;
        }
        return this.jm;
    }

    public final jh_2 dE(UnknownFieldSet unknownFieldSet) {
        return (jh_2)super.setUnknownFields(unknownFieldSet);
    }

    public final jh_2 dF(UnknownFieldSet unknownFieldSet) {
        return (jh_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dF(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dE(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dF(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bp(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bp(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bp(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dE(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.WI();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.WL();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dF(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fV(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bp(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.WI();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bp(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.WL();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dF(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dE(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dF(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bp(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bp(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bp(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dE(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fV(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.WL();
    }

    public /* synthetic */ Message buildPartial() {
        return this.WK();
    }

    public /* synthetic */ Message build() {
        return this.WJ();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bp(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.WI();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fV(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.WL();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.WK();
    }

    public /* synthetic */ MessageLite build() {
        return this.WJ();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.WI();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.WG();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.WG();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fV(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.WL();
    }

    public /* synthetic */ Object clone() {
        return this.WL();
    }
}

