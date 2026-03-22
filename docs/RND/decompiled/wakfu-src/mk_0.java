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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from mK
 */
public final class mk_0
extends GeneratedMessageV3.Builder<mk_0>
implements ml_0 {
    private int an;
    private mk Kp;
    private SingleFieldBuilderV3<mk, mm_0, mn> Kv;
    private List<mE> Me = Collections.emptyList();
    private RepeatedFieldBuilderV3<mE, mg_0, mh_0> Mi;
    private long Ks;

    public static final Descriptors.Descriptor anD() {
        return md_0.Lw;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return md_0.Lx.ensureFieldAccessorsInitialized(mi_0.class, mk_0.class);
    }

    mk_0() {
        this.D();
    }

    mk_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (mi_0.aJ()) {
            this.akU();
            this.anN();
        }
    }

    public mk_0 anE() {
        super.clear();
        if (this.Kv == null) {
            this.Kp = null;
        } else {
            this.Kv.clear();
        }
        this.an &= 0xFFFFFFFE;
        if (this.Mi == null) {
            this.Me = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
        } else {
            this.Mi.clear();
        }
        this.Ks = 0L;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return md_0.Lw;
    }

    public mi_0 anC() {
        return mi_0.anB();
    }

    public mi_0 anF() {
        mi_0 mi_02 = this.anG();
        if (!mi_02.isInitialized()) {
            throw mk_0.newUninitializedMessageException((Message)mi_02);
        }
        return mi_02;
    }

    public mi_0 anG() {
        mi_0 mi_02 = new mi_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            mi_02.Kp = this.Kv == null ? this.Kp : (mk)this.Kv.build();
            n2 |= 1;
        }
        if (this.Mi == null) {
            if ((this.an & 2) != 0) {
                this.Me = Collections.unmodifiableList(this.Me);
                this.an &= 0xFFFFFFFD;
            }
            mi_02.Me = this.Me;
        } else {
            mi_02.Me = this.Mi.build();
        }
        if ((n & 4) != 0) {
            mi_02.Ks = this.Ks;
            n2 |= 2;
        }
        mi_02.an = n2;
        this.onBuilt();
        return mi_02;
    }

    public mk_0 anH() {
        return (mk_0)super.clone();
    }

    public mk_0 fa(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mk_0)super.setField(fieldDescriptor, object);
    }

    public mk_0 ca(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mk_0)super.clearField(fieldDescriptor);
    }

    public mk_0 ca(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mk_0)super.clearOneof(oneofDescriptor);
    }

    public mk_0 ca(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mk_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mk_0 fb(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mk_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public mk_0 ca(Message message) {
        if (message instanceof mi_0) {
            return this.c((mi_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mk_0 c(mi_0 mi_02) {
        if (mi_02 == mi_0.anB()) {
            return this;
        }
        if (mi_02.akD()) {
            this.i(mi_02.akE());
        }
        if (this.Mi == null) {
            if (!mi_02.Me.isEmpty()) {
                if (this.Me.isEmpty()) {
                    this.Me = mi_02.Me;
                    this.an &= 0xFFFFFFFD;
                } else {
                    this.anJ();
                    this.Me.addAll(mi_02.Me);
                }
                this.onChanged();
            }
        } else if (!mi_02.Me.isEmpty()) {
            if (this.Mi.isEmpty()) {
                this.Mi.dispose();
                this.Mi = null;
                this.Me = mi_02.Me;
                this.an &= 0xFFFFFFFD;
                this.Mi = mi_0.oB() ? this.anN() : null;
            } else {
                this.Mi.addAllMessages(mi_02.Me);
            }
        }
        if (mi_02.akG()) {
            this.br(mi_02.akH());
        }
        this.fb(mi_0.b(mi_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.akD()) {
            return false;
        }
        if (!this.akG()) {
            return false;
        }
        if (!this.akE().isInitialized()) {
            return false;
        }
        for (int i = 0; i < this.anx(); ++i) {
            if (this.iz(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public mk_0 ic(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mi_0 mi_02 = null;
        try {
            mi_02 = (mi_0)mi_0.Mh.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mi_02 = (mi_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mi_02 != null) {
                this.c(mi_02);
            }
        }
        return this;
    }

    @Override
    public boolean akD() {
        return (this.an & 1) != 0;
    }

    @Override
    public mk akE() {
        if (this.Kv == null) {
            return this.Kp == null ? mk.ale() : this.Kp;
        }
        return (mk)this.Kv.getMessage();
    }

    public mk_0 h(mk mk2) {
        if (this.Kv == null) {
            if (mk2 == null) {
                throw new NullPointerException();
            }
            this.Kp = mk2;
            this.onChanged();
        } else {
            this.Kv.setMessage((AbstractMessage)mk2);
        }
        this.an |= 1;
        return this;
    }

    public mk_0 c(mm_0 mm_02) {
        if (this.Kv == null) {
            this.Kp = mm_02.ali();
            this.onChanged();
        } else {
            this.Kv.setMessage((AbstractMessage)mm_02.ali());
        }
        this.an |= 1;
        return this;
    }

    public mk_0 i(mk mk2) {
        if (this.Kv == null) {
            this.Kp = (this.an & 1) != 0 && this.Kp != null && this.Kp != mk.ale() ? mk.c(this.Kp).e(mk2).alj() : mk2;
            this.onChanged();
        } else {
            this.Kv.mergeFrom((AbstractMessage)mk2);
        }
        this.an |= 1;
        return this;
    }

    public mk_0 anI() {
        if (this.Kv == null) {
            this.Kp = null;
            this.onChanged();
        } else {
            this.Kv.clear();
        }
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public mm_0 akT() {
        this.an |= 1;
        this.onChanged();
        return (mm_0)this.akU().getBuilder();
    }

    @Override
    public mn akF() {
        if (this.Kv != null) {
            return (mn)this.Kv.getMessageOrBuilder();
        }
        return this.Kp == null ? mk.ale() : this.Kp;
    }

    private SingleFieldBuilderV3<mk, mm_0, mn> akU() {
        if (this.Kv == null) {
            this.Kv = new SingleFieldBuilderV3((AbstractMessage)this.akE(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Kp = null;
        }
        return this.Kv;
    }

    private void anJ() {
        if ((this.an & 2) == 0) {
            this.Me = new ArrayList<mE>(this.Me);
            this.an |= 2;
        }
    }

    @Override
    public List<mE> anv() {
        if (this.Mi == null) {
            return Collections.unmodifiableList(this.Me);
        }
        return this.Mi.getMessageList();
    }

    @Override
    public int anx() {
        if (this.Mi == null) {
            return this.Me.size();
        }
        return this.Mi.getCount();
    }

    @Override
    public mE iz(int n) {
        if (this.Mi == null) {
            return this.Me.get(n);
        }
        return (mE)this.Mi.getMessage(n);
    }

    public mk_0 a(int n, mE mE2) {
        if (this.Mi == null) {
            if (mE2 == null) {
                throw new NullPointerException();
            }
            this.anJ();
            this.Me.set(n, mE2);
            this.onChanged();
        } else {
            this.Mi.setMessage(n, (AbstractMessage)mE2);
        }
        return this;
    }

    public mk_0 a(int n, mg_0 mg_02) {
        if (this.Mi == null) {
            this.anJ();
            this.Me.set(n, mg_02.anb());
            this.onChanged();
        } else {
            this.Mi.setMessage(n, (AbstractMessage)mg_02.anb());
        }
        return this;
    }

    public mk_0 d(mE mE2) {
        if (this.Mi == null) {
            if (mE2 == null) {
                throw new NullPointerException();
            }
            this.anJ();
            this.Me.add(mE2);
            this.onChanged();
        } else {
            this.Mi.addMessage((AbstractMessage)mE2);
        }
        return this;
    }

    public mk_0 b(int n, mE mE2) {
        if (this.Mi == null) {
            if (mE2 == null) {
                throw new NullPointerException();
            }
            this.anJ();
            this.Me.add(n, mE2);
            this.onChanged();
        } else {
            this.Mi.addMessage(n, (AbstractMessage)mE2);
        }
        return this;
    }

    public mk_0 a(mg_0 mg_02) {
        if (this.Mi == null) {
            this.anJ();
            this.Me.add(mg_02.anb());
            this.onChanged();
        } else {
            this.Mi.addMessage((AbstractMessage)mg_02.anb());
        }
        return this;
    }

    public mk_0 b(int n, mg_0 mg_02) {
        if (this.Mi == null) {
            this.anJ();
            this.Me.add(n, mg_02.anb());
            this.onChanged();
        } else {
            this.Mi.addMessage(n, (AbstractMessage)mg_02.anb());
        }
        return this;
    }

    public mk_0 ah(Iterable<? extends mE> iterable) {
        if (this.Mi == null) {
            this.anJ();
            AbstractMessageLite.Builder.addAll(iterable, this.Me);
            this.onChanged();
        } else {
            this.Mi.addAllMessages(iterable);
        }
        return this;
    }

    public mk_0 anK() {
        if (this.Mi == null) {
            this.Me = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.Mi.clear();
        }
        return this;
    }

    public mk_0 iB(int n) {
        if (this.Mi == null) {
            this.anJ();
            this.Me.remove(n);
            this.onChanged();
        } else {
            this.Mi.remove(n);
        }
        return this;
    }

    public mg_0 iC(int n) {
        return (mg_0)this.anN().getBuilder(n);
    }

    @Override
    public mh_0 iA(int n) {
        if (this.Mi == null) {
            return this.Me.get(n);
        }
        return (mh_0)this.Mi.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends mh_0> anw() {
        if (this.Mi != null) {
            return this.Mi.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.Me);
    }

    public mg_0 anL() {
        return (mg_0)this.anN().addBuilder((AbstractMessage)mE.amW());
    }

    public mg_0 iD(int n) {
        return (mg_0)this.anN().addBuilder(n, (AbstractMessage)mE.amW());
    }

    public List<mg_0> anM() {
        return this.anN().getBuilderList();
    }

    private RepeatedFieldBuilderV3<mE, mg_0, mh_0> anN() {
        if (this.Mi == null) {
            this.Mi = new RepeatedFieldBuilderV3(this.Me, (this.an & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Me = null;
        }
        return this.Mi;
    }

    @Override
    public boolean akG() {
        return (this.an & 4) != 0;
    }

    @Override
    public long akH() {
        return this.Ks;
    }

    public mk_0 br(long l) {
        this.an |= 4;
        this.Ks = l;
        this.onChanged();
        return this;
    }

    public mk_0 anO() {
        this.an &= 0xFFFFFFFB;
        this.Ks = 0L;
        this.onChanged();
        return this;
    }

    public final mk_0 fa(UnknownFieldSet unknownFieldSet) {
        return (mk_0)super.setUnknownFields(unknownFieldSet);
    }

    public final mk_0 fb(UnknownFieldSet unknownFieldSet) {
        return (mk_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fb(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fa(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fb(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ca(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ca(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ca(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fa(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.anE();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.anH();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fb(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ic(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ca(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.anE();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ca(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.anH();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fb(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fa(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fb(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ca(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ca(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ca(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fa(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ic(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.anH();
    }

    public /* synthetic */ Message buildPartial() {
        return this.anG();
    }

    public /* synthetic */ Message build() {
        return this.anF();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ca(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.anE();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ic(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.anH();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.anG();
    }

    public /* synthetic */ MessageLite build() {
        return this.anF();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.anE();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.anC();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.anC();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ic(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.anH();
    }

    public /* synthetic */ Object clone() {
        return this.anH();
    }
}

